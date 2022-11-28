/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_3_l7;

import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class ThiSinh {
    private String sbd;
    private String hoTen;
    private String diaChi;
    private String uuTien;

    public ThiSinh() {
    }

    public ThiSinh(String sbd, String hoTen, String diaChi, String uuTien) {
        this.sbd = sbd;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
    }

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getUuTien() {
        return uuTien;
    }

    public void setUuTien(String uuTien) {
        this.uuTien = uuTien;
    }
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so bao danh:");
        
        setSbd(sc.nextLine());
        System.out.println("Nhap ho ten:");
        
        setHoTen(sc.nextLine());
        System.out.println("Nhap dia chi:");
        
        setDiaChi(sc.nextLine());
        System.out.println("Nhap uu tien:");
        
        setUuTien(sc.nextLine());
    }
    
    public void hien(){
        System.out.println("SBD:"+getSbd());
        System.out.println("Ho ten:"+getHoTen());
        System.out.println("Dia Chi:"+getDiaChi());
        System.out.println("Uu tien:"+getUuTien());
    }
}
