package com.app;

public class Address {

	private int addrId;

	public Address() {
		super();
	}

	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	@Override
	public String toString() {
		return "Address [addrId=" + addrId + "]";
	}
	
	
}
