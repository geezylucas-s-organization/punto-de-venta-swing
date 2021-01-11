/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.apiclient.sales;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author User
 */
public class SaleRequest {

    private int userId;
    private int boxId;
    private int personId;
    private BigDecimal total;
    private BigDecimal cash;
    private List<ProductsSaleRequest> products;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBoxId() {
        return boxId;
    }

    public void setBoxId(int boxId) {
        this.boxId = boxId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getCash() {
        return cash;
    }

    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    public List<ProductsSaleRequest> getProducts() {
        return products;
    }

    public void setProducts(List<ProductsSaleRequest> products) {
        this.products = products;
    }

}
