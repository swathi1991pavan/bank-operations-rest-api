package com.example.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.model.Customer;
import com.example.todo.service.CustomerJpaService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerJpaService customerService;
	
     @Autowired
	 private AccountsController accountController;
	 
	@PostMapping("/customer")
	public void createCustomer(@RequestBody Customer customer) {
		customerService.createCustomer(customer);
		accountController.createAccount(customer.getAcctID(), 0, "Active");
	
		}

	@GetMapping("/customer/{acctID}")
	public Customer getCustomerInfo(@PathVariable int acctID) {
		return customerService.getCustomerInfo(acctID);
	}

	@DeleteMapping("/customer/{acctID}")
	public void deleteCustomer(@PathVariable int acctID) {
		customerService.deleteCustomer(acctID);
	}

}
