package com.app.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Project {

	private int pid;
	private List<String> models;
	private Map<String,String> versions;
	private Properties details;
	public Project() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public List<String> getModels() {
		return models;
	}
	public void setModels(List<String> models) {
		this.models = models;
	}
	public Map<String, String> getVersions() {
		return versions;
	}
	public void setVersions(Map<String, String> versions) {
		this.versions = versions;
	}
	public Properties getDetails() {
		return details;
	}
	public void setDetails(Properties details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", models=" + models + ", versions=" + versions + ", details=" + details + "]";
	}
	
	
	
	
	
	
	
}
