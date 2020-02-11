package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		
		DbContext dc=(DbContext)ac.getBean("dcdobj");
		System.out.println(dc);
		
		
		
	}
}
