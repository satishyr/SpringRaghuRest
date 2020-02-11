package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;


@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	
	@PostMapping("/data")
	public ResponseEntity<Employee> processData(@RequestBody Employee emp){
		emp.setEmpSal(emp.getEmpSal()*4);
		ResponseEntity<Employee> entity=new ResponseEntity<Employee>(emp, HttpStatus.OK);
		return entity;
	}
	
	
	
	
	
	
}
