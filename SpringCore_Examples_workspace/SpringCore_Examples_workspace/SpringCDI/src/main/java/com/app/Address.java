package com.app;

import java.util.Map;

public class Address {

	private int addrId;
	private String loc;
	private Map<String,String> cords;
	
	public Address(int addrId, String loc, Map<String, String> cords) {
		super();
		this.addrId = addrId;
		this.loc = loc;
		this.cords = cords;
	}

	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", loc=" + loc + ", cords=" + cords + "]";
	}
	
	
	
	
}
