/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai14;

import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class Main_14 {
    public static void main(String[] args) {
        MaTran mt=new MaTran();
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so hang cua ma tran:");
        n=sc.nextInt();
        System.out.println("Nhap so cot cua ma tran:");
        m=sc.nextInt();
        int[][] a=new int[n][m];
        mt.nhap(n,m,a);
        mt.hien(n,m,a);
        mt.congMT(mt);
    }
    
    
}
