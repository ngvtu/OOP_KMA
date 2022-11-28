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
public class HCN {
    private double chieudai;
    private double chieurong;
    private double dientich;
    private double chuvi;
    
    public HCN(){
        
    }

    public HCN(double chieudai, double chieurong, double dientich, double chuvi) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
        this.dientich = dientich;
        this.chuvi = chuvi;
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }

    public double getDientich() {
        return dientich;
    }

    public void setDientich(double dientich) {
        this.dientich = dientich;
    }

    public double getChuvi() {
        return chuvi;
    }

    public void setChuvi(double chuvi) {
        this.chuvi = chuvi;
    }

    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chieu dai:");
        chieudai=sc.nextDouble();
        System.out.println("Nhap chieu rong:");
        chieurong=sc.nextDouble();
    }
    
    public double dientich(){
        dientich=chieudai*chieurong;
        return dientich;
    }
    public double chuvi(){
        chuvi=(chieudai +chieurong)*2;
        return chuvi;
    }

    @Override
    public String toString() {
        return "HCN{" + "chieudai=" + chieudai + ", chieurong=" + chieurong + ", dientich=" + dientich + ", chuvi=" + chuvi + '}';
    }

    
    
    
    
    
}
