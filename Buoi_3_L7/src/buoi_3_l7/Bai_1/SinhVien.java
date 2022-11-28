/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_3_l7.Bai_1;

import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class SinhVien extends Person  {
    private String maSV;
    private double diemTB;

    public SinhVien() {
    }

    public SinhVien(String maSV, double diemTB) {
        this.maSV = maSV;
        this.diemTB = diemTB;
    }

    public SinhVien(String maSV, double diemTB, String hoTen, int namSinh) {
        super(hoTen, namSinh);
        this.maSV = maSV;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
    
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma sinh vien:");
        maSV=sc.nextLine();
        System.out.println("Nhap diem trung binh:");
        diemTB=sc.nextDouble();
    }
    
    @Override
    public void hien(){
       super.hien();
        System.out.printf("%-10s %-10f",maSV,diemTB);
    }

    
    
    public enum type{
        XuatSac, Gioi, Kha, Tb, Yeu;
    }
    
    public type xepLoai(){
        if(diemTB>=9){
            type t=type.XuatSac;
            return t;
        }
        if(diemTB>=8 && diemTB<9){
            type t=type.Gioi;
            return t;
        }
        if(diemTB>=7 && diemTB<8){
            type t=type.Kha;
            return t;
        }
        if(diemTB>=5 && diemTB<7){
            type t=type.Tb;
            return t;
        }
        if(diemTB>=0 && diemTB<5){
            type t=type.Yeu;
            return t;
        }
        return null;
    }
        
}
