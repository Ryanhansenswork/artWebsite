package com.art.app.rest.Models;



import jakarta.persistence.*;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartId;

    @Column(name = "cart_product")
    private String cartProduct;

    @Column(name = "product_id")
    private int productId;

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public String getCartProduct() {
        return cartProduct;
    }

    public void setCartProduct(String cartProduct) {
        this.cartProduct = cartProduct;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
