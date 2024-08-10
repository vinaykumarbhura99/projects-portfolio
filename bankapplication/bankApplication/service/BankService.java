package com.thinklikepro.bankApplication.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinklikepro.bankApplication.entity.Account;
import com.thinklikepro.bankApplication.repository.BankRepository;

@Service
public class BankService {

	@Autowired
	private BankRepository bankrepository;

	public Account createAccount(Account account) {
		return bankrepository.save(account);

	}

	public Optional<Account> getAccount(long id) {
		return bankrepository.findById(id);

	}

	public Account deposit(long id, double amount) {

		Account account = getAccount(id).orElseThrow(() -> new RuntimeException("Account not found"));
		account.setBalance(account.getBalance() + amount);

		return bankrepository.save(account);

	}

	public Account withdraw(long id, double amount) {

		Account account = getAccount(id).orElseThrow(() -> new RuntimeException("Account not found"));
		if (account.getBalance() < amount)
			throw new RuntimeException("insufficient balance");
		else
			account.setBalance(account.getBalance() - amount);

		return bankrepository.save(account);

	}

}
