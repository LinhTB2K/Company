import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/dept";
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

    private DataSource() { }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}