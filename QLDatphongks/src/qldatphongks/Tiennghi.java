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
public class Tiennghi {
    private String Matn;
    private String Tentn;
    private double Giatn;
    public Tiennghi(String Matn, String Tentn, double Giatn) {
        this.Matn = Matn;
        this.Tentn = Tentn;
        this.Giatn = Giatn;
    }

    public Tiennghi() {
    }

    public String getMatn() {
        return Matn;
    }

    public void setMatn(String Matn) {
        this.Matn = Matn;
    }

    public String getTentn() {
        return Tentn;
    }

    public void setTentn(String Tentn) {
        this.Tentn = Tentn;
    }

    public double getGiatn() {
        return Giatn;
    }

    public void setGiadv(double Giadv) {
        this.Giatn = Giatn;
    }

    @Override
    public String toString() {
        return "Tiennghi{" + "MADV=" + Matn + ", TENNVL=" + Tentn + ", GIADV=" + Giatn + '}';
    }
    
    
}
