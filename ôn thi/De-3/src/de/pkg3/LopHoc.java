/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.pkg3;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL 3520
 */
public class LopHoc  {
    public ArrayList<Sinhvien> list=new ArrayList<>();
    protected int siSo;
    protected String tenLop;

    public LopHoc() {
    }

    public LopHoc(int siSo, String tenLop) {
        this.siSo = siSo;
        this.tenLop = tenLop;
    }

    public ArrayList<Sinhvien> getList() {
        return list;
    }

    public void setList(ArrayList<Sinhvien> list) {
        this.list = list;
    }

    public int getSiSo() {
        return siSo;
    }

    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    
}
