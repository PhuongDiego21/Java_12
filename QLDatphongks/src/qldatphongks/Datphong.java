/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qldatphongks;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class Datphong {
    private String Madp;
    private String Maph;
    private String Makh;
    private String Mahd;
    private Date ngaythue;
    private Date ngaytra;
    
    public Datphong(String Madp, String Maph,String Makh,String Mahd,Date ngaythue, Date ngaytra) {
        this.Madp = Madp;
        this.Maph=Maph;
        this.Makh=Makh;
        this.Mahd=Mahd;
        this.ngaythue=ngaythue;
        this.ngaytra=ngaytra;
    }

    public Datphong() {
    }

    public String getMadp() {
        return Madp;
    }

    public void setMadp(String Madp) {
        this.Madp= Madp;
    }

    public String getMaph() {
        return Maph;
    }

    public void setMaph(String Tendv) {
        this.Maph = Maph;
    }

    public String getMakh() {
        return Makh;
    }

    public void setMakh(String Makh) {
        this.Makh = Makh;
    }
     public String getMahd() {
        return Mahd;
    }

    public void setMahd(String Makh) {
        this.Mahd = Mahd;
    }
     public Date getngaythue() {
        return ngaythue;
    }

    public void setngaythue(Date ngaythue) {
        this.ngaythue = ngaythue;
    }
     public Date getngaytra() {
        return ngaytra;
    }

    public void setngaytra(Date ngaytra) {
        this.ngaytra = ngaytra;
    }

    @Override
    public String toString() {
        return "Datphong{" + "Madp=" + Madp + ", Maph=" + Maph + ", Makh=" + Makh + ",Mahd="+Mahd+",Ngaythue= "+ngaythue+",Ngaytra="+ngaytra+'}';
    }
    
    
    
}
