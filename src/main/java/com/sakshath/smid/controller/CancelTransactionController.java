package com.sakshath.smid.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakshath.smid.model.CancelTransaction;
import com.sakshath.smid.model.PaymentRequestProcess;
import com.sakshath.smid.model.TransactionStatusEnquiry;
import com.sakshath.smid.repository.CancelTransactionRepository;
import com.sakshath.smid.repository.PaymentRequestProcessRepository;
@RequestMapping("/api/v1")

@RestController
public class CancelTransactionController {
	@Autowired
	private CancelTransactionRepository repo;
	
	@PostMapping("/createCancelTransaction")
	public ResponseEntity<CancelTransaction> createAgreementsDetails(@RequestBody CancelTransaction cancelTransaction){
	return ResponseEntity.ok().body(repo.save(cancelTransaction));
	}
	@GetMapping("/getCancelTransaction/{id}")
	public ResponseEntity<Optional<CancelTransaction>> getEmployeeById(@PathVariable(value = "id") Long id)
			 {
		return ResponseEntity.ok().body(repo.findById(id));
	}
	
	@DeleteMapping("/deleteCancelTransaction/{id}")
	public HttpStatus deleteEmployee(@PathVariable(value = "id") Long id) {
		this.repo.deleteById(id);
		return HttpStatus.OK;
	}
	@PutMapping("/updatePaymentProcess/{id}")
	public ResponseEntity<CancelTransaction> updateEmployee(@PathVariable(value = "id") Long id,

			@RequestBody CancelTransaction cancelTransaction) {
		cancelTransaction.setId(id);
		return ResponseEntity.ok().body(this.repo.save(cancelTransaction));
	}
}
