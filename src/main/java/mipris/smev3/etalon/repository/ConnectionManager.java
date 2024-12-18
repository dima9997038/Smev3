package mipris.smev3.etalon.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {

    private static final String USER = "spring.datasource.username";
    private static final String PASSWORD = "spring.datasource.password";
    private static final String URL = "spring.datasource.url";


    private ConnectionManager() {
    }

    public static Connection open() {
        try {
            return DriverManager.getConnection(PropertyUtil.get(URL), PropertyUtil.get(USER), PropertyUtil.get(PASSWORD));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
