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
public class KySu extends CanBo{
    
    private String nganh;

    public KySu() {
    }

    public KySu(String nganh) {
        this.nganh = nganh;
    }

    public KySu(String nganh, String hoTen, int namSinh, String gioiTinh, String diaChi) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.nganh = nganh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Chuyen nganh: ");
        setNganh(sc.nextLine());
    }
    @Override
    public void hien(){
        super.hien();
        System.out.println("Chuyen nganh: " +getNganh());
    }

    
}

