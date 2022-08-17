package com.dbs.payment.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.payment.app.Service.EmployeeService;
import com.dbs.payments.app.model.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeService employeeservice;

	@GetMapping("/addemployee")
	public String createData(@RequestBody Employee emp) {
		System.out.println("inserting");
		employeeservice.employeesave(emp);
		return "Data inserted Successfully";
	}

	@PostMapping("/getemployee")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		return ResponseEntity.ok(employeeservice.getEmployeeData());
	}

}
