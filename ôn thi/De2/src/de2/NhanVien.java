/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de2;

/**
 *
 * @author DELL 3520
 */
public class NhanVien extends Person{
    private String phongBan;
    private int hsl;
    private int thamnien;
    private float luongcb;

    public NhanVien() {
    }

    public NhanVien(String phongBan, int hsl, int thamnien, float luongcb) {
        this.phongBan = phongBan;
        this.hsl = hsl;
        this.thamnien = thamnien;
        this.luongcb = luongcb;
    }

    public NhanVien(String phongBan, int hsl, int thamnien, float luongcb, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.hsl = hsl;
        this.thamnien = thamnien;
        this.luongcb = luongcb;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public int getHsl() {
        return hsl;
    }

    public void setHsl(int hsl) {
        this.hsl = hsl;
    }

    public int getThamnien() {
        return thamnien;
    }

    public void setThamnien(int thamnien) {
        this.thamnien = thamnien;
    }

    public float getLuongcb() {
        return luongcb;
    }

    public void setLuongcb(float luongcb) {
        this.luongcb = luongcb;
    }
    
    public float luongthuc(){
        return luongcb * hsl*(1+thamnien/100);
        
    }

    @Override
    public String toString() {
        return "NhanVien{" + "phongBan=" + phongBan + ", hsl=" + hsl + ", thamnien=" + thamnien + ", luongcb=" + luongcb + "luongthuc"+luongthuc()+ '}';
    }

    
}
