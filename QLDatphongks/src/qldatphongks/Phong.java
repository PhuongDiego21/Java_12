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
public class Phong {
    private String Maph;
    private String Tenph;
    private String Maloai;
    private double Giaph;
    public Phong(String Maph, String Tenph,String Maloai, double Giaph) {
        this.Maph = Maph;
        this.Tenph = Tenph;
        this.Maloai=Maloai;
        this.Giaph = Giaph;
    }

    public Phong() {
    }

    public String getMaph() {
        return Maph;
    }

    public void setMaph(String Maph) {
        this.Maph = Maph;
    }

    public String getTenph() {
        return Tenph;
    }

    public void setTenph(String Tenph) {
        this.Tenph = Tenph;
    }
    
    public String getMaloai() {
        return Maloai;
    }

    public void setMaloai(String Maloai) {
        this.Maloai = Maloai;
    }


    public double getGiaph() {
        return Giaph;
    }

    public void setGiadv(double Giaph) {
        this.Giaph = Giaph;
    }

    @Override
    public String toString() {
        return "Phong{" + "Maph=" + Maph + ", Tenph=" + Tenph + ", Maloai="+Maloai+", Giaph=" + Giaph+ '}';
    }
    
    
}
