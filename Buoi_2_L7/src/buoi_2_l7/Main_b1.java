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
public class Main_b1 {
    public static void main(String[] args) {
        HCN hcn=new HCN();
        hcn.nhap();       
        System.out.println("Ket qua:");
        hcn.dientich();
        hcn.chuvi();
        System.out.println(hcn);
    }   
}
