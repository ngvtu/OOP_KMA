/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_4_l7.Bai_1;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class Student implements Serializable{
    private String hoTen;
    private int tuoi;

    public Student() {
    }

    public Student(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        setHoTen(sc.nextLine());
        System.out.println("Nhap tuoi:");
        setTuoi(sc.nextInt());
    }
    
    public void hien(){
        System.out.println("Ho ten:"+getHoTen());
        System.out.println("Tuoi: "+getTuoi());
    }

          
}
