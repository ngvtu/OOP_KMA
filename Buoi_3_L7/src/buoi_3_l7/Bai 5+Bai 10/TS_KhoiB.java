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
public class TS_KhoiB extends ThiSinh{
    private double diemT;
    private double diemH;
    private double diemS;
    private int n;
    public TS_KhoiB() {
    }

    public TS_KhoiB(double diemT, double diemH, double diemS) {
        this.diemT = diemT;
        this.diemH = diemH;
        this.diemS = diemS;
    }

    public double getDiemT() {
        return diemT;
    }

    public void setDiemT(double diemT) {
        this.diemT = diemT;
    }

    public double getDiemH() {
        return diemH;
    }

    public void setDiemH(double diemH) {
        this.diemH = diemH;
    }

    public double getDiemS() {
        return diemS;
    }

    public void setDiemS(double diemS) {
        this.diemS = diemS;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap diem toan:");
        setDiemT(sc.nextDouble());
        System.out.println("Nhap diem hoa:");
        setDiemH(sc.nextDouble());
        System.out.println("Nhap diem sinh:");
        setDiemS(sc.nextDouble());     
        
    }
    
    @Override
    public void hien(){
        super.hien();
        System.out.println("Diem toan:"+getDiemT());
        System.out.println("Diem hoa:"+getDiemH());
        System.out.println("Diem sinh:"+getDiemS());
        
    }
}
