package com.app;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Product {

	private int pid;
	private List<String> pmodes;
	private Map<String,Integer> versions;
	private Properties grades;
	public Product() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public List<String> getPmodes() {
		return pmodes;
	}
	public void setPmodes(List<String> pmodes) {
		this.pmodes = pmodes;
	}
	public Map<String, Integer> getVersions() {
		return versions;
	}
	public void setVersions(Map<String, Integer> versions) {
		this.versions = versions;
	}
	public Properties getGrades() {
		return grades;
	}
	public void setGrades(Properties grades) {
		this.grades = grades;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pmodes=" + pmodes + ", versions=" + versions + ", grades=" + grades + "]";
	}
		
}
