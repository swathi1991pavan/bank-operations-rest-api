package com.example.todo.repository;

import com.example.todo.model.Customer;

public interface CustomerRepository{
    public void createCustomer(Customer customer);

    public Customer getCustomerInfo(int acctID);

    public void deleteCustomer(int acctID);

    

    
}
 