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
public class khachhang {
    private String Makh;
    private String Tenkh;
    private String CMT;
    private String SDT;
    private int Namsinh;
    private String Diachi;

    public khachhang(String Makh, String Tenkh, String CMT,  String SDT, int Namsinh, String Diachi) {
        this.Makh = Makh;
        this.Tenkh = Tenkh;
        this.CMT = CMT; 
        this.SDT = SDT;
        this.Namsinh = Namsinh;
        this.Diachi=Diachi;
    }

    public khachhang() {
    }

    public String getMakh() {
        return Makh;
    }

    public void setMakh(String Makh) {
        this.Makh = Makh;
    }

    public String getTenkh() {
        return Tenkh;
    }

    public void setTenkh(String Tenkh) {
        this.Tenkh = Tenkh;
    }

    public String getCMT() {
        return CMT;
    }

    public void setCMT(String CMT) {
        this.CMT = CMT;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public double getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(int Namsinh) {
        this.Namsinh = Namsinh;
    }
    public String getDiachi() {
       return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    @Override
    public String toString() {
        return "khachHang{" + "MAKH=" + Makh + ", TENKH=" + Tenkh + ", CMT=" + CMT +  ", SDT=" + SDT +", Namsinh=" + Namsinh + ", Diachi=" + Diachi + '}';
    }
    
}
