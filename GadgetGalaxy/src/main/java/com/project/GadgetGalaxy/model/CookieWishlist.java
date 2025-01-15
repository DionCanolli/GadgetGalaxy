package com.project.GadgetGalaxy.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table
public class CookieWishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cookieWishlistID;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "CookieWishlistCookieValue", referencedColumnName = "cookieValue")
    private CookieHolder cookieWishlistCookieValue;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "CookieWishlistProduct", referencedColumnName = "productId")
    private Product cookieWishlistProduct;

    public CookieWishlist(CookieHolder cookieWishlistCookieValue, Product cookieWishlistProduct) {
        this.cookieWishlistCookieValue = cookieWishlistCookieValue;
        this.cookieWishlistProduct = cookieWishlistProduct;
    }

    public CookieWishlist() {
    }

}
