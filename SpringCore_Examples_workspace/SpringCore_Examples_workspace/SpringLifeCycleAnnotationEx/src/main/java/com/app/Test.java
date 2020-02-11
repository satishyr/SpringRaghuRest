package com.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		Employee e=(Employee)ac.getBean("emp");
		System.out.println(e);
		ac.close();
		
		
		
		
		
		
		
	}
}
