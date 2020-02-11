package com.app;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		
		Object ob=ac.getBean("pobj");
		Product p=(Product)ob;
		System.out.println(p);
		//-----Print Map data----
		Map<Integer,String> m=p.getModels();

		//map converted to Entry Set
		Set<Entry<Integer,String>> s=m.entrySet();
		
		//now perform operations
		Iterator<Entry<Integer,String>> itr=s.iterator();
		
		while (itr.hasNext()) {
			Entry<Integer, String> e = itr.next();
			System.out.println(e.getKey()+"="+e.getValue());
			
		}
	}
}
