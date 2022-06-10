/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proccess;

import java.sql.*;
import DataBase.Connect;
import DataBase.Employee;
import java.awt.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vanli
 */
public class LoaiSP {

    public static Vector<Employee> list = new Vector<Employee>();

    static Vector<Employee> HienThiNhanVien() {
        try {
            Connection conn = Connect.getConnection();
            String sql = "select * from tbnhanvien";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            list.clear();
            while (resultSet.next()) {
                Employee std = new Employee();
                std.setId(resultSet.getInt("id"));
                std.setFullname(resultSet.getString("fullname"));
                std.setBirthday(resultSet.getString("birthday"));
                std.setGender(resultSet.getString("gender"));
                std.setEmail(resultSet.getString("email"));
                std.setAddress(resultSet.getString("address"));
                list.add(std);
            }
            System.out.println(list);

        } catch (SQLException ex) {
            Logger.getLogger(LoaiSP.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    void ThemNhanVien(Employee nhanvien) {
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = Connect.getConnection();
//            conn.setAutoCommit(false);
            String sql = "insert into tbnhanvien(id, fullname, birthday, gender, email, address)"
                    + " values (a, ?, ?, ?, ?, ?)";
            statement = conn.prepareCall(sql);
            statement.setInt(1, nhanvien.getId());
            statement.setString(2, nhanvien.getFullname());
            statement.setString(3, nhanvien.getBirthday());
            statement.setString(4, nhanvien.getGender());
            statement.setString(5, nhanvien.getEmail());
            statement.setString(6, nhanvien.getAddress());
            statement.execute();
//            conn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(LoaiSP.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LoaiSP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(LoaiSP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
