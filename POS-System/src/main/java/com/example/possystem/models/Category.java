package com.example.possystem.models;

public class Category {
    // instance variable
    private int categoryId;
    private String categoryName;

    /**
     *
     * @param categoryId
     * @param categoryName
     */
    public Category(int categoryId, String categoryName) {
        setCategoryId(categoryId);
        setCategoryName( categoryName);
    }

    // Get Category ID
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * This method will validate that the category id is greater than 0
     * @param categoryId
     */
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

    /**
     * This method will valid that the category name is not empty and also has at least 2 characters
     * @param categoryName
     */
    public void setCategoryName(String categoryName) {
        if (categoryName.length() > 2 && !categoryName.isBlank()) {
            this.categoryName = categoryName;
        }
        else {
            throw new IllegalArgumentException("the category name cannot be empty and must contain characters more 2");
        }
    }
}
