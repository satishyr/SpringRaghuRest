package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeDao dao=(EmployeeDao)ac.getBean("edao");
		
		System.out.println(dao.findContext());
		
		
		
		
		
		
		
		
		
		
	}
}
