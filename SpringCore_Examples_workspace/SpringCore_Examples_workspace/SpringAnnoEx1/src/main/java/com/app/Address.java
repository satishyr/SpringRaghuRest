package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("addrObj")
public class Address {
	@Value("88")
	private int aid;
	@Value("HYD")
	private String loc;
	
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", loc=" + loc + "]";
	}
	
	
	
}



