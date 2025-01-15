package com.project.GadgetGalaxy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table
public class CookieCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cookieCartID;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "CookieCartCookieValue", referencedColumnName = "cookieValue")
    @JsonIgnore
    private CookieHolder cookieCartCookieValue;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "CookieCartProduct", referencedColumnName = "productId")
    @JsonIgnore
    private Product cookieCartProduct;

    private int quantity;
    private double totalPrice;

    public CookieCart(CookieHolder cookieCartCookieValue, Product cookieCartProduct, int quantity, double totalPrice) {
        this.cookieCartCookieValue = cookieCartCookieValue;
        this.cookieCartProduct = cookieCartProduct;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public CookieCart() {
    }

}
