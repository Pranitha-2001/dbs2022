package com.demo.BootWithRest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.BootWithRest.model.Employee;
import com.demo.BootWithRest.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	private EmpService empService;
	@GetMapping("/message")
	public String getMessage() {
		String str=null;
		System.out.println(str.length());
		return "Welcome to spring with Rest";
		
	}
	@GetMapping("/getvalue/{message}")
	public String getMessage(@PathVariable("message") String value) {
		
		System.out.println("value from client  "+value);
		return "Welcome to spring with Rest = "+value;
		
	}
	@PostMapping("/create")
	public String createData(@RequestBody Employee emp) {
		System.out.println(emp);
		empService.save(emp);
		return "Data inserted Successfully";
	}
	@GetMapping("/fetchAll")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		return ResponseEntity.ok(empService.getEmployeeData());
		
	}
	@GetMapping("/fetch/{id}")
	public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable Integer id) {
		return ResponseEntity.ok(empService.getUser(id));
		
	}
	@PutMapping("update/{id}/{name}")
	public void updateById(@PathVariable Integer id,@PathVariable String name) {
		 empService.update(id,name);
	}
    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable Integer id) {
    	empService.delete(id);
    }
}
