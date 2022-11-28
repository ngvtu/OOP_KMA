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
public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String congViec) {
        this.congViec = congViec;
    }

    public NhanVien(String congViec, String hoTen, int namSinh, String gioiTinh, String diaChi) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Cong viec: ");
        setCongViec(sc.nextLine());
    }
    @Override
    public void hien(){
        super.hien();
        System.out.println("Cong viec: "+getCongViec());
    }
}

