/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author geezylucas
 */
public class SQLiteJDBC {

    public SQLiteJDBC() {
    }

    public void createUserTable() {
        Connection conn;
        Statement stmt;

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:local.db");
            stmt = conn.createStatement();

            String query = "CREATE TABLE IF NOT EXISTS USER ("
                    + " token       VARCHAR(250)    NOT NULL, "
                    + " user_id     INT             NOT NULL, "
                    + " box_id      INT             NOT NULL, "
                    + "PRIMARY KEY (user_id, box_id));";

            stmt.executeUpdate(query);
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void insertUser(String token, int userId, int boxId) {
        Connection conn;
        Statement stmt;

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:local.db");
            conn.setAutoCommit(false);
            stmt = conn.createStatement();

            String query = "DELETE from USER;";
            stmt.executeUpdate(query);

            query = "INSERT INTO USER (token, user_id, box_id) "
                    + "VALUES ('" + token + "', " + userId + ", " + boxId + ");";

            stmt.executeUpdate(query);

            stmt.close();
            conn.commit();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void updateToken(String token) {
        Connection conn;
        Statement stmt;

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:local.db");
            conn.setAutoCommit(false);
            stmt = conn.createStatement();

            String query = "UPDATE USER SET token = '" + token + "';";
            stmt.executeUpdate(query);

            stmt.close();
            conn.commit();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public String getToken() {
        Connection conn;
        Statement stmt;

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:local.db");
            conn.setAutoCommit(false);
            stmt = conn.createStatement();

            String token = null;
            try (ResultSet rs = stmt.executeQuery("SELECT token FROM USER;")) {
                while (rs.next()) {
                    token = rs.getString("token");
                }
            }
            stmt.close();
            conn.close();

            return token;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            return null;
        }
    }

    public Integer getUserId() {
        Connection conn;
        Statement stmt;

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:local.db");
            conn.setAutoCommit(false);
            stmt = conn.createStatement();

            int userId = 0;
            try (ResultSet rs = stmt.executeQuery("SELECT user_id FROM USER;")) {
                while (rs.next()) {
                    userId = rs.getInt("user_id");
                }
            }
            stmt.close();
            conn.close();

            return userId;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            return null;
        }
    }

    public Integer getBoxId() {
        Connection conn;
        Statement stmt;

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:local.db");
            conn.setAutoCommit(false);
            stmt = conn.createStatement();

            int userId = 0;
            try (ResultSet rs = stmt.executeQuery("SELECT box_id FROM USER;")) {
                while (rs.next()) {
                    userId = rs.getInt("box_id");
                }
            }
            stmt.close();
            conn.close();

            return userId;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            return null;
        }
    }
}
