package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.db.DbContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		DbContext dc=(DbContext)ac.getBean("dbc");
		System.out.println(dc);
				
				
				
				
				
				
				
				
	}
}
