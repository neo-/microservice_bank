package com.naveejr.accounts.repository;

import com.naveejr.accounts.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

	Account findByCustomerId(Long customerId);

}
