package com.dbs.payments.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.payments.app.model.Employee;
import com.dbs.payments.app.service.EmployeeSerivce;
@CrossOrigin
@RestController
@RequestMapping("/paymentapp")
public class EmployeeController {
	
	@Autowired
	private EmployeeSerivce empservice;
	
	@PostMapping("/addemployee")
	public String addEmployee(@RequestBody Employee employee) {
		empservice.addEmployee(employee);
		return "Employye Added";
	}
	
	@GetMapping("/getemployees")
	public ResponseEntity<List<Employee>> getEmployee(){
		return ResponseEntity.ok(empservice.getEmployee());
	}
	@GetMapping("/getemployeebyid/{id}")
	public ResponseEntity<Employee> getEmpById(@PathVariable int id){
		return ResponseEntity.ok(empservice.findEmployeeById(id));
	}
//	@GetMapping("/updatepassword/{newpassword}")
//	public String updatepassword(@PathVariable String newpassword) {
//		empservice.updatePwd(newpassword);
//		return "password updated";
//	}
}
