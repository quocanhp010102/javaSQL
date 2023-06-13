package TienVN.org.com.model;

public class Thue {

    private int MaThue;
    private int nam;
    private int soThua;
    private String ghiChu;

    public Thue() {
    }

    public Thue(int maThue) {
        MaThue = maThue;
    }

    public Thue(int maThue, int nam, int soThua, String ghiChu) {
        MaThue = maThue;
        this.nam = nam;
        this.soThua = soThua;
        this.ghiChu = ghiChu;
    }

    public int getMaThue() {
        return MaThue;
    }

    public void setMaThue(int maThue) {
        MaThue = maThue;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getSoThua() {
        return soThua;
    }

    public void setSoThua(int soThua) {
        this.soThua = soThua;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }


    @Override
    public String toString() {
        return "Thue{" +
                "MaThue=" + MaThue +
                ", nam=" + nam +
                ", soThua=" + soThua +
                ", ghiChu='" + ghiChu + '\'' +
                '}';
    }
}
