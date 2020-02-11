package com.app;

public class Model {

	private int mid;
	private String mcode;
	
	public Model() {
		super();
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMcode() {
		return mcode;
	}
	public void setMcode(String mcode) {
		this.mcode = mcode;
	}
	@Override
	public String toString() {
		return "Model [mid=" + mid + ", mcode=" + mcode + "]";
	}
	
	
}
