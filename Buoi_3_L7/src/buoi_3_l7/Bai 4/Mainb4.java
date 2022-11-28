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
public class Mainb4 {
    public static void main(String[] args) {
        QLCB ql=new QLCB();
        Scanner sc = new Scanner(System.in);
        int chon;
        do{
            System.out.println("1. Thao tac voi cong nhan");
            System.out.println("2. Thao tac voi nhan vien");
            System.out.println("3. Thao tac voi ky su");
            System.out.println("4. Thoat");
            System.out.println("Moi ban chon: ");
            chon=sc.nextInt();
            switch(chon){
                case 1:
                    ql.nhap_CN();
                    ql.xuat_CN();
                    ql.timKiem_CN();
                    break;
                case 2:
                    ql.nhap_NV();
                    ql.xuat_NV();
                    ql.timKiem_NV();
                    break;
                case 3:
                    ql.nhap_KS();
                    ql.xuat_KS();
                    ql.timKiem_KS();
                    break;
            }
                
        }while(chon!=4);
    }
}
