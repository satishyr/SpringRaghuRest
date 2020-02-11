package com.app;

import org.springframework.stereotype.Component;

@Component
public class OrmContext implements DbContext {

	@Override
	public String getContextCode() {
		return "ORM-OBJECT";
	}

}
