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
public class Dangkitn {
    private String Matn;
    private String Maph;
    public Dangkitn(String Matn, String Maph) {
        this.Matn = Matn;
        this.Maph = Maph;
    }

    public Dangkitn() {
    }

    public String getMatn() {
        return Matn;
    }

    public void setMadv(String Madv) {
        this.Matn = Matn;
    }

    public String getMaph() {
        return Maph;
    }

    public void setMaph(String Tendv) {
        this.Maph = Maph;
    }
     @Override
    public String toString() {
        return "Dangkitn{" + "Matn=" + Matn+ ", Maph=" + Maph + '}';
    }

}
