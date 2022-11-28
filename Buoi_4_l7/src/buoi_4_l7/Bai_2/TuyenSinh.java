/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_4_l7.Bai_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL 3520
 */
public class TuyenSinh extends ThiSinh{
    ArrayList<ThiSinh> thisinh=new ArrayList<>();
    private String khoi;
    private int n;


    public TuyenSinh() {
    }

    public TuyenSinh(String khoi) {
        this.khoi = khoi;
    }
    
    public String getKhoi() {
        return khoi;
    }

    public void setKhoi(String khoi) {
        this.khoi = khoi;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap khoi:");
            setKhoi(sc.nextLine());
    }
    
    @Override
    public void hien(){
        super.hien();
        
        if(getKhoi().equalsIgnoreCase("a")){
            System.out.println("Khoi A thi Toan, Ly, Hoa");
        }
        else if(getKhoi().equalsIgnoreCase("b")){
            System.out.println("Khoi B thi Toan, Hoa, Sinh");
        }
        if(getKhoi().equalsIgnoreCase("c")){
            System.out.println("Khoi C thi Van, Su, Dia");
        }
        
    }


    
}
