/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de3_lh;

import java.util.ArrayList;

/**
 *
 * @author DELL 3520
 */
public class LopHoc {
    private ArrayList<SinhVien> list=new ArrayList<>();
    private int siso;
    private String tenLop;

    public LopHoc() {
    }

    public LopHoc(int siso, String tenLop) {
        this.siso = siso;
        this.tenLop = tenLop;
    }

    public ArrayList<SinhVien> getList() {
        return list;
    }

    public void setList(ArrayList<SinhVien> list) {
        this.list = list;
    }

    public int getSiso() {
        return siso;
    }

    public void setSiso(int siso) {
        this.siso = siso;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
    
    
    
}
