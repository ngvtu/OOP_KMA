/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_7;

import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class TS_C extends ThiSinh{
    private double diemV;
    private double diemS;
    private double diemD;

    public TS_C() {
    }

    public TS_C(double diemV, double diemS, double diemD) {
        this.diemV = diemV;
        this.diemS = diemS;
        this.diemD = diemD;
    }

    public TS_C(double diemV, double diemS, double diemD, String hoTen, String ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.diemV = diemV;
        this.diemS = diemS;
        this.diemD = diemD;
    }

    public double getDiemV() {
        return diemV;
    }

    public void setDiemV(double diemV) {
        this.diemV = diemV;
    }

    public double getDiemS() {
        return diemS;
    }

    public void setDiemS(double diemS) {
        this.diemS = diemS;
    }

    public double getDiemD() {
        return diemD;
    }

    public void setDiemD(double diemD) {
        this.diemD = diemD;
    }

    @Override
    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap diem van");
        setDiemV(sc.nextDouble());
        System.out.println("Nhap diem su");
        setDiemS(sc.nextDouble());
        System.out.println("Nhap diem dia");
        setDiemD(sc.nextDouble());
    }
    @Override
        public void hien(){
            System.out.println("");
            System.out.println("Thông tin thi sinh khoi C");
            super.hien();
            System.out.println("diemV=" + diemV + ", diemS=" + diemS + ", diemD=" + diemD);
    }
    
    public double tong(){
        return diemV+diemS+diemD;
    }
            
}
