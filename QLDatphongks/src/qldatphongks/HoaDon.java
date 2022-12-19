/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qldatphongks;

/**
 *
 * @author Admin
 */
public class HoaDon {
    private String Mahd;
    private float Tongtien;
    public HoaDon(String Mahd, float Tongtien) {
        this.Mahd = Mahd;
        this.Tongtien = Tongtien;
    }

    public HoaDon() {
    }

    public String getMahd() {
        return Mahd;
    }

    public void setMahd(String Mahd) {
        this.Mahd = Mahd;
    }
    public float getTongtien() {
        return Tongtien;
    }

    public void setTongtien(float Tongtien) {
        this.Tongtien = Tongtien;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "Mahd=" + Mahd + ", Tongtien=" + Tongtien + '}';
    }
    
    
}
