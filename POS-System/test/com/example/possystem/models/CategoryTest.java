package com.example.possystem.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    private Category category;

    @BeforeEach
    void setUp() {
        category = new Category(12, "veg");
    }

    /**
     * testing category id with valid input
     */
    @Test
    void setCategoryId() {
        assertEquals(12, category.getCategoryId());
    }

    /**
     * testing category id with invalid input which is less than 0
     */
    @Test
    void setCategoryIdInvalid(){
        try {
            category.setCategoryId(-12);
            fail("The category ID should be greater than 0");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * testing Category name with valid input
     */
    @Test
    void setCategoryName() {
        assertEquals("veg", category.getCategoryName());
    }

    /**
     *  testing category name with empty string
     */
    @Test
    void setCategoryNameEmpty(){
        try {
            category.setCategoryName("      ");
            fail("the category name cannot be empty and must contain characters more 2");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * testing category name with invalid input which a string with less than or equal to 2 characters
     */
    @Test
    void setCategoryNameInvalid(){
        try {
            category.setCategoryName("A");
            fail("the category name cannot be empty and must contain characters more 2");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}