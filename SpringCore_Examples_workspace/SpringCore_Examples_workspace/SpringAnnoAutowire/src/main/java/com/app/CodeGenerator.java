package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CodeGenerator {
	
	@Value("88")
	private int cid;
	@Value("ABC")
	private String ctype;
	
	
	@Override
	public String toString() {
		return "CodeGenerator [cid=" + cid + ", ctype=" + ctype + "]";
	}
	
	
	
}
