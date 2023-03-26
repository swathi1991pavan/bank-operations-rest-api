package com.example.todo.repository;

import com.example.todo.model.Logger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;
 
@Repository
public interface LoggerJpaRepository extends JpaRepository<Logger, Integer> {
   

}