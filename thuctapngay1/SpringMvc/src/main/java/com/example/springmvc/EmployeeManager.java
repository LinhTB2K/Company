/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springmvc;

import com.example.dataspringmvc.DataBase;
import com.example.dataspringmvc.Employee;
import com.example.dataspringmvc.User;

import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vanli
 */
public class EmployeeManager {

//    public static Vector<Employee> list = new Vector<Employee>();

    public Vector<Employee> getAllEmployeess() {
        Vector<Employee> list = new Vector<>();
        try {
            Connection conn = DataBase.getConnection();
            String sql = "select * from tbnhanvien";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
//            list.clear();
            while (resultSet.next()) {
                Employee std = new Employee();
                std.setId(resultSet.getString("id"));
                std.setFullname(resultSet.getString("fullname"));
                std.setBirthday(resultSet.getString("birthday"));
                std.setGender(resultSet.getString("gender"));
                std.setEmail(resultSet.getString("email"));
                std.setAddress(resultSet.getString("address"));
                list.add(std);
            }
//            System.out.println(list);

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Employee AddEmployees(Employee nhanvien) {
        Connection conn = null;
        try {
            conn = DataBase.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        PreparedStatement statement = null;
        try {
            conn = DataBase.getConnection();
//            conn.setAutoCommit(false);
            String sql = "insert into tbnhanvien(id, fullname, birthday, gender, email, address)"
                    + " values (?, ?, ?, ?, ?, ?)";
            statement = conn.prepareCall(sql);
            statement.setString(1, nhanvien.getId());
            statement.setString(2, nhanvien.getFullname());
            statement.setString(3, nhanvien.getBirthday());
            statement.setString(4, nhanvien.getGender());
            statement.setString(5, nhanvien.getEmail());
            statement.setString(6, nhanvien.getAddress());
            statement.execute();
//            conn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return nhanvien;
    }

    public Employee FixEmployees(Employee nhanvien) {
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = DataBase.getConnection();
//            conn.setAutoCommit(false);
            String sql = "update tbnhanvien set fullname=?, birthday = ?, gender = ?, email = ?, address=?"
                    + " where id = ?";
            System.out.println(nhanvien);
            statement = conn.prepareCall(sql);
            statement.setString(1, nhanvien.getFullname());
            statement.setString(2, nhanvien.getBirthday());
            statement.setString(3, nhanvien.getGender());
            statement.setString(4, nhanvien.getEmail());
            statement.setString(5, nhanvien.getAddress());
            statement.setString(6, nhanvien.getId());
            statement.execute();
//            conn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return nhanvien;
    }

    public String DelEmployees(String id) {
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = DataBase.getConnection();
            conn.setAutoCommit(false);
            String sql = "delete from tbnhanvien where id=?";
            statement = conn.prepareCall(sql);
            statement.setString(1, id);
            statement.execute();
            conn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return id;
    }

    public Vector<Employee> SearchEmployees(String id) {
        Vector<Employee> list = new Vector<>();
        Connection conn = null;
        PreparedStatement stm = null;
        try {
            conn = DataBase.getConnection();
            conn.setAutoCommit(false);
            String sql = "select * from tbnhanvien where id like?";
            stm = conn.prepareStatement(sql);
            stm.setString(1, "%" + id + "%");
            ResultSet rs = stm.executeQuery();
//            list.clear();
            while (rs.next()) {
                Employee std = new Employee(
                        rs.getString("id"),
                        rs.getString("fullname"),
                        rs.getString("birthday"),
                        rs.getString("gender"),
                        rs.getString("email"),
                        rs.getString("address"));
                list.add(std);
            }
//            conn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return list;
    }

    public boolean Login(String user, String pass ) {
        Connection conn = null;
        PreparedStatement stm = null;
        try {
            conn = DataBase.getConnection();
            String sql = "select * from tbuser where username=? and password=?";
            stm = conn.prepareStatement(sql);
            stm.setString(1, user);
            stm.setString(2, pass);
//            stm.execute();
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                User us = new User();
                rs.getString("username");
                rs.getString("password");
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    }
