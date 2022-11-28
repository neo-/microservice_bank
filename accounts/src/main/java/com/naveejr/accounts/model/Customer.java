package com.naveejr.accounts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Customer {

	@Id
	private Long customerId;
	private String customerName;
	private String address;
}
