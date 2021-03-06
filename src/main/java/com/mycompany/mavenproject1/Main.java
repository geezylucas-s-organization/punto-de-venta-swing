/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.sqlite.SQLiteJDBC;
import javax.swing.JFrame;

/**
 *
 * @author geezylucas
 */
public class Main {

    public static void main(String[] args) {
        load();
    }

    private static String checkUserData() {
        SQLiteJDBC sqlite = new SQLiteJDBC();
        sqlite.createUserTable();

        return sqlite.getToken();
    }

    public static void load() {
        SplashForm splash = new SplashForm();
        splash.setLocationRelativeTo(null);
        splash.setVisible(true);

        String token = checkUserData();

        splash.setVisible(false);

        if (token == null) {
            LoginForm loginForm = new LoginForm();
            loginForm.setLocationRelativeTo(null);
            loginForm.setVisible(true);
        } else {
            MainApplication mainApp = new MainApplication();
            mainApp.setLocationRelativeTo(null);
            mainApp.setExtendedState(JFrame.MAXIMIZED_BOTH);
            mainApp.setVisible(true);
        }

        splash.dispose();
    }
}
