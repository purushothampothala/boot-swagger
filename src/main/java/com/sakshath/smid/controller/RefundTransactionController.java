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

import com.sakshath.smid.model.PaymentResponseProcess;
import com.sakshath.smid.model.RefundTransaction;
import com.sakshath.smid.repository.PaymentResponseProcessRepository;
import com.sakshath.smid.repository.RefundTransactionRepository;

@RequestMapping("/api/v1")

@RestController
public class RefundTransactionController {
	@Autowired
	private RefundTransactionRepository repo;
	@PostMapping("/createRefundTransaction")
	public ResponseEntity<RefundTransaction> createRefundTransaction(@RequestBody RefundTransaction refundTransaction){
	return ResponseEntity.ok().body(repo.save(refundTransaction));
	}
	@GetMapping("/getRefundTransaction/{id}")
	public ResponseEntity<Optional<RefundTransaction>> getEmployeeById(@PathVariable(value = "id") Long id)
			 {
		return ResponseEntity.ok().body(repo.findById(id));
	}
	@DeleteMapping("/deleteRefundTransaction/{id}")
	public HttpStatus deleteEmployee(@PathVariable(value = "id") Long id) {
		this.repo.deleteById(id);
		return HttpStatus.OK;
	}
	@PutMapping("/updateRefundTransaction/{id}")
	public ResponseEntity<RefundTransaction> updateEmployee(@PathVariable(value = "id") Long id,

			@RequestBody RefundTransaction refundTransaction) {
		refundTransaction.setId(id);
		return ResponseEntity.ok().body(this.repo.save(refundTransaction));
	}
}
