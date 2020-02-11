package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("aobj")
	private Address addr;

	@Override
	public String toString() {
		return "Employee [addr=" + addr + "]";
	}

	
}
