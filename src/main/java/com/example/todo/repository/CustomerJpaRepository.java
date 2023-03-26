package com.example.todo.repository;

import com.example.todo.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;
 
@Repository
public interface CustomerJpaRepository extends JpaRepository<Customer, Integer> {
   

}
