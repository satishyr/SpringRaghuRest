package com.app;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		
		
		List<String> lst=(List<String>) ac.getBean("lstobj");
		System.out.println(lst);
		
		
		Set<String> s=(Set<String>) ac.getBean("sobj");
		System.out.println(s);
		System.out.println(s.getClass().getName());
		
		Map<String,String> m=(Map<String,String>) ac.getBean("mobj");
		System.out.println(m);
		System.out.println(m.getClass().getName());
		
		System.out.println(ac.getBean("pobj"));
		
	}
}
