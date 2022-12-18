package com.javarush.module4.lesson7.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionProvider {
    private final String url;
    private final String username;
    private final String password;

    public ConnectionProvider(String filename){
        final ResourceBundle bundle = ResourceBundle.getBundle(filename);
        url = bundle.getString("db.url");
        username = bundle.getString("user.login");
        password = bundle.getString("user.password");
    }

    public Connection provideConnection() throws SQLException {
       return DriverManager.getConnection(url, username, password);
    }
}
