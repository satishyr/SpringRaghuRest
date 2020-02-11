package com.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.app")
public class AppConfig {
	@Bean
	public List<String> list(){
		List<String> al=new ArrayList<>();
		al.add("AB");
		al.add("CD");
		return al;
	}
	
	
}



