/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai10;

import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class TS_KhoiC extends ThiSinh{
     private double diemV;
    private double diemS;
    private double diemD;
    private int n;

    public TS_KhoiC() {
    }

    public TS_KhoiC(double diemV, double diemS, double diemD) {
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
        System.out.println("Nhap diem van:");
        setDiemV(sc.nextDouble());
        System.out.println("Nhap diem su:");
        setDiemS(sc.nextDouble());
        System.out.println("Nhap diem dia:");
        setDiemD(sc.nextDouble());      
        
    }
    
    @Override
    public void hien(){
        super.hien();
        System.out.println("Diem van:"+getDiemV());
        System.out.println("Diem su:"+getDiemS());
        System.out.println("Diem dia:"+getDiemD());       
    }
}
