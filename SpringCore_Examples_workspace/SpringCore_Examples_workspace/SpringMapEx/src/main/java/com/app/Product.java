package com.app;

import java.util.Map;

public class Product {

	private Map<Integer,String> models;

	public Product() {
		super();
	}

	public Map<Integer, String> getModels() {
		return models;
	}

	public void setModels(Map<Integer, String> models) {
		this.models = models;
	}

	@Override
	public String toString() {
		return "Product [models=" + models + "]";
	}
	
	
}
