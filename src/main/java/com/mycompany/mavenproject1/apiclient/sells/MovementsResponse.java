/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.apiclient.sells;

import java.sql.Timestamp;

/**
 *
 * @author User
 */
public class MovementsResponse {

    private int id;
    private String operation;
    private int quantity;
    private String category;
    private Timestamp createdSell;
    private String productName;
    private String cashier;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    public Timestamp getCreatedSell() {
        return createdSell;
    }

    public void setCreatedSell(Timestamp createdSell) {
        this.createdSell = createdSell;
    }

}
