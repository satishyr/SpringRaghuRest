package com.app;

public class A {

	private B ob;

	public A() {
		System.out.println("A Constrctor");
	}

	
	
	public B getOb() {
		return ob;
	}



	public void setOb(B ob) {
		System.out.println("from A set method");
		this.ob = ob;
	}



	@Override
	public String toString() {
		return "A [ob=" + ob + "]";
	}
	
	
}
