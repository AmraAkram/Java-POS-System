package com.example.possystem.models;

public class Product {
    // instance variables
    private int productId;
    private String productName;
    private double productPrice;
    private float productWeight;
    private String productManufacture;
    private double quantity;
    private int categoryId;

    public Product(int productId, String productName, double productPrice, float productWeight, String productManufacture, double quantity, int categoryId) {
        setProductId(productId);
        setProductName(productName);
        setProductPrice(productPrice);
        setProductWeight(productWeight);
        setProductManufacture(productManufacture);
        setQuantity(quantity);
        setCategoryId(categoryId);
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public float getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(float productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductManufacture() {
        return productManufacture;
    }

    public void setProductManufacture(String productManufacture) {
        this.productManufacture = productManufacture;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
