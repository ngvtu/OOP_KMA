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
public class Thi_sinh {
    private String MaTS;
    private String Hoten;
    private double diemT;
    private double diemL;
    private double diemH;

    
    public Thi_sinh(){
        
    }

    public Thi_sinh(String MaTS, String Hoten, double diemT, double diemL, double diemH) {
        this.MaTS = MaTS;
        this.Hoten = Hoten;
        this.diemT = diemT;
        this.diemL = diemL;
        this.diemH = diemH;
    }

    

    public String getMaTS() {
        return MaTS;
    }

    public void setMaTS(String MaTS) {
        this.MaTS = MaTS;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
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
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma thi sinh:");
        MaTS=sc.nextLine();
        System.out.println("Nhap ho ten thi sinh:");
        Hoten=sc.nextLine();
        System.out.println("Nhap diem toan:");
        diemT=sc.nextDouble();
        System.out.println("Nhap diem ly:");
        diemL=sc.nextDouble();
        System.out.println("Nhap diem hoa:");
        diemH=sc.nextDouble();
    }
    
    public void hienThi(){
        System.out.println("");
        System.out.println("Ma thi sinh:"+MaTS);
        System.out.println("Ho ten:"+Hoten);
        System.out.println("Diem toan:"+diemT);
        System.out.println("Diem ly:"+diemL);
        System.out.println("Diem hoa:"+diemH);
        System.out.println("Tong diem:"+tongdiem());
    }
    
    public double tongdiem(){
        return diemT+diemL+diemH;
    }
    
    
}
