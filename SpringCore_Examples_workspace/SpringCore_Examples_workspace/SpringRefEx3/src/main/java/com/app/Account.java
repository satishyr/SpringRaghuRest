package com.app;

public class Account {

	private int aid;
	private String acode;
	private User uob; //HAS-A
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAcode() {
		return acode;
	}
	public void setAcode(String acode) {
		this.acode = acode;
	}
	public User getUob() {
		return uob;
	}
	public void setUob(User uob) {
		this.uob = uob;
	}
	@Override
	public String toString() {
		return "Account [aid=" + aid + ", acode=" + acode + ", uob=" + uob + "]";
	}
	public Account() {
		super();
	}
	
}
