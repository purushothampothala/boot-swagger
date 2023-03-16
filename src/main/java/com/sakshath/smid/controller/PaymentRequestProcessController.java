package com.sakshath.smid.controller;

import java.util.List;
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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.sakshath.smid.model.CancelTransaction;
import com.sakshath.smid.model.PaymentRequestProcess;
import com.sakshath.smid.repository.PaymentRequestProcessRepository;

@RequestMapping("api/v1")
@RestController
public class PaymentRequestProcessController {
	@Autowired
	private PaymentRequestProcessRepository repo;
	
	@PostMapping("/createPaymentRequestProcess")
	public ResponseEntity<PaymentRequestProcess> createAgreementsDetails(@RequestBody PaymentRequestProcess paymentRequestProcess){
	return ResponseEntity.ok().body(repo.save(paymentRequestProcess));
	}
	@GetMapping("/getPaymentRequestProcess/{id}")
	public ResponseEntity<Optional<PaymentRequestProcess>> getEmployeeById(@PathVariable(value = "id") Long id)
			 {
		return ResponseEntity.ok().body(repo.findById(id));
	}
	@DeleteMapping("/deletePaymentRequestProcess/{id}")
	public HttpStatus deleteEmployee(@PathVariable(value = "id") Long id) {
		this.repo.deleteById(id);
		return HttpStatus.OK;
	}
	@PutMapping("/updatePaymentRequestProcess/{id}")
	public ResponseEntity<PaymentRequestProcess> updateEmployee(@PathVariable(value = "id") Long id,

			@RequestBody PaymentRequestProcess paymentRequestProcess) {
		paymentRequestProcess.setId(id);
		return ResponseEntity.ok().body(this.repo.save(paymentRequestProcess));
	}
}
