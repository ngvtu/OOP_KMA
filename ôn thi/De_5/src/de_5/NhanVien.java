/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_5;

/**
 *
 * @author DELL 3520
 */
public class NhanVien extends Person{
    private String maNV;
    private double heso;
    private String dvi;

    public NhanVien() {
    }

    public NhanVien(String maNV, double heso, String dvi) {
        this.maNV = maNV;
        this.heso = heso;
        this.dvi = dvi;
    }

    public NhanVien(String maNV, double heso, String dvi, String hoten, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoten, ngaySinh, diaChi, gioiTinh);
        this.maNV = maNV;
        this.heso = heso;
        this.dvi = dvi;
    }

    

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public double getHeso() {
        return heso;
    }

    public void setHeso(double heso) {
        this.heso = heso;
    }

    public String getDvi() {
        return dvi;
    }

    public void setDvi(String dvi) {
        this.dvi = dvi;
    }

    @Override
    public String toString() {
        return "NhanVien{" +super.toString() +"maNV=" + maNV + ", heso=" + heso + ", dvi=" + dvi + '}';
    }
    
    
}
