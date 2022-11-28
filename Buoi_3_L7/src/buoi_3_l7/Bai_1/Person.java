/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_3_l7.Bai_1;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class Person implements Serializable{
    private String hoTen;
    private int namSinh;
    
    
    public Person(){
        
    }

    public Person(String hoTen, int namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        
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

    
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        hoTen=sc.nextLine();
        System.out.println("Nhap nam sinh:");
        namSinh=sc.nextInt();
        
    }
    
    public void hien(){
        System.out.printf("\n%-20s %-10d",hoTen,namSinh);   
    }
    
    
}
