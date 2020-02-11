package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("pobj")
public class ProductService {
	@Autowired
	private ICodeGen gen;
	
	public String getDetails() {
		System.out.println(gen.getClass().getName());
		return gen.getCode();
	}
	
}


