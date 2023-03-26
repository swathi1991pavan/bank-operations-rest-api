package com.example.todo.repository;




import com.example.todo.model.Accounts;

public interface AccountsRepository {

	public void createAccount(Accounts acct);

	public int getBalance(int acctID);

	public void depositAmount( int acctID,  int amount) ;

	public String withdrawAmount( int acctID, int amount) ;

	public String transferAmount( int acctID, int destAcctID, int amount) ;

	public Accounts getAccountInfo(int acctID);

	public void deleteAccount(int acctID);

	
	
	
	
	
}