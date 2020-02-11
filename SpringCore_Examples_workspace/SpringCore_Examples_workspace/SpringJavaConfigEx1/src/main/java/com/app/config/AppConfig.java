package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.bean.Employee;

@Configuration
public class AppConfig {
    @Bean
	public Employee eobj() {
    	Employee e=new Employee();
    	e.setEmpId(5);
    	e.setEmpName("A");
		return e;
	}
	
}
