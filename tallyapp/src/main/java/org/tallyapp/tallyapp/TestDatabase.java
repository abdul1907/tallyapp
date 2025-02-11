package org.tallyapp.tallyapp;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDatabase {
    public static void main(String[] args) {
        try {
            Connection connection = DatabaseConnector.getConnection();

            if (connection != null) {
                System.out.println("✅ Database Connected Successfully!");
            } else {
                System.out.println("❌ Database Connection Failed!");
            }
        } catch (SQLException e) {
            System.out.println("❌ Error connecting to database: " + e.getMessage());
            e.printStackTrace(); // Prints detailed error
        }
    }
}