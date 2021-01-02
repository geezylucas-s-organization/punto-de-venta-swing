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
public class ProductsResponse {

    private int id;
    private String image;
    private String barcode;
    private String name;
    private String description;
    private int inventoryMin;
    private BigDecimal priceIn;
    private BigDecimal priceOut1;
    private BigDecimal priceOut2;
    private BigDecimal priceOut3;
    private String unit;
    private String presentation;
    private boolean active;
    private boolean bulk;
    private String category;
    private Integer stock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

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

    public int getInventoryMin() {
        return inventoryMin;
    }

    public void setInventoryMin(int inventoryMin) {
        this.inventoryMin = inventoryMin;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isBulk() {
        return bulk;
    }

    public void setBulk(boolean bulk) {
        this.bulk = bulk;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

}
