package com.mensageria.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private ConnectionFactory(){};
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost/cliente_servidor",
                    "postgres",
                    "123456"
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
