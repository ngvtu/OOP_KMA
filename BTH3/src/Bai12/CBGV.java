/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class CBGV extends Nguoi{
    protected double luongcung;
    protected double thuong;
    protected double phat;
    protected double luongthuc;

    public CBGV() {
    }


    public CBGV(double luongcung, double thuong, double phat, double luongthuc, String hoTen, int nam, String que) {
        super(hoTen, nam, que);
        this.luongcung = luongcung;
        this.thuong = thuong;
        this.phat = phat;
        this.luongthuc = luongthuc;
    }

    public double getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(double luongcung) {
        this.luongcung = luongcung;
    }

    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }

    public double getPhat() {
        return phat;
    }

    public void setPhat(double phat) {
        this.phat = phat;
    }

    public double getLuongthuc() {
        return luongthuc;
    }

    public void setLuongthuc(double luongthuc) {
        this.luongthuc = luongthuc;
    }
    
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap luong cung:");
        setLuongcung(sc.nextDouble());
        System.out.println("Nhap tien thuong");
        setThuong(sc.nextDouble());
        System.out.println("Nhap tien phat:");
        setPhat(sc.nextDouble());
        
    }
    
    @Override
    public void hien(){
        super.hien();
        System.out.println("Luong thuc:"+(getLuongcung()+getThuong()-getPhat()));
    }
    
}
