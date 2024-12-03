package com.art.app.rest.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Base64;

@Entity
public class Products 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer product_id;
    @Column(name = "product_name")
    private String product_name;
    @Column(name = "product_description")
    private String productDescription;
    @Column
    private double price;
    //images stored in mysql as BLOB!!!
    @Column(name = "image")
    private byte[] image;


    public long getId() {
        return product_id;
    }

    public void setId(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProductName() {
        return product_name;
    }

    public void setProductName(String product_name) {
        this.product_name = product_name;
    }
    //productdesc
     public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageBase64() {
        if (image != null) {
            return Base64.getEncoder().encodeToString(image);
        }
        return null; 
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
