package com.example.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo.repository.CustomerRepository;
import com.example.todo.repository.CustomerJpaRepository;
import com.example.todo.model.Customer;
import com.example.todo.controller.AccountsController;

@Service
public class CustomerJpaService implements CustomerRepository{
	@Autowired
	private CustomerJpaRepository customerJpaRepository;

	@Autowired
	private AccountsController accountController;

	public void createCustomer(Customer customer) {
		customerJpaRepository.save(customer);
		accountController.createAccount(customer.getAcctID(), 0, "Active");
	}

	public Customer getCustomerInfo(int acctID) {
		return customerJpaRepository.findById(acctID).orElse(null);
	}

	public void deleteCustomer(int acctID) {
		customerJpaRepository.deleteById(acctID);
	}
	}
