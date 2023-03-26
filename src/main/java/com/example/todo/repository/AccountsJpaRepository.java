package com.example.todo.repository;

import com.example.todo.model.Accounts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;
 
@Repository
public interface AccountsJpaRepository extends JpaRepository<Accounts, Integer> {
   

}
