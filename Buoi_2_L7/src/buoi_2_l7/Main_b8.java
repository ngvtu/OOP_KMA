/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_2_l7;

/**
 *
 * @author DELL 3520
 */
public class Main_b8 {
    public static void main(String[] args) {
        Phan_so ps1=new Phan_so();
        Phan_so ps2=new Phan_so();
        System.out.println("Nhap phan so thu 1:");
        ps1.nhap();
        System.out.println("Nhap phan so thu 2:");
        ps2.nhap();
        ps1.congPhanSo(ps2);
        ps1.nhanPhanSo(ps2);
        ps1.chiaPhanSo(ps2);
        ps1.truPhanSo(ps2);

    }
}
