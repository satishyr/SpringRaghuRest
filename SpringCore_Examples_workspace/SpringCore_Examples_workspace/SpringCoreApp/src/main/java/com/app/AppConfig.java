package com.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.app")
public class AppConfig {

	//SAC - one collection=one object=one method
	@Bean
	public List<String> list(){
		List<String> al=new ArrayList<>();
		al.add("P1");
		al.add("P2");
		return al;
	}
	@Bean
	public Set<String> sobj(){
		Set<String> s=new HashSet<>();
		s.add("S1");
		s.add("S2");
		return s;
	}
	@Bean
	public Map<String,String> mobj(){
		Map<String,String> m=new HashMap<>();
		m.put("101", "M1");
		m.put("101", "M2");
		return m;
	}
	@Bean
	public Properties pobj() {
		Properties p=new Properties();
		p.put("11", "P1");
		p.put("12", "P2");
		return p;
	}
	
}





