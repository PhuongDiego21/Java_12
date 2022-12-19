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
public class Dichvu {
    private String Madv;
    private String Tendv;
    private double Giadv;
    public Dichvu(String Madv, String Tendv, double Giadv) {
        this.Madv = Madv;
        this.Tendv = Tendv;
        this.Giadv = Giadv;
    }

    public Dichvu() {
    }
    public String getMadv() {
        return Madv;
    }

    public void setMadv(String Madv) {
        this.Madv = Madv;
    }

    public String getTendv() {
        return Tendv;
    }

    public void setTendv(String Tendv) {
        this.Tendv = Tendv;
    }

    public double getGiadv() {
        return Giadv;
    }

    public void setGiadv(double Giadv) {
        this.Giadv = Giadv;
    }

    @Override
    public String toString() {
        return "DichVu{" + "Madv=" + Madv + ", Tendv=" + Tendv + ", Giadv=" + Giadv + '}';
    }
    
    
    
}
