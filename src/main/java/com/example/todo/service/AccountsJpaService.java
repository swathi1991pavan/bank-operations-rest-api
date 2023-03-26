package com.example.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo.repository.AccountsRepository;
import com.example.todo.repository.AccountsJpaRepository;
import com.example.todo.model.Accounts;

import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import com.example.todo.model.Logger;
import com.example.todo.service.LoggerJpaService;

@Service
public class AccountsJpaService implements AccountsRepository{
	@Autowired
	private AccountsJpaRepository accountsJpaRepository;

	@Autowired
	private LoggerJpaService loggerService;

    @Override
	public void createAccount(Accounts acct) {
		accountsJpaRepository.save(acct);
	}
    
	@Override
    public int getBalance(int acctID) {
		Accounts account= accountsJpaRepository.findById(acctID).get();
	
      return account.getBalance();
	}
    
	
	
	@Override
	public void depositAmount(int acctID, int amount) {
		try{
		Accounts account = accountsJpaRepository.findById(acctID).get();
	
		int initbal = account.getBalance() ;
		int bal=initbal+ amount;
		account.setBalance(bal);
		Logger logger = new Logger(acctID, "Deposited", "Success", initbal, initbal + amount);
		loggerService.addLog(logger);
		System.out.println( "Amount Deposited Successfully");
		}
        catch(Exception e){
			 throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}    

		
	}
     @Override
	public String withdrawAmount(int acctID, int amount) {
		try{
		Accounts account = accountsJpaRepository.findById(acctID).get();
		int initbal = account.getBalance();
		int bal=initbal - amount;
		account.setBalance(bal);
		Logger logger = new Logger(acctID, "Withdrawn", "Success",initbal, initbal - amount);
		loggerService.addLog(logger);
		return "withdrawal done successfull";
		}
		catch(Exception e){
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	
		}
	}
    @Override
	public String transferAmount(int acctID, int destAcctID, int amount) {
		try{
		withdrawAmount(acctID, amount);
		depositAmount(destAcctID, amount);
		return "Transferred Amount successfull";
		}
		catch(Exception e){
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	
		}
	}


	public Accounts getAccountInfo(int acctID) {
		Accounts account= accountsJpaRepository.findById(acctID).get();
		return account;
	}

	public void deleteAccount(int acctID) {
		accountsJpaRepository.deleteById(acctID);
	}

	

	

	

}