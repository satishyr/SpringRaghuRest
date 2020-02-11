package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println(
				new AnnotationConfigApplicationContext(AppConfig.class)
		.getBean("prodbj"));
	}
}
