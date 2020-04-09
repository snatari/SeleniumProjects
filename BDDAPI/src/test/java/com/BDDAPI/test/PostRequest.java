package com.BDDAPI.test;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class PostRequest {

	public static	HashMap map = new HashMap();
	@BeforeClass
	public void postData() {
	
		map.put("FirstName", RestUtils.getFirstName());
		map.put("LastName", RestUtils.getLastName());
		map.put("UserName", RestUtils.getUserName());
		map.put("Password", RestUtils.getPassword());
		map.put("Eamil", RestUtils.getEmail());
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RestAssured.basePath="/register";
		
	}
	
	@Test
	public void testPost() {
		given()
			.contentType("/application/json")
			.body(map)
		.when()
			.post()
		.then()
		
			.statusCode(201)
			.and()
			.statusLine("HTTP/1.1 201 OK")
			.and()
			.body("SuccessCode",equalTo("OPERATION_SUCCESS"))
			.and()
			.body("Message",equalTo("Operation Completed Succesfully"));
}
}