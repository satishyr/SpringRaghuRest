package com.app;

public class Profile {

	private int pid;
	private String pcode;
	
	public Profile() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	@Override
	public String toString() {
		return "Profile [pid=" + pid + ", pcode=" + pcode + "]";
	}
	
	
}
