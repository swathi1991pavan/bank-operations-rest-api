package com.example.todo.model;

import javax.persistence.*;


@Entity
@Table(name="accounts")
public class Accounts {
	@Id
    @Column(name="acctid")
	private int acctID;

	@Column(name="balance")
	private int balance;

	@Column(name="acctstatus")
	private String acctStatus;

	public Accounts() {

	}

	public Accounts(int acctID, int balance, String acctStatus) {
		super();
		this.acctID = acctID;
		this.balance = balance;
		this.acctStatus = acctStatus;
	}

	public int getAcctID() {
		return acctID;
	}

	public void setAcctID(int acctID) {
		this.acctID = acctID;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAcctStatus() {
		return acctStatus;
	}

	public void setAcctStatus(String acctStatus) {
		this.acctStatus = acctStatus;
	}

}