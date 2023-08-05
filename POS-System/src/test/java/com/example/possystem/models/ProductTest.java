package com.example.possystem.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product;

    @BeforeEach
    void setUp() {
        product = new Product(125, "Apple", 2.49, 1, "Canadian Farmers", 56, 256);
    }

    @Test
    void setProductId() {
        product.setProductId();
    }

    @Test
    void setProductName() {
    }

    @Test
    void setProductPrice() {
    }

    @Test
    void setProductWeight() {
    }

    @Test
    void setProductManufacture() {
    }

    @Test
    void setQuantity() {
    }

    @Test
    void setCategoryId() {
    }
}