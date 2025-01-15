package com.project.GadgetGalaxy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productID;

    private String productName;

    @ManyToOne
    @JoinColumn(name = "ProductCategory")
    @JsonIgnore
    private Category productCategory;

    @OneToMany(mappedBy = "productTransaction")
    @JsonIgnore
    private List<Transactions> transactionsOfUser;

    @OneToMany(mappedBy = "productCart")
    @JsonIgnore
    private List<Cart> cartsOfProduct;

    @OneToMany(mappedBy = "productWishlist")
    @JsonIgnore
    private List<Wishlist> wishlistsOfProduct;

    private double productPrice;
    private String productShortDescription;
    private String productDescription;
    private int productQuantity;
    private String productImage;

    public Product(String productName, Category productCategory, double productPrice, String productShortDescription, String productDescription, int productQuantity, String productImage) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
        this.productShortDescription = productShortDescription;
        this.productDescription = productDescription;
        this.productQuantity = productQuantity;
        this.productImage = productImage;
    }

    public Product(String productName, double productPrice, String productShortDescription, String productDescription, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productShortDescription = productShortDescription;
        this.productDescription = productDescription;
        this.productQuantity = productQuantity;
    }

    public Product() {
    }

}
