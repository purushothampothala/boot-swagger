package com.sakshath.smid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sakshath.smid.model.CancelTransaction;

public interface CancelTransactionRepository extends JpaRepository<CancelTransaction,Long> {

}
