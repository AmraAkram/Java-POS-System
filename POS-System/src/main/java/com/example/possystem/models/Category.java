package com.example.possystem.models;

public class Category {
    // instance variable
    private int categoryId;
    private String categoryName;

    // Constructor
    public Category(int categoryId, String categoryName) {
        setCategoryId(categoryId);
        setCategoryName( categoryName);
    }

    // Get Category ID
    public int getCategoryId() {
        return categoryId;
    }

    // Set Category ID
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    // Get Category Name
    public String getCategoryName() {
        return categoryName;
    }

    // Set Category Name
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
