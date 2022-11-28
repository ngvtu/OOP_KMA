/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_10;

import java.io.Serializable;

/**
 *
 * @author DELL 3520
 */
public class GiangVien implements Serializable{
    private String hoTen;
    private String maGV;
    private String diaChi;
    private String gioiTinh;
    private String khoa;

    public GiangVien() {
    }

    public GiangVien(String hoTen, String maGV, String diaChi, String gioiTinh, String khoa) {
        this.hoTen = hoTen;
        this.maGV = maGV;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }
    
    
}
