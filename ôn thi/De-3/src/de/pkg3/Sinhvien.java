/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.pkg3;

import java.io.Serializable;

/**
 *
 * @author DELL 3520
 */
public class Sinhvien {
    protected String hoTen;
    private String maSV;
    protected double diemhp;
    protected double diemqt;
    

    public Sinhvien() {
    }

    public Sinhvien(String hoTen, String maSV, double diemhp, double diemqt) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.diemhp = diemhp;
        this.diemqt = diemqt;
        
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiemhp() {
        return diemhp;
    }

    public void setDiemhp(double diemhp) {
        this.diemhp = diemhp;
    }

    public double getDiemqt() {
        return diemqt;
    }

    public void setDiemqt(double diemqt) {
        this.diemqt = diemqt;
    }

    public double diemTB(){
        return diemhp*0.7+diemqt*0.3;
    }

    public void hien(){
        System.out.println("Ho ten:"+hoTen);
        System.out.println("Ma SV"+maSV);
        System.out.println("Diem hp"+diemhp);
        System.out.println("Diem qt:"+diemqt);
        System.out.println("Diem tb:"+diemTB());
    }

    
    
            
}
