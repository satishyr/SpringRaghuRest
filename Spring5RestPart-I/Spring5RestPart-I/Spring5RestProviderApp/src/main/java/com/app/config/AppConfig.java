package com.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//Spring Config File (Java)
@Configuration
//Activate Spring WEB/ReST (4.x)
@EnableWebMvc
//Activate StereoType Anno.
@ComponentScan(basePackages="com.app")
public class AppConfig {

	
	
}
