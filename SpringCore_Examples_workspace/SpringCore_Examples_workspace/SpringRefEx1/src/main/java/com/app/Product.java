package com.app;

public class Product {

	private int pid;
	private Model mb; //HAS-A
	public Product() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Model getMb() {
		return mb;
	}
	public void setMb(Model mb) {
		this.mb = mb;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", mb=" + mb + "]";
	}
	
	
	
}
