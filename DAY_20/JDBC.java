package DAY_20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Java Database Connectivity
public class JDBC {

    static final String DB_URL = "jdbc:mysql://localhost:3306/rr";
    static final String USER = "root";
    static final String PASS = "root";
    static Connection conn = null;

    static void connect() {
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to the database successfully!");
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        connect();
    }

}
