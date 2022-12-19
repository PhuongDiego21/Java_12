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
public class Loaiphong {
     private String Maloai;
    private String Tenloai;
    private double Gialoai;
    public Loaiphong(String Maloai, String Tenloai, double Gialoai) {
        this.Maloai = Maloai;
        this.Tenloai = Tenloai;
        this.Gialoai = Gialoai;
    }

    public Loaiphong() {
    }

    public String getMaloai() {
        return Maloai;
    }

    public void setMaloai(String Madv) {
        this.Maloai = Maloai;
    }

    public String getTenloai() {
        return Tenloai;
    }

    public void setloai(String Tendv) {
        this.Tenloai = Tenloai;
    }

    public double getGialoai() {
        return Gialoai;
    }

    public void setGialoai(double Giadv) {
        this.Gialoai = Gialoai;
    }

    @Override
    public String toString() {
        return "Loaiphong{" + "Maloai=" + Maloai + ", Tenloai=" + Tenloai + ", Gialoai=" + Gialoai + '}';
    }
    
    
}
