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
@Table(name = "CANCEL_TRANSACTION")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CancelTransaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;
	private String merchantID;
	private String orderID;
	private String pGTransactionReferenceNo;
	private String addlField2;
	private String addlField3;
	private String addlField4;
	private String addlField5;
	private String addlField6;
	
	private Date transactionDateTime;
}
