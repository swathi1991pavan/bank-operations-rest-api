package com.example.todo.model;

import javax.persistence.*;




@Entity
@Table(name="logger")
public class Logger {

	@Id
    @Column(name="acctid")
	private int acctID;

    @Column(name="transactype")
	private String transacType;

    @Column(name="transacstatus")
	private String transacStatus;

    @Column(name="initbal")
	private int initBal;

    @Column(name="finalbal")
	private int finalBal;

	public Logger() {

	}

	public Logger(int acctID, String transacType, String transacStatus, int initBal, int finalBal) {
		super();
		this.acctID = acctID;
		this.transacType = transacType;
		this.transacStatus = transacStatus;
		this.initBal = initBal;
		this.finalBal = finalBal;
	}

	public int getAcctID() {
		return acctID;
	}

	public void setAcctID(int acctID) {
		this.acctID = acctID;
	}

	public String getTransacType() {
		return transacType;
	}

	public void setTransacType(String transacType) {
		this.transacType = transacType;
	}

	public String getTransacStatus() {
		return transacStatus;
	}

	public void setTransacStatus(String transacStatus) {
		this.transacStatus = transacStatus;
	}

	public int getInitBal() {
		return initBal;
	}

	public void setInitBal(int initBal) {
		this.initBal = initBal;
	}

	public int getFinalBal() {
		return finalBal;
	}

	public void setFinalBal(int finalBal) {
		this.finalBal = finalBal;
	}

}
