package com.app;

public class Admin {

	private int aid;
	private String aname;
	private Profile pob; //HAS-A
	public Admin() {
		super();
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Profile getPob() {
		return pob;
	}
	public void setPob(Profile pob) {
		this.pob = pob;
	}
	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", aname=" + aname + ", pob=" + pob + "]";
	}
	
}
