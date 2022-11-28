/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_8;

import java.io.Serializable;

/**
 *
 * @author DELL 3520
 */
public class CauThu implements Serializable{
    private String id;
    private String ten;
    private int namSinh;
    private String vitri;

    public CauThu() {
    }

    public CauThu(String id, String ten, int namSinh, String vitri) {
        this.id = id;
        this.ten = ten;
        this.namSinh = namSinh;
        this.vitri = vitri;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    @Override
    public String toString() {
        return "CauThu{" + "id=" + id + ", ten=" + ten + ", namSinh=" + namSinh + ", vitri=" + vitri + '}';
    }
    
    
}
