/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tu;

import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class Nguoi_8 {
    private String hoTen;
    private int namSinh;
    private String cmt;

    public Nguoi_8() {
    }

    public Nguoi_8(String hoTen, int namSinh, String cmt) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.cmt = cmt;
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

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        setHoTen(sc.nextLine());
        System.out.println("Nhap nam sinh");
        setNamSinh(sc.nextInt());
        System.out.println("Nhap so chung minh thu:");
        sc.nextLine();
        setCmt(sc.nextLine());
    }
    
    public void hien(){
        System.out.println("Ho ten: "+getHoTen());
        System.out.println("Nam sinh: "+getNamSinh());
        System.out.println("Chung minh thu: "+getCmt());
    }

    
    

    
    
}
