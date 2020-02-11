package com.app;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {

	private int empId;

	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + "]";
	}
	
	@PostConstruct
	public void setup() {
		System.out.println("from init");
	}
	@PreDestroy
	public void close() {
		System.out.println("from destroy");
	}
	
	
	
	
	
	
	
	
	
}
