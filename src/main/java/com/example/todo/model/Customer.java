package com.example.todo.model;

import javax.persistence.*;


@Entity

@Table(name="customer")
public class Customer {

	@Id
    @Column(name = "acctid")
	private int acctID;

    
    @Column(name = "custname")    
	private String custName;
    @Column(name = "city")
	private String city;
    @Column(name = "state")
	private String state;
    @Column(name = "country")
	private String country;
    @Column(name = "phoneno")
	private int phoneNo;
    @Column(name = "password")
	private String password;

	public Customer() {

	}

	public Customer(int acctID, String custName, String city, String state, String country, int phoneNo,
			String password) {
		super();
		this.acctID = acctID;
		this.custName = custName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.phoneNo = phoneNo;
		this.password = password;
	}

	public int getAcctID() {
		return acctID;
	}

	public void setAcctID(int acctID) {
		this.acctID = acctID;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
