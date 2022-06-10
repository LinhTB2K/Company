/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.com.form;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author vanli
 */
public class CSDL {

    /**
     * @param args the command line arguments
     */
    private final static String  url ="jdbc:mysql://localhost:3306/quanlynhanvien";
    private final static String user = "root";
    private final static String pass="123456";
    private static HikariConfig connfig = new HikariConfig();
    private static HikariDataSource ds;

    static {
        connfig.setJdbcUrl(url);
        connfig.setUsername(user);
        connfig.setPassword(pass);
        connfig.addDataSourceProperty("cachePrepStmts", "true");
        connfig.addDataSourceProperty("prepStmtCacheSize", "250");
        connfig.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        ds = new HikariDataSource(connfig);
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
    
}
