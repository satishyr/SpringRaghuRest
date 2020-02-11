package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pobj")
public class ProductService {
	@Value("999")
	private int pid;
	@Autowired
	private CodeGenerator cob; //HAS-A 
	
	@Override
	public String toString() {
		return "ProductService [pid=" + pid + ", cob=" + cob + "]";
	}
	
}


