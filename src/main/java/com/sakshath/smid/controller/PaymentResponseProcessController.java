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
import com.sakshath.smid.model.PaymentResponseProcess;
import com.sakshath.smid.repository.CancelTransactionRepository;
import com.sakshath.smid.repository.PaymentResponseProcessRepository;

@RequestMapping("/api/v1")

@RestController
public class PaymentResponseProcessController {
	@Autowired
	private PaymentResponseProcessRepository repo;
	@PostMapping("/createPaymentResponse")
	public ResponseEntity<PaymentResponseProcess> createAgreementsDetails(@RequestBody PaymentResponseProcess paymentResponseProcess){
	return ResponseEntity.ok().body(repo.save(paymentResponseProcess));
	}
	@GetMapping("/getPaymentResponse/{id}")
	public ResponseEntity<Optional<PaymentResponseProcess>> getEmployeeById(@PathVariable(value = "id") Long id)
			 {
		return ResponseEntity.ok().body(repo.findById(id));
	}
	@DeleteMapping("/deletePaymentResponse/{id}")
	public HttpStatus deleteEmployee(@PathVariable(value = "id") Long id) {
		this.repo.deleteById(id);
		return HttpStatus.OK;
	}
	@PutMapping("/updatePaymentResponse/{id}")
	public ResponseEntity<PaymentResponseProcess> updateEmployee(@PathVariable(value = "id") Long id,

			@RequestBody PaymentResponseProcess paymentResponseProcess) {
		paymentResponseProcess.setId(id);
		return ResponseEntity.ok().body(this.repo.save(paymentResponseProcess));
	}
}
