/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.apiclient.products;

import java.math.BigDecimal;

/**
 *
 * @author geezylucas
 */
public class AddProductRequest {

    private String barcode;
    private String name;
    private String description;
    private BigDecimal priceIn;
    private BigDecimal priceOut1;
    private BigDecimal priceOut2;
    private BigDecimal priceOut3;
    private int inventoryMin;
    private boolean active;
    private String unit;
    private boolean bulk;
    private UserByUserId userByUserId;
    private CategoryByCategoryId categoryByCategoryId;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPriceIn() {
        return priceIn;
    }

    public void setPriceIn(BigDecimal priceIn) {
        this.priceIn = priceIn;
    }

    public BigDecimal getPriceOut1() {
        return priceOut1;
    }

    public void setPriceOut1(BigDecimal priceOut1) {
        this.priceOut1 = priceOut1;
    }

    public BigDecimal getPriceOut2() {
        return priceOut2;
    }

    public void setPriceOut2(BigDecimal priceOut2) {
        this.priceOut2 = priceOut2;
    }

    public BigDecimal getPriceOut3() {
        return priceOut3;
    }

    public void setPriceOut3(BigDecimal priceOut3) {
        this.priceOut3 = priceOut3;
    }

    public int getInventoryMin() {
        return inventoryMin;
    }

    public void setInventoryMin(int inventoryMin) {
        this.inventoryMin = inventoryMin;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public boolean isBulk() {
        return bulk;
    }

    public void setBulk(boolean bulk) {
        this.bulk = bulk;
    }

    public UserByUserId getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(UserByUserId userByUserId) {
        this.userByUserId = userByUserId;
    }

    public CategoryByCategoryId getCategoryByCategoryId() {
        return categoryByCategoryId;
    }

    public void setCategoryByCategoryId(CategoryByCategoryId categoryByCategoryId) {
        this.categoryByCategoryId = categoryByCategoryId;
    }

}
