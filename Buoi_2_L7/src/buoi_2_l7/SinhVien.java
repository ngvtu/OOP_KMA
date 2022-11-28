/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_2_l7;

import java.util.Scanner;


public class SinhVien {
    private String masv;
    private String hoten;
    private double diemLT;
    private double diemTH;
    
    public SinhVien(){
    }

    public SinhVien(String masv, String hoten, double diemLT, double diemTH) {
        this.masv = masv;
        this.hoten = hoten;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }
    
    
    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma sinh vien:");
        masv=sc.nextLine();
        System.out.println("Nhap ho ten sinh vien:");
        hoten=sc.nextLine();
        System.out.println("Nhap diem li thuyet:");
        diemLT=sc.nextDouble();
        System.out.println("Nhap diem thuc hanh:");
        diemTH=sc.nextDouble();
    }
    
    public double tong(){
        return (diemLT +diemTH)/2;
    }
    
    public void hien(){
        System.out.printf("|%-10s|%-20s|%-10f|%-10f|%-10f|",masv,hoten,diemLT,diemTH,tong());
    }
    
    

    
    
}
