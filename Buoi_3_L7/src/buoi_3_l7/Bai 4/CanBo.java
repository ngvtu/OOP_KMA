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
public class CanBo {
    private String hoTen;
    private int namSinh;
    private String gioiTinh;
    private String diaChi;

    public CanBo() {
    }
    
    

    public CanBo(String hoTen, int namSinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        setHoTen(sc.nextLine());
        System.out.println("Nhap nam sinh: ");
        setNamSinh(sc.nextInt());
        System.out.println("Nhap gioi tinh: ");
        sc.nextLine();
        setGioiTinh(sc.nextLine());
        System.out.println("Nhap dia chi: ");       
        setDiaChi(sc.nextLine());
        
    }
    public void hien(){
        System.out.println("Ho ten: "+getHoTen());
        System.out.println("Nam sinh: "+getNamSinh());
        System.out.println("Gioi tinh: "+getGioiTinh());
        System.out.println("Dia chi: "+getDiaChi());
    }
    
}
