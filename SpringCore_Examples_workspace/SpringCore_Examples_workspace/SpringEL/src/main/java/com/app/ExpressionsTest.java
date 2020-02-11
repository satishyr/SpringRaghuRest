package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("et")
public class ExpressionsTest {
	@Value("#{list}")
	private List<String> data;
	@Value("#{list.get(0)}")
	private String code;
	
	@Override
	public String toString() {
		return "ExpressionsTest [data=" + data + ", code=" + code + "]";
	}
	
	
	

	
}





