package com.art.app.rest.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Products 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer product_id;
    @Column
    private String product_name;
    @Column
    private String product_description;
    @Column
    private double price;
    //images stored in mysql as BLOB!!!
    @Column
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
        return product_description;
    }

    public void setProductDescription(String product_description) {
        this.product_description = product_description;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
