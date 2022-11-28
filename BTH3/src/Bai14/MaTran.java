/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class MaTran {
    protected int n;
    protected int m;
    protected int[][] a;

    public MaTran() {
    }

    public MaTran(int sd, int sc){
        this.n=sd;
        this.m=sc;
    }
    
    public MaTran(int b[][]){
        b=a;
    }
    public void nhap(int n,int m,int a[][]){ 
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.printf("a[%d][%d]=",i,j);
                a[i][j]=sc.nextInt();
            }
        }
    }
    
    public void hien(int n,int m,int a[][]){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.printf("%5d", a[i][j]);
            }
            System.out.println("");
        }
    }
    
    public void congMT(MaTran b){
        MaTran c=new MaTran(n,m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                c[i][j]=a[i][j] +b.a[i][j];
                System.out.println(""+c[i][j]);
            }
            System.out.println("");
        }
    }
}
