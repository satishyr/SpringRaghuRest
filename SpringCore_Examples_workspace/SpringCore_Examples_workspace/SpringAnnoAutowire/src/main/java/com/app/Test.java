package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		ProductService ps=(ProductService)ac.getBean("pobj");
		System.out.println(ps);
		
		
		
		
		
		
	}
}
