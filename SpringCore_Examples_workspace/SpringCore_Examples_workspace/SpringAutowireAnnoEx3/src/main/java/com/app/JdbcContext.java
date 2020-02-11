package com.app;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JdbcContext implements DbContext {

	@Override
	public String getContextCode() {
		return "JDBC - OBJECT";
	}

}
