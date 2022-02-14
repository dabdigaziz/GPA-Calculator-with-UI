package com.company.data;

import com.company.data.interfaces.IDBConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect implements IDBConnect {
    @Override
    public Connection connect() throws SQLException, ClassNotFoundException {
        String connectionUrl = "jdbc:postgresql://localhost:5432/gpa_calculator";
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(connectionUrl, "postgres", "dias");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}