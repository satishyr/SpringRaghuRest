package com.app;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee 
 implements InitializingBean,DisposableBean{

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
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("from init");
		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("from destroy");
	}
	
	
	
	
	
}
