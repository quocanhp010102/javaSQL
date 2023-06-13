package TienVN.org.com.model;

import java.io.Serializable;

public class ChoSoHuu implements Serializable {
    private int MahuSoHuu;
    private String TenChuSoHuu;
    private int SoThua;

    public ChoSoHuu() {
    }

    public ChoSoHuu(int mahuSoHuu) {
        MahuSoHuu = mahuSoHuu;
    }

    public ChoSoHuu(int mahuSoHuu, String tenChuSoHuu, int soThua) {
        MahuSoHuu = mahuSoHuu;
        TenChuSoHuu = tenChuSoHuu;
        SoThua = soThua;
    }

    public int getMahuSoHuu() {
        return MahuSoHuu;
    }

    public void setMahuSoHuu(int mahuSoHuu) {
        MahuSoHuu = mahuSoHuu;
    }

    public String getTenChuSoHuu() {
        return TenChuSoHuu;
    }

    public void setTenChuSoHuu(String tenChuSoHuu) {
        TenChuSoHuu = tenChuSoHuu;
    }

    public int getSoThua() {
        return SoThua;
    }

    public void setSoThua(int soThua) {
        SoThua = soThua;
    }

    @Override
    public String toString() {
        return "ChoSoHuu{" +
                "MahuSoHuu=" + MahuSoHuu +
                ", TenChuSoHuu='" + TenChuSoHuu + '\'' +
                ", SoThua=" + SoThua +
                '}';
    }
}
