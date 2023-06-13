package TienVN.org.com.model;

import java.io.Serializable;

public class ThongTinDat implements Serializable {

    private int SoThua;

    private float DienTich;

    private int maLoai;
    private String GiapRanh;
    private String soDo;

    public ThongTinDat() {
    }

    public ThongTinDat(int soThua) {
        SoThua = soThua;
    }

    public ThongTinDat(int soThua, float dienTich, int maLoai, String giapRanh, String soDo) {
        SoThua = soThua;
        DienTich = dienTich;
        this.maLoai = maLoai;
        GiapRanh = giapRanh;
        this.soDo = soDo;
    }

    public int getSoThua() {
        return SoThua;
    }

    public void setSoThua(int soThua) {
        SoThua = soThua;
    }

    public float getDienTich() {
        return DienTich;
    }

    public void setDienTich(float dienTich) {
        DienTich = dienTich;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public String getGiapRanh() {
        return GiapRanh;
    }

    public void setGiapRanh(String giapRanh) {
        GiapRanh = giapRanh;
    }

    public String getSoDo() {
        return soDo;
    }

    public void setSoDo(String soDo) {
        this.soDo = soDo;
    }

    @Override
    public String toString() {
        return "ThongTinDat{" +
                "SoThua=" + SoThua +
                ", DienTich=" + DienTich +
                ", maLoai=" + maLoai +
                ", GiapRanh='" + GiapRanh + '\'' +
                ", soDo='" + soDo + '\'' +
                '}';
    }
}


