package com.app.model;

public class Employee {

	private int empId;
	private String empName;
	private double empSal;
	//alt+shift+S,O(DeselectAll>OK)
	public Employee() {
		super();
	}
	//alt+shift+S,R(SelectAll>OK)
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	//alt+shift+S,S(OK)
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
}
