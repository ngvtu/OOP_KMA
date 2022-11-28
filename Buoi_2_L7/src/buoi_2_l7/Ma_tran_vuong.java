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
public class Ma_tran_vuong {
    private int n;
    private int[][] a;
    
    public Ma_tran_vuong(){
        
    }
    public Ma_tran_vuong(int n, int[][] a) {
        this.n = n;
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[][] getA() {
        return a;
    }

    public void setA(int[][] a) {
        this.a = a;
    }
    
    public void nhap(int n, int[][] a){
        
        int i,j;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.printf("a[%d][%d]=",i,j);
                a[i][j]=sc.nextInt();
            }
        }
    }
    
    public void hien(int n,int[][] a){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%5d", a[i][j]);
            }
            System.out.println("");
        }
    }
    public void tong(int n,int[][] a){
        int s=0;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    s=s+a[i][j];
                }
                if(n-1==i+j){
                    c=c+a[i][j];
                }
            }
        }
        System.out.println("Tong duong cheo chinh ="+s);
        System.out.println("Tong duong cheo phu ="+c);
    }
}
