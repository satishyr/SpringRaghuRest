package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		
		Product p=(Product)ac.getBean("pobj");
		System.out.println(p);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
