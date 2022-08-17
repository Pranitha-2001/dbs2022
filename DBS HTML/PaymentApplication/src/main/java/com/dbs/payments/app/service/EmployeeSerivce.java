package com.dbs.payments.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.payments.app.model.Employee;
import com.dbs.payments.app.repository.EmployeeRepo;

@Service
public class EmployeeSerivce {
	
	@Autowired
	private  EmployeeRepo emprepo;
	//private Employee employee;
	
	public String addEmployee(Employee emp) {
		
		emprepo.save(emp);
		return "Employee Added";
	}
	
	public List<Employee> getEmployee(){
		return emprepo.findAll();
	}
	
	public Employee findEmployeeById(int id) {
		
			
			return emprepo.findById(id).orElse(null);

		
	}
//	public void updatePwd(String newpassword)
//	{
//		employee.setPassword(newpassword);
//		
//		
//	}
	
}
