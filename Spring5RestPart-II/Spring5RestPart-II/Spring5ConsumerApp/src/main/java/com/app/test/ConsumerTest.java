package com.app.test;

import java.net.URI;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ConsumerTest {

	public static void main(String[] args) {
		
		//String body="{\"empId\":25,\"empName\":\"AJ\",\"empSal\":55.55}";
		String body="<Employee> <empId>25</empId> <empName>VIJAY</empName><empSal>100</empSal> </Employee>";
		String url="http://localhost:2018/Spring5RestProviderApp/employee/data";
		
		//1. headers
		HttpHeaders headers=new HttpHeaders();
		//headers.add("Content-Type", "application/json");
		headers.add("Content-Type", "application/xml");
		headers.add("Accept", "application/json");
		
		
		//2. entity
		HttpEntity<String> entity=new HttpEntity<String>(body, headers);
		
		//3. make request call
		RestTemplate template=new RestTemplate();
		
		//4. get response back also
		ResponseEntity<String> re=template.postForEntity(url, entity, String.class);
		System.out.println(re.getStatusCodeValue());
		System.out.println(re.getStatusCode().name());
		System.out.println(re.getBody());
		
		
	}
}
