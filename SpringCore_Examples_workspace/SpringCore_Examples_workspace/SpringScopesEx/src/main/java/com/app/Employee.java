package com.app;

public class Employee {
	
	private Address addr;//HAS-A
	
	public Employee() {
		super();
	}
	
	public Address getAddr() {
		addr=findChild();
		return addr;
	}

	public Address findChild() {
		return null;
	}

	@Override
	public String toString() {
		return "Employee [addr=" + addr + "]";
	}
	
	
	
}
