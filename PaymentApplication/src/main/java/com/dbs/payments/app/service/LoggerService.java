package com.dbs.payments.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dbs.payments.app.model.Logger;
import com.dbs.payments.app.repository.LoggerRepo;

@Service
public class LoggerService {
	@Autowired
	private LoggerRepo loggerrepo;
	
	public void addLogger(Logger logger)
	{
		loggerrepo.save(logger);
	}
	public List<Logger> getLogs()
	{
		return  loggerrepo.findAll();
}
}