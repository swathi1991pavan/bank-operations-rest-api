package com.example.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.model.Accounts;
import com.example.todo.model.Logger;
import com.example.todo.service.AccountsJpaService;

@RestController
public class AccountsController {
	@Autowired
	private AccountsJpaService accountService;
	
	@Autowired
	private LoggerController loggerController;

	// createAccount happens upon createCustomer
	public void createAccount(int acctID, int balance, String acctStatus) {
		Accounts acct = new Accounts(acctID, balance, acctStatus);
		accountService.createAccount(acct);
	}

	// checkBalance
	@GetMapping("/account/{acctID}/balance")
	
	public int getBalance(@PathVariable("acctID") int acctID) {
		return accountService.getBalance(acctID);
	}

	// depositAmount
	

	
	@PutMapping("/account/{acctID}/deposit/{amount}")
	public void depositAmount(@PathVariable("acctID") int acctID, @PathVariable("amount") int amount) {
	  accountService.depositAmount(acctID, amount);
	}

	
	
	// withdrawAmount
	@PutMapping("/account/{acctID}/withdraw/{amount}")
	public String withdrawAmount(@PathVariable("acctID") int acctID, @PathVariable("amount") int amount) {
		accountService.withdrawAmount(acctID, amount);
		return "withdrawal done successfull";
		}
		

	// transferAmount
	@PutMapping("/account/{acctID}/transfer/{destAcctID}/{amount}")
	public void transferAmount(@PathVariable("acctID") int acctID, @PathVariable("destAcctID") int destAcctID, @PathVariable("amount") int amount) {
			accountService.transferAmount(acctID, destAcctID, amount);
		}

	// deleteAccount
	@DeleteMapping("/account/{acctID}")
	public void deleteAccount(@PathVariable("acctID") int acctID) {
		accountService.deleteAccount(acctID);
		loggerController.deleteLog(acctID);
	}

	// getAccountInfo
	@GetMapping("/account/{acctID}")
	public Accounts getAccountInfo(@PathVariable("acctID") int acctID) {
		return accountService.getAccountInfo(acctID);
	}

}
