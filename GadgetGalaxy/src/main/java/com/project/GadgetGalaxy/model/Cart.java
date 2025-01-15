package com.project.GadgetGalaxy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartItemID;

    @ManyToOne
    @JoinColumn(name = "userID")
    @JsonIgnore
    private Users userCart;

    @ManyToOne
    @JoinColumn(name = "productID")
    @JsonIgnore
    private Product productCart;

    private int quantity;
    private double totalPrice;

    public Cart(Users userCart, Product productCart, int quantity, double totalPrice) {
        this.userCart = userCart;
        this.productCart = productCart;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public Cart() {
    }

}
