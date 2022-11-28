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
public class Tamgiac {
    private double a;
    private double b;
    private double c;

    
    public Tamgiac(){
        
    }

    public Tamgiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap canh a:");
        a=sc.nextDouble();
        System.out.println("Nhap canh b:");
        b=sc.nextDouble();
        System.out.println("Nhap canh c:");
        c=sc.nextDouble();
    }
    
    public void hien(){
        System.out.println("canh a:"+a);
        System.out.println("canh b:"+b);
        System.out.println("canh c:"+c);
        //check();
        kiemtra();
        System.out.println("Chu vi:"+chuvi());
        System.out.println("Dien tich:"+dientich());
    }
    
    public void kiemtra(){
        if(a+b>c&&b+c>a&&a+c>b){
            if(a==b||b==c||c==a){
                if(a==b&&b==c&&c==a){
                    System.out.println("Tam gia deu!");
                }
                else{
                    System.out.println("Tam giac can!");
                }
            }
            else if(a*a+b*b==c*c||b*b+c*c==a*a||a*a+c*c==a*a){
                if(a==b||b==c||c==a){
                    System.out.println("Tam giac vuong can!");
                }
                else{
                    System.out.println("Tam giac vuong!");
                }
            }
            else{
                System.out.println("Tam giac thuong!");
            }
        }
        else{
            System.out.println("Khong la tam giac!");
        }
    }
    
    
    
    public double chuvi(){
        return a+b+c;
    }
    public double dientich(){
        double p=(a+b+c)/2;
        double s;
        s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
    
    
}
