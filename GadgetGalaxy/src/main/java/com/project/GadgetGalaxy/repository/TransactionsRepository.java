package com.project.GadgetGalaxy.repository;

import com.project.GadgetGalaxy.model.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface TransactionsRepository extends JpaRepository<Transactions, Long> {
    @Transactional
    @Modifying
    @Query(value = "DELETE FROM Transactions t WHERE t.productTransaction.productName = :productName")
    void deleteTransactionByProductName(@Param("productName") String productName);
}