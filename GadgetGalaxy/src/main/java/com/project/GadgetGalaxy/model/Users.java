package com.project.GadgetGalaxy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@Entity
@Table
@Getter
@Setter
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;
    @NotBlank(message = "First name is required")
    @Size(min = 3, message = "First name must be at least 3 characters long")
    private String userFirstName;
    @NotBlank(message = "Last name is required")
    @Size(min = 3, message = "Last name must be at least 3 characters long")
    private String userLastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Please provide a valid email address")
    private String userEmail;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    private String userPassword;

    @ManyToOne
    @JoinColumn(name = "UserRole")
    private Roles userRole;

    @Setter
    @OneToMany(mappedBy = "userTransaction")
    private List<Transactions> transactionsOfUser;

    @OneToMany(mappedBy = "userCart")
    private List<Cart> cartOfUser;

    @OneToMany(mappedBy = "userWishlist")
    private List<Wishlist> wishlistOfUser;

    @Transient
    @NotBlank(message = "Confirm Password is required")
    private String confirmPassword;

    public Users(String userFirstName, String userLastName, String userEmail, String userPassword, Roles userRole) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userRole = userRole;
    }

    public Users() {
    }
}
