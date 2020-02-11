package com.app.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ConsumerTest {

	public static void main(String[] args) {
		//1.create object to RestTemplate
		RestTemplate rt =new RestTemplate();
		//2.Provider URL
		String url="http://localhost:2018/Spring5RestProviderApp/employee/show";
		//3.make call (http request)
		//4.get Response in ResponseEntity
		ResponseEntity<String> entity=rt.getForEntity(url, String.class);
		
		//5.Print or use result
		System.out.println(entity.getBody());
		System.out.println(entity.getStatusCode().name());
		System.out.println(entity.getStatusCodeValue());

		
		
		
		
		
		
		
	}
}
