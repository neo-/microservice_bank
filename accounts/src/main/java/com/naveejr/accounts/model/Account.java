package com.naveejr.accounts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter @Setter
public class Account {
	private Long customerId;

	@Id
	private Long accountId;

	private String accountType;
	private String branchAddress;
	private LocalDate createdDate;
}
