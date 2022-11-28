/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_3_l7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class Arr_PS_9 {
    ArrayList<PhanSo_9> ps=new ArrayList<>();
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        String a;
        int n;
        System.out.println("Nhap so phan tu cua day:");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            PhanSo_9 pso=new PhanSo_9();
            pso.nhap();
            ps.add(pso);
            
        }
    }
    
    public void hien(){
        for(int i=0;i<ps.size();i++){
            ps.get(i).toiGianPhanSo();
            ps.get(i).hien();
        }
    }
    
   
    
}
