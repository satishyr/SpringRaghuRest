package com.app;

public class Employee {

	private int empId;

	public Employee() {
		System.out.println("Constrcutor ");
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		System.out.println("setter method");
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + "]";
	}
	
	public void setup() {
		System.out.println("init method");
	}
	
	public void close() {
		System.out.println("destroy method");
	}
	
	
	
	
	
	
}
