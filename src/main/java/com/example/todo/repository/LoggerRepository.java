package com.example.todo.repository;

import com.example.todo.model.Logger;

public interface LoggerRepository{
    
    public void addLog(Logger logger);

    public Logger showLog(int acctID); 
    
    public void deleteLog(int acctID); 
    
}
 