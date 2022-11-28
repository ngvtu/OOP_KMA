/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_3_l7;

import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class PhanSo_9 {
    private int tu;
    private int mau;

    public PhanSo_9() {
    }

    public PhanSo_9(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap tu so:");
        tu=sc.nextInt();
        System.out.println("Nhap mau so:");
        mau=sc.nextInt();
    }
    
    public void hien(){
        System.out.println("Phan so co dang: "+ getTu()+"/"+ getMau());
    }
    
    public static int UCLN(int a, int b)
    {
        if(a==0||b==0){
            return a+b;
        }
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }
    
    public void toiGianPhanSo() {
        int i = UCLN(tu, mau);
        this.setTu(tu / i);
        this.setMau(mau / i);
    }
    
    public void congPhanSo(PhanSo_9 ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PhanSo_9 phanSoTong = new PhanSo_9(ts, ms);
        phanSoTong.toiGianPhanSo();
        System.out.println("Tổng hai phân số = " + phanSoTong.tu + "/" + phanSoTong.mau);
    }
      
    public void truPhanSo(PhanSo_9 ps) {
        int ts,ms;
        if((this.getTu()*ps.getMau())>(ps.getTu() * this.getMau()))
        {
            ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        }else
        {
            ts = -(this.getTu() * ps.getMau() - ps.getTu() * this.getMau());
        }
        ms = this.getMau() * ps.getMau();
        PhanSo_9 phanSoHieu = new PhanSo_9(ts, ms);
        phanSoHieu.toiGianPhanSo();
        if((this.getTu()*ps.getMau())>(ps.getTu() * this.getMau())){
            System.out.println("Hiệu hai phân số = " + phanSoHieu.tu + "/" + phanSoHieu.mau);
        }else{
            System.out.println("Hiệu hai phân số = " +"-"+ phanSoHieu.tu + "/" + phanSoHieu.mau);
        }
        
    }
     
    public void nhanPhanSo(PhanSo_9 ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        PhanSo_9 phanSoTich = new PhanSo_9(ts, ms);
        phanSoTich.toiGianPhanSo();
        System.out.println("Tích hai phân số = " + phanSoTich.tu + "/" + phanSoTich.mau);
    }
     
    public void chiaPhanSo(PhanSo_9 ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        PhanSo_9 phanSoThuong = new PhanSo_9(ts, ms);
        phanSoThuong.toiGianPhanSo();
        System.out.println("Thương hai phân số = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
    }
    
    public void ktratg(){
        if(getTu()% (UCLN(getTu(),getMau()))==0){
            System.out.println("Phan so chua toi gian");
        }
        else{
            System.out.println("Phan so da toi gian");
        }
    }

    
}

