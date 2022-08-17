package com.demo.BootWithRest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.BootWithRest.Repository.EmpRepo;
import com.demo.BootWithRest.model.Employee;

@Service
public class EmpService implements EmpService1{
	@Autowired
	EmpRepo employeeRepository;
	@Override
	public List<Employee> getEmployeeData() {
		return employeeRepository.findAll();
	}
	@Override
	public String save(Employee e) {
		employeeRepository.save(e);
		return "data saved";
	}
	public Optional<Employee> getUser(Integer id) {
		return employeeRepository.findById(id);
		
	}
	public void update(Integer id,String name)
	{
		Employee e = employeeRepository.findById(id).get();
		e.setName(name);
		employeeRepository.save(e);
	}
	public void delete(Integer id)
	{
		 employeeRepository.deleteById(id);
	}
	

}
