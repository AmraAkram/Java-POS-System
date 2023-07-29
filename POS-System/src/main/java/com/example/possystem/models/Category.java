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
        if (categoryId > 0){
            this.categoryId = categoryId;
        }
        else {
            throw new IllegalArgumentException("The category ID should be greater than 0");
        }
    }

    // Get Category Name
    public String getCategoryName() {
        return categoryName;
    }

    // Set Category Name
    public void setCategoryName(String categoryName) {
        if (categoryName.length() > 1 && !categoryName.isBlank()) {
            this.categoryName = categoryName;
        }
        else {
            throw new IllegalArgumentException("the category name cannot be empty and must contain characters more 1");
        }
    }
}
