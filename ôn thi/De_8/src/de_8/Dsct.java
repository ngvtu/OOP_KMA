package de_8;


import de_8.CauThu;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL 3520
 */
public class Dsct {
    public static ArrayList<CauThu> list=new ArrayList<>();
    CauThu ct=new CauThu();
    public static ArrayList<CauThu> getList(){     
        return list;
    }
    public void add(String ID, String ten, int ns, String vt ){
        list.add(new CauThu(ID, ten, ns, vt));
    }
}
