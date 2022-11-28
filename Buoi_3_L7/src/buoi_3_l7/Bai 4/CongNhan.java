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
public class CongNhan extends CanBo {
    private String bac;

    public CongNhan() {
    }

    public CongNhan(String bac) {
        this.bac = bac;
    }

    public CongNhan(String bac, String hoTen, int namSinh, String gioiTinh, String diaChi) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap bac: ");
        setBac(sc.nextLine());
    }
    @Override
    public void hien(){
        super.hien();
        System.out.println("Bac: "+getBac());
    }
}
