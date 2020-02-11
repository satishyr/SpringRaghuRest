package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.bean.Employee;
import com.app.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class); 
		Employee e=(Employee)ac.getBean("eobj");
		System.out.println(e);
				
				
	}
}
