/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_2_l7;

import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class Phan_so {
    private int tu;
    private int mau;
    public Phan_so(){
        
    }

    public Phan_so(int tu, int mau) {
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
    
    public void congPhanSo(Phan_so ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        Phan_so phanSoTong = new Phan_so(ts, ms);
        phanSoTong.toiGianPhanSo();
        System.out.println("Tổng hai phân số = " + phanSoTong.tu + "/" + phanSoTong.mau);
    }
      
    public void truPhanSo(Phan_so ps) {
        int ts,ms;
        if((this.getTu()*ps.getMau())>(ps.getTu() * this.getMau()))
        {
            ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        }else
        {
            ts = -(this.getTu() * ps.getMau() - ps.getTu() * this.getMau());
        }
        ms = this.getMau() * ps.getMau();
        Phan_so phanSoHieu = new Phan_so(ts, ms);
        phanSoHieu.toiGianPhanSo();
        if((this.getTu()*ps.getMau())>(ps.getTu() * this.getMau())){
            System.out.println("Hiệu hai phân số = " + phanSoHieu.tu + "/" + phanSoHieu.mau);
        }else{
            System.out.println("Hiệu hai phân số = " +"-"+ phanSoHieu.tu + "/" + phanSoHieu.mau);
        }
        
    }
     
    public void nhanPhanSo(Phan_so ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        Phan_so phanSoTich = new Phan_so(ts, ms);
        phanSoTich.toiGianPhanSo();
        System.out.println("Tích hai phân số = " + phanSoTich.tu + "/" + phanSoTich.mau);
    }
     
    public void chiaPhanSo(Phan_so ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        Phan_so phanSoThuong = new Phan_so(ts, ms);
        phanSoThuong.toiGianPhanSo();
        System.out.println("Thương hai phân số = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
    }
}
