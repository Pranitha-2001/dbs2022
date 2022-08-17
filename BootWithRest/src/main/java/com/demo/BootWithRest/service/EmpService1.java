package com.demo.BootWithRest.service;

import java.util.List;
import java.util.Optional;

import com.demo.BootWithRest.model.Employee;

public interface EmpService1 {
	public List<Employee> getEmployeeData();
	public String save(Employee e);
//	public Optional<Employee> getEmployeeById(Integer id);

}
