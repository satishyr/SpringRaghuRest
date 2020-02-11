package com.app.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.bean.Project;

@Configuration
public class AppConfig {
	@Bean
	public List<String> listOb(){
		List<String> al=new ArrayList<>();
		al.add("M1");
		al.add("M2");
		return al;
	}
	@Bean
	public Map<String,String> mobj(){
		Map<String,String> m=new HashMap<>();
		m.put("V1", "1.3");
		m.put("V2", "R2");
		return m;
	}
	@Bean
	public Properties prpsob() {
		Properties p=new Properties();
        p.put("CLT", "SAT");
        p.put("ADD", "AMPT");
		return p;
	}
	@Bean
    public Project pobj() {
		Project p=new Project();
		p.setPid(6);
		p.setModels(listOb());
		p.setVersions(mobj());
		p.setDetails(prpsob());
    	return p;
    }







}
