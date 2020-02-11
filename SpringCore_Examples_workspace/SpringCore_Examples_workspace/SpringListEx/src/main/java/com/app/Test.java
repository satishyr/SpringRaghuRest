package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new  ClassPathXmlApplicationContext("config.xml");
		
		Object ob=ac.getBean("emp");
		Employee e=(Employee)ob;
		
		System.out.println(e);
		
		System.out.println(
		e.getEmpModels().getClass().getName()
		);
		
		
		
		
		
		
	}
}
