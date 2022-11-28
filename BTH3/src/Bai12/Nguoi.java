/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai12;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class Nguoi implements Serializable{
    protected String hoTen;
    protected int nam;
    protected String que;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int nam, String que) {
        this.hoTen = hoTen;
        this.nam = nam;
        this.que = que;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }
    
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        setHoTen(sc.nextLine());
        System.out.println("Nhap nam sinh:");
        setNam(sc.nextInt());
        System.out.println("Nhap que quan");
        sc.nextLine();
        setQue(sc.nextLine());
    }
    
    

    public void hien(){
        System.out.println("Ho ten:" +getHoTen());
        System.out.println("Nam sinh:"+getNam());
        System.out.println("Que quan:"+getQue());
    }
    
}
