/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.apiclient.auth;

import java.math.BigDecimal;

/**
 *
 * @author geezylucas
 */
public class AuthRequest {

    private String username;
    private String password;
    private BigDecimal cashInBox;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getCashInBox() {
        return cashInBox;
    }

    public void setCashInBox(BigDecimal cashInBox) {
        this.cashInBox = cashInBox;
    }

}
