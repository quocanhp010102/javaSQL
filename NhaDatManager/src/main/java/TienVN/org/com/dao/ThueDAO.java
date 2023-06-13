package TienVN.org.com.dao;


import TienVN.org.com.model.Thue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ThueDAO {
    public int add(Thue a) {
        Connection cn =null;
        PreparedStatement check  =null;


        PreparedStatement pst  =null;
        try {

            String check1= "SELECT * FROM thue WHERE MaThue=?";
            cn = ConnectionDB.conn();
            PreparedStatement p = cn.prepareStatement(check1);
            p.setInt(1, a.getMaThue());
            ResultSet resultSet = p.executeQuery();
            if (resultSet.next()) {
                return 0;
            } else {
                try {
                    String sql1 = "INSERT INTO nguoidung VALUES (?,?,?,?)";
                    pst = cn.prepareStatement(sql1);

                    pst.setString(1, String.valueOf(a.getMaThue()));
                    pst.setInt(2,a.getNam());
                    pst.setString(3,a.getGhiChu());
                    pst.setString(4, String.valueOf(a.getSoThua()));



                    if (pst.executeUpdate() > 0) {
                        System.out.println("add thanh cong");
                        return 1;
                    }
                }catch(Exception e) {
                    e.printStackTrace();
                }
            }



        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pst.close();
            }catch(Exception e) {

            }
        }


        return -1;
    }
    public int delete(Thue a) {
        PreparedStatement pst = null;
        Connection cn = null;
        try {
            String sql = "DELETE FROM nguoidung WHERE Id=?";


            cn = ConnectionDB.conn();
            pst = cn.prepareStatement(sql);

            pst.setString(1, String.valueOf(a.getMaThue()));
            if (pst.executeUpdate() > 0) {
                return 1;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public int update(Thue a) {
        PreparedStatement pst = null;
        Connection cn = null;
        try {
            String sql = "UPDATE nguoidung  SET Nam = ?, GhiChu = ?, SoThua = ? WHERE MaThue=?";

            cn = ConnectionDB.conn();
            pst = cn.prepareStatement(sql);

            pst.setInt(1, a.getNam());
            pst.setString(2, a.getGhiChu());
            pst.setString(3, String.valueOf(a.getSoThua()));
            pst.setString(4, String.valueOf(a.getMaThue()));

            if (pst.executeUpdate() > 0) {
                return 1;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

}
