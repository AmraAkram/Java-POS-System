package com.example.possystem.models;

public class Cart {
    private int cartId;
    private int productId;
    private int quantity;
    private double subTotal;
    private double total;
    private boolean discount;


    /**
     *
     * @param cartId
     * @param productId
     * @param quantity
     * @param subTotal
     * @param total
     * @param discount
     */
    public Cart(int cartId, int productId, int quantity, double subTotal, double total, boolean discount) {
        setCartId(cartId);
        setProductId(productId);
        setQuantity(quantity);
        setSubTotal(subTotal);
        setTotal(total);
        setDiscount (discount);
    }

    public int getCartId() {
        return cartId;
    }

    /**
     *
     * @param cartId
     */
    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getProductId() {
        return productId;
    }

    /**
     *
     * @param productId
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubTotal() {
        return subTotal;
    }

    /**
     *
     * @param subTotal
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    /**
     *
     * @param total
     */
    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isDiscount() {
        return discount;
    }

    /**
     *
     * @param discount
     */
    public void setDiscount(boolean discount) {
        this.discount = discount;
    }
}
