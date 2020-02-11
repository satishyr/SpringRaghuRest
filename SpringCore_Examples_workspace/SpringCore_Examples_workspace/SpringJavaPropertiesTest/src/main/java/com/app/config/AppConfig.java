package com.app.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.app")
@PropertySource("app.properties")
public class AppConfig {
	
	
	
}



