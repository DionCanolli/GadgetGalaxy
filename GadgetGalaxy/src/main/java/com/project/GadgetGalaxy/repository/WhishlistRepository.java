package com.project.GadgetGalaxy.repository;

import com.project.GadgetGalaxy.model.Transactions;
import com.project.GadgetGalaxy.model.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface WhishlistRepository extends JpaRepository<Wishlist, Long> {

    List<Wishlist> findAllWishlistByUserWishlistUserEmail(String userEmail);

    Wishlist findWishlistByUserWishlistUserEmailAndProductWishlistProductID(String userEmail, Long productID);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM Wishlist w WHERE w.userWishlist.userEmail = :userEmail" +
            " AND w.productWishlist.productName = :productName")
    void deleteWishlistItemByUserEmailAndProductName(@Param("userEmail") String userEmail,
                                                     @Param("productName") String productName);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM Wishlist w WHERE w.productWishlist.productName = :productName")
    void deleteWishlistItemByProductName(@Param("productName") String productName);
}
