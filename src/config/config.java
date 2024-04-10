package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class config {

    final private Connection cn;

    public config() throws SQLException {
        cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","");
    }

    public ResultSet getData(String sql) throws SQLException {
        return cn.createStatement().executeQuery(sql);
    }

    public Connection getConnection() throws SQLException {
        return cn;
    }

}
