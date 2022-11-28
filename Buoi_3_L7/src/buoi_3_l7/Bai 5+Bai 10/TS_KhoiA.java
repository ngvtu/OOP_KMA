/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_3_l7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class TS_KhoiA extends ThiSinh{
    private double diemT;
    private double diemL;
    private double diemH;
    private int n;

    public TS_KhoiA() {
    }

    public TS_KhoiA(double diemT, double diemL, double diemH) {
        this.diemT = diemT;
        this.diemL = diemL;
        this.diemH = diemH;
    }

    public double getDiemT() {
        return diemT;
    }

    public void setDiemT(double diemT) {
        this.diemT = diemT;
    }

    public double getDiemL() {
        return diemL;
    }

    public void setDiemL(double diemL) {
        this.diemL = diemL;
    }

    public double getDiemH() {
        return diemH;
    }

    public void setDiemH(double diemH) {
        this.diemH = diemH;
    }

    
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap diem toan:");
        setDiemT(sc.nextDouble());
        System.out.println("Nhap diem ly:");
        setDiemL(sc.nextDouble());
        System.out.println("Nhap diem hoa:");
        setDiemH(sc.nextDouble());
        
    }
    
    @Override
    public void hien(){
        super.hien();
        System.out.println("Diem toan:"+getDiemT());
        System.out.println("Diem ly:"+getDiemL());
        System.out.println("Diem hoa:"+getDiemH());
        
    }

    
}
