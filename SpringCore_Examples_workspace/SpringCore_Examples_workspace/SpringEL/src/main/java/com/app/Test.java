package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		ExpressionsTest et=(ExpressionsTest)ac.getBean("et");
		System.out.println(et);
		
		
		
		
		
		
		
	}
}
