package com.dbs.payment.app.Service;

import java.util.List;

import javax.persistence.AttributeOverride;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.payment.app.Repository.EmployeeRepo;
import com.dbs.payments.app.model.Employee;


@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo employeeRepo;
	
	public List<Employee> getEmployeeData() {
		return employeeRepo.findAll();
	}

	public void employeesave(Employee e) {
		employeeRepo.save(e);
	}
}
