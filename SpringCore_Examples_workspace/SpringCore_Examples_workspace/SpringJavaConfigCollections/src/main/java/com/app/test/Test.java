package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.bean.Project;
import com.app.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Project p=(Project)ac.getBean("pobj");
		System.out.println(p);
		
		
		
		
		
		
		
		
				
				
				
				
				
				
				
				
	}
}
