package com.naveejr.accounts.controller;

import com.naveejr.accounts.model.Account;
import com.naveejr.accounts.model.Customer;
import com.naveejr.accounts.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("accounts")
@RequiredArgsConstructor
public class AccountsController {

	private final AccountRepository accountRepository;


	@GetMapping
	public ResponseEntity<Account> getAccountDetails(@RequestBody Customer customer) {
		Account account = accountRepository.findByCustomerId(customer.getCustomerId());
		return ResponseEntity.ok(account);
	}

}
