/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de1;

import java.io.Serializable;

/**
 *
 * @author DELL 3520
 */
public class Student extends Person implements Serializable{
    protected String maSV;
    protected String email;
    protected double diem;

    public Student() {
    }

    public Student(String maSV, String email, double diem) {
        this.maSV = maSV;
        this.email = email;
        this.diem = diem;
    }

    public Student(String maSV, String email, double diem, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maSV = maSV;
        this.email = email;
        this.diem = diem;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    
    @Override
    public String toString() {
        return "Student{" + "Ho ten=" + super.hoTen+ "Ngay sinh=" + super.ngaySinh + "Dia chi="+super.diaChi+ "Gioi tinh="+super.gioiTinh +"maSV=" + maSV + ", email=" + email + ", diem=" + diem + '}';
    }
    
    
            
}
