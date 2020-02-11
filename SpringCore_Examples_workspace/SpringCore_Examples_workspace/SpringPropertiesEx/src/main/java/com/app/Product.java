package com.app;

import java.util.Properties;

public class Product {

	private int pid;
	private Properties info;
	public Product() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Properties getInfo() {
		return info;
	}
	public void setInfo(Properties info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", info=" + info + "]";
	}
	
	
	
}
