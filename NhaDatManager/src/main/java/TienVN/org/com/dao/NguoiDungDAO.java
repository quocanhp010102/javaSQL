package TienVN.org.com.dao;

import TienVN.org.com.model.NguoiDung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class NguoiDungDAO {

    public int add(NguoiDung a) {
        Connection cn =null;
        PreparedStatement check  =null;


        PreparedStatement pst  =null;
        try {

            String check1= "SELECT * FROM nguoidung WHERE id=?";
            cn = ConnectionDB.conn();
            PreparedStatement p = cn.prepareStatement(check1);
            p.setInt(1, a.getId());
            ResultSet resultSet = p.executeQuery();
            if (resultSet.next()) {
                return 0;
            } else {
                try {
                    String sql1 = "INSERT INTO nguoidung VALUES (?,?,?,?)";
                    pst = cn.prepareStatement(sql1);

                    pst.setString(1, String.valueOf(a.getId()));
                    pst.setString(2,a.getTenNguiDung());
                    pst.setString(3,a.getTenNguiDung());
                    pst.setInt(4,a.getRole());



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
    public int delete(NguoiDung a) {
        PreparedStatement pst = null;
        Connection cn = null;
        try {
            String sql = "DELETE FROM nguoidung WHERE Id=?";


            cn = ConnectionDB.conn();
            pst = cn.prepareStatement(sql);

            pst.setString(1, String.valueOf(a.getId()));
            if (pst.executeUpdate() > 0) {
                return 1;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public int update(NguoiDung a) {
        PreparedStatement pst = null;
        Connection cn = null;
        try {
            String sql = "UPDATE nguoidung  SET TenND = ?, Password = ?, role = ? WHERE id=?";

            cn = ConnectionDB.conn();
            pst = cn.prepareStatement(sql);

            pst.setString(1, a.getTenNguiDung());
            pst.setString(2, a.getPassword());
            pst.setInt(3, a.getRole());
            pst.setString(4, String.valueOf(a.getId()));

            if (pst.executeUpdate() > 0) {
                return 1;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return -1;
    }


}

