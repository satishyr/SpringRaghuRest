package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.bean.Address;
import com.app.bean.Employee;

@Configuration
public class AppConfig {
	@Bean
	public Address aobj() {
		Address a=new Address();
		a.setAddrId(5);
		a.setLoc("HYD");
		return a;
	}
	@Bean
	public Employee eobj() {
		Employee e=new Employee();
		e.setEmpId(6);
		e.setEmpName("A");
		e.setAddr(aobj());
		return e;
	}
	
	
	
	
	
	
}
