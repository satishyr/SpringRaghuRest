package com.app;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("prodbj")
public class Product {

	@Value("#{list}")
	private List<String> myList;
	@Value("#{sobj}")
	private Set<String> mySet;
	@Value("#{mobj}")
	private Map<String,String> myMap;
	@Value("#{pobj}")
	private Properties myPrps;
	@Override
	public String toString() {
		return "Product [myList=" + myList + ", mySet=" + mySet + ", myMap=" + myMap + ", myPrps=" + myPrps + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}






