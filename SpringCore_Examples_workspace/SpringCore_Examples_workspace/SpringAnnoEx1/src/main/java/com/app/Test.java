package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		Employee e=(Employee)ac.getBean("eobj");
		System.out.println(e);
	}
	
	
	public static void main1(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee e=(Employee)ac.getBean("employee");
		System.out.println(e);
		
		
		
		
		
		
		
	}
}
