package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("edao")
public class EmployeeDao {
	
	@Autowired
	@Qualifier("ormContext")
	private DbContext db;
	
	public String findContext() {
		System.out.println(db.getClass().getName());
		return db.getContextCode();
	}
	
	
}
