package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml"); 
		Employee e=(Employee)ac.getBean("emp");
		System.out.println(e);
		
		
		
		
		
		
	}
}
