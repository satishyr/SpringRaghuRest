package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eobj")
public class Employee {

	@Value("55")
	private int empId;
	@Value("ABC")
	private String empName;
	@Value("3.2")
	private double empSal;
	
	@Autowired
	private Address addr; //<ref/>

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", addr=" + addr + "]";
	}
	
	
	
	
}