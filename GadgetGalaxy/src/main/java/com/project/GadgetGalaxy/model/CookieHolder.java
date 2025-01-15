package com.project.GadgetGalaxy.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table
public class CookieHolder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cookieHolderID;

    private String cookieValue;

    public CookieHolder(String cookieValue) {
        this.cookieValue = cookieValue;
    }

    public CookieHolder() {
    }

}
