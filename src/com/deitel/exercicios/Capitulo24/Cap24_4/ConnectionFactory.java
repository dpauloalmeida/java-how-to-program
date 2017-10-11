package com.deitel.exercicios.Capitulo24.Cap24_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost/deitel_java_employees?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }
}
