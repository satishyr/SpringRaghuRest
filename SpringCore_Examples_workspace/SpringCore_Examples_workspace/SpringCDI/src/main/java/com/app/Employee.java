package com.app;

import java.util.Set;

public class Employee {
	
	private int empId;
	private Set<String> prjs;
	private Address addr; //HAS-A
	public Employee(int empId, Set<String> prjs, Address addr) {
		super();
		this.empId = empId;
		this.prjs = prjs;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", prjs=" + prjs + ", addr=" + addr + "]";
	}
	


}




