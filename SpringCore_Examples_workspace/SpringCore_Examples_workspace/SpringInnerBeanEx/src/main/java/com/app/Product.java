package com.app;

public class Product {

	private int pid;
	private Model mob; //HAS-A	
	public Product() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Model getMob() {
		return mob;
	}
	public void setMob(Model mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", mob=" + mob + "]";
	}
	
	
}
