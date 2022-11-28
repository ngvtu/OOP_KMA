
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL 3520
 */
public class HangHoa implements Serializable{
    protected String maHang;
    protected String tenHang;
    protected double gia;

    public HangHoa() {
    }

    public HangHoa(String maHang, String tenHang, double gia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.gia = gia;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "HangHoa{" + "maHang=" + maHang + ", tenHang=" + tenHang + ", gia=" + gia + '}';
    }
    
    
}
