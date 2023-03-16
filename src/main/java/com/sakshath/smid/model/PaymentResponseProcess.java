package com.sakshath.smid.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "PaymentResponse")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PaymentResponseProcess {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;
	
	private String transactionReferenceNo;
	private String orderID;
	private String transactionAmount;
	private String statusCode;
	private String statusDescription;
	private String bankReferenceNumber;
	private String authzcode;
	private String responseCode;
	private String addlField2;
	private String addlField3;
	private String addlField4;
	private String addlField5;
	private String addlField6;
	
	private Date transactionDateTime;

	
	

}
