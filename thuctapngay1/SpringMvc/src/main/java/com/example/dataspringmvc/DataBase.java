/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dataspringmvc;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author vanli
 */
public class DataBase {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/quanlynhanvien";
    private static final String USER = "root";
    private static final String PASS = "123456";
    private static HikariConfig connfig = new HikariConfig();
    private static HikariDataSource ds;

    static {
        connfig.setJdbcUrl(DB_URL);
        connfig.setUsername(USER);
        connfig.setPassword(PASS);
        connfig.addDataSourceProperty("cachePrepStmts", "true");
        connfig.addDataSourceProperty("prepStmtCacheSize", "250");
        connfig.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        ds = new HikariDataSource(connfig);
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}