/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_2_l7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class Main_b7 {
    public static void main(String[] args) {
    Ma_tran_vuong mt=new Ma_tran_vuong();
    Scanner sc=new Scanner(System.in);
    System.out.println("Nhap so cap cua ma tran:");
    int n=sc.nextInt();
    int[][] a=new int[n][n];
    mt.nhap(n,a);
    System.out.println("Ma trận có dạng:");
    mt.hien(n,a);
    mt.tong(n,a);
    }
    
}
