package com.thinklikepro.bankApplication.controller;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinklikepro.bankApplication.entity.Account;
import com.thinklikepro.bankApplication.service.BankService;

@RestController
@RequestMapping("/api/bank")
public class BankController {
	
	@Autowired
	private BankService bankservice;
	
	@PostMapping("/createAccount")
	public Account createAccount(@RequestBody Account account ){
		
		return bankservice.createAccount(account);
		
	}
	
	@GetMapping("/getAccount/{id}")
	public Account getAccount(@PathVariable long id) {
		
		return bankservice.getAccount(id).orElseThrow(() -> new RuntimeException("Account not found"));
		
	}
	
	@PostMapping("{id}/deposit")
	public Account deposit(@PathVariable long id,@RequestBody Map<String, Double> request) {
		double amount=request.get("amount");
		
		 return bankservice.deposit(id, amount);
		
	}
	
	@PostMapping("{id}/withdraw")
	public Account withdraw(@PathVariable long id, @RequestBody Map<String, Double> request)
	{
		
		double amount= request.get("amount");
		 return bankservice.withdraw(id, amount);
		
	}
	
	
	

}
