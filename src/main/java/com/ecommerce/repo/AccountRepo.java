package com.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.domain.Account;

public interface AccountRepo extends JpaRepository<Account, String> {
	
	Account findByUserName(String userName);

}
