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

import com.sakshath.smid.model.RefundTransaction;
import com.sakshath.smid.model.TransactionStatusEnquiry;
import com.sakshath.smid.repository.TransactionStatusEnquiryRepository;

@RequestMapping("/api/v1")

@RestController
public class TransactionStatusEnquiryController {
	@Autowired
	private TransactionStatusEnquiryRepository repo;
	
	@PostMapping("/createTransactionStatusEnquiry")
	public ResponseEntity<TransactionStatusEnquiry> createRefundTransaction(@RequestBody TransactionStatusEnquiry transactionStatusEnquiry){
	return ResponseEntity.ok().body(repo.save(transactionStatusEnquiry));

}
	@GetMapping("/getTransactionStatusEnquiry/{id}")
	public ResponseEntity<Optional<TransactionStatusEnquiry>> getEmployeeById(@PathVariable(value = "id") Long id)
			 {
		return ResponseEntity.ok().body(repo.findById(id));
	}
	@DeleteMapping("/deleteTransactionStatusEnquiry/{id}")
	public HttpStatus deleteEmployee(@PathVariable(value = "id") Long id) {
		this.repo.deleteById(id);
		return HttpStatus.OK;
	}
	@PutMapping("/updateTransactionStatusEnquiry/{id}")
	public ResponseEntity<TransactionStatusEnquiry> updateEmployee(@PathVariable(value = "id") Long id,

			@RequestBody TransactionStatusEnquiry transactionStatusEnquiry) {
		transactionStatusEnquiry.setId(id);
		return ResponseEntity.ok().body(this.repo.save(transactionStatusEnquiry));
	}
}