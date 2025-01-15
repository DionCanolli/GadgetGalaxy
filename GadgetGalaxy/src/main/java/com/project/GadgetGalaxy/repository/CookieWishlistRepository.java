package com.project.GadgetGalaxy.repository;

import com.project.GadgetGalaxy.model.CookieWishlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CookieWishlistRepository extends JpaRepository<CookieWishlist, Long> {

    List<CookieWishlist> findAllCookieWishlistByCookieWishlistCookieValueCookieValue(String cookieValue);

    CookieWishlist findCookieWishlistByCookieWishlistCookieValueCookieValueAndCookieWishlistProductProductID(
            String cookieValue, Long productID);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM CookieWishlist cw WHERE cw.cookieWishlistCookieValue.cookieValue = :cookieValue" +
            " AND cw.cookieWishlistProduct.productName = :productName")
    void deleteCookieWishlistItemByCookieValueAndProductName(@Param("cookieValue") String cookieValue,
                                                             @Param("productName") String productName);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM CookieWishlist cw WHERE cw.cookieWishlistProduct.productName = :productName")
    void deleteCookieWishlistItemByProductName(@Param("productName") String productName);
}
