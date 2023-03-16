package com.sakshath.smid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sakshath.smid.model.RefundTransaction;

public interface RefundTransactionRepository extends JpaRepository<RefundTransaction,Long> {

}
