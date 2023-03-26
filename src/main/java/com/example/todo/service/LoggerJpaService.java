package com.example.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo.repository.LoggerRepository;
import com.example.todo.model.Logger;
import com.example.todo.repository.LoggerJpaRepository;


@Service
public class LoggerJpaService implements LoggerRepository{
	@Autowired
	private LoggerJpaRepository loggerRepository;

	public void addLog(Logger logger) {
		loggerRepository.save(logger);
	}

	public Logger showLog(int acctID) {
		Logger logger= loggerRepository.findById(acctID).get();
		return logger;
	}

	public void deleteLog(int acctID) {
		loggerRepository.deleteById(acctID);
	}
}
