/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_2_l7;

import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class Date {
    private int d;
    private int m;
    private int y;
    public Date(){
        
    }

    public Date(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
    
    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ngay:");
        d=sc.nextInt();
        System.out.println("Nhap thang:");
        m=sc.nextInt();
        System.out.println("Nhap nam:");
        y=sc.nextInt();
       
    }
    
    public void hien(){
        System.out.println(d+"/"+m+"/"+y);
    }
    
    public void ngayKeTiep(){
        int a;
        
        switch(m){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                a=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                a=30;
                break;
            case 2:
                if(y%400==0 || (y % 4 ==0 && y % 100!=0)){
                    a=29;
                }
                else{
                    a=28;
                }
                break;
            default: a=0;
        }
        if(d<0 || a==0 || d>a){
            System.out.println("Nhap sai!");
        }
        else{
            if(d==a){
               if(m==12){
                   d =1;
                   m =1;
                   y++;
               }
               else{
                   d =1;
                   m++;
               }
            }
            else{
                d++;
            }
        }
        System.out.printf("%d/%d/%d", d, m, y);
    }
    
}
