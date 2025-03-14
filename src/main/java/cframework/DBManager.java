package cframework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBManager {
    private static String dbUrl="jdbc:mysql://localhost:3306/Banking_System";
    private static String dbUsername = "root";
    private static String dbPassword = "";


    public Connection getConnection(){
        try {
            return DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
