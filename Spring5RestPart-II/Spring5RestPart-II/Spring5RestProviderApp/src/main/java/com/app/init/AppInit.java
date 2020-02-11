package com.app.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.app.config.AppConfig;

//web.xml code
public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer{

	//Java AppConfiguration
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {AppConfig.class};
	}
	//XML Configuration > Java format
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	//URL Patterns
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
		// /rest/*, /a/a/*, /* all are valid
	}

	
	
	
}
