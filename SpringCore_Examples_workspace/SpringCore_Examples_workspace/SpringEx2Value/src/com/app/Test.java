package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext  ac= new 
				ClassPathXmlApplicationContext
				("com/app/config.xml");
		Object ob= ac.getBean("pob");
		Product p=(Product)ob;
		System.out.println(p);
	}
}
