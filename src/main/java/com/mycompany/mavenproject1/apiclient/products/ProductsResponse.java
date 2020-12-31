/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.apiclient.products;

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
    private Double priceIn;
    private Double priceOut1;
    private Double priceOut2;
    private Double priceOut3;
    private String unit;
    private String presentation;
    private String createdAt;
    private String updatedAt;
    private int userByUserId;
    private int categoryByCategoryId;
    private boolean active;
    private boolean bulk;

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

    public Double getPriceIn() {
        return priceIn;
    }

    public void setPriceIn(Double priceIn) {
        this.priceIn = priceIn;
    }

    public Double getPriceOut1() {
        return priceOut1;
    }

    public void setPriceOut1(Double priceOut1) {
        this.priceOut1 = priceOut1;
    }

    public Double getPriceOut2() {
        return priceOut2;
    }

    public void setPriceOut2(Double priceOut2) {
        this.priceOut2 = priceOut2;
    }

    public Double getPriceOut3() {
        return priceOut3;
    }

    public void setPriceOut3(Double priceOut3) {
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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(int userByUserId) {
        this.userByUserId = userByUserId;
    }

    public int getCategoryByCategoryId() {
        return categoryByCategoryId;
    }

    public void setCategoryByCategoryId(int categoryByCategoryId) {
        this.categoryByCategoryId = categoryByCategoryId;
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

}
