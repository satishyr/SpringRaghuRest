package com.app;

public class B {

	private A oa;

	public B() {
		System.out.println("B constructor");
	}

	public A getOa() {
		return oa;
	}

	public void setOa(A oa) {
		System.out.println("from B set method");
		this.oa = oa;
	}

	
	
	
}
