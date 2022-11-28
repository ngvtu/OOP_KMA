/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_5;

import java.io.Serializable;

/**
 *
 * @author DELL 3520
 */
public class Person implements Serializable{
    private String hoten;
    private String ngaySinh;
    private String diaChi;
    private String gioiTinh;

    public Person() {
    }

    public Person(String hoten, String ngaySinh, String diaChi, String gioiTinh) {
        this.hoten = hoten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
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

    @Override
    public String toString() {
        return "Person{" + "hoten=" + hoten + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + '}';
    }
    
    
}
