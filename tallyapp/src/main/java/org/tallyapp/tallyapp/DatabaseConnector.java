package org.tallyapp.tallyapp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class DatabaseConnector {
        private static final String URL = "jdbc:mysql://localhost:3306/tallyapp";
        private static final String USER = "root";
        private static final String PASSWORD = "Msitra@3130"; // Change this!

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
    }

