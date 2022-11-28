
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL 3520
 */
public class Person {
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private String gioiTinh;

    public Person() {
    }

    public Person(String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        hoTen=sc.nextLine();
        System.out.println("Nhap ngay sinh:");
        ngaySinh=sc.nextLine();
        System.out.println("Nhap dia chi:");
        diaChi=sc.nextLine();
        System.out.println("Nhap gioi tinh:");
        gioiTinh=sc.nextLine();
    }
    
    public void hienThi(){
        System.out.println("Ho ten:"+hoTen);
        System.out.println("Ngay sinh:"+ngaySinh);
        System.out.println("Dia chi:"+diaChi);
        System.out.println("Gioi Tinh:"+gioiTinh);
    }
}
