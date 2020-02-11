package com.app;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int empId;
	private List<String> empCodes;
	private Set<String>  empPrjs;
	private Map<Integer,String> empModels;
	
	
	public Employee() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public List<String> getEmpCodes() {
		return empCodes;
	}
	public void setEmpCodes(List<String> empCodes) {
		this.empCodes = empCodes;
	}
	public Set<String> getEmpPrjs() {
		return empPrjs;
	}
	public void setEmpPrjs(Set<String> empPrjs) {
		this.empPrjs = empPrjs;
	}
	public Map<Integer, String> getEmpModels() {
		return empModels;
	}
	public void setEmpModels(Map<Integer, String> empModels) {
		this.empModels = empModels;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empCodes=" + empCodes + ", empPrjs=" + empPrjs + ", empModels="
				+ empModels + "]";
	}
	
	
	
}
