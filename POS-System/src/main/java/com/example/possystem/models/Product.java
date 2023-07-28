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
        if(productId > 0) {
            this.productId = productId;
        } else {
            throw new IllegalArgumentException("Product ID should be more than 0");
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if(!productName.trim().isBlank() && productName.trim().length() > 1) {
            this.productName = productName;
        } else {
            throw new IllegalArgumentException("Product name cannot blank and should contain more than 1 characters");
        }
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        if(productPrice > 0.0) {
            this.productPrice = productPrice;
        } else {
            throw new IllegalArgumentException("Product price should be more than 0$");
        }
    }

    public float getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(float productWeight) {
        if(productWeight > 0.0) {
            this.productWeight = productWeight;
        } else {
            throw new IllegalArgumentException("Product weight should be more than 0");
        }
    }

    public String getProductManufacture() {
        return productManufacture;
    }

    public void setProductManufacture(String productManufacture) {
        if(!productManufacture.trim().isBlank() && productManufacture.trim().length() > 1) {
            this.productManufacture = productManufacture;
        } else {
            throw new IllegalArgumentException("Product Manufacture cannot be blank and should contain at lease 2 characters");
        }
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        if(quantity >= 1) {
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException("Quantity should at least 1");
        }
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        if(categoryId > 0) {
            this.categoryId = categoryId;
        } else {
            throw new IllegalArgumentException("Category ID should be more than 0");
        }
    }
}
