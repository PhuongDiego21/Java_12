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
public class Dangkidv {
    private String Madv;
    private String Madp;
    private String Tendv;
    private double Giadv;
    public Dangkidv(String Madv,String Madp, String Tendv, double Giadv) {
        this.Madv = Madv;
        this.Madp=Madp;
        this.Tendv = Tendv;
        this.Giadv = Giadv;
    }

    public Dangkidv() {
    }

    public String getMadv() {
        return Madv;
    }

    public void setMadv(String Madv) {
        this.Madv = Madv;
    }
    public String getMadp() {
        return Madp;
    }

    public void setMadp(String Madp) {
        this.Madp = Madp;
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
        return "Dangkidv{" + "Madv=" + Madv + ",Madp="+Madp+", Tendv=" + Tendv + ", Giadv=" + Giadv + '}';
    }
    
    
    
}
