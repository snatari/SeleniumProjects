package com.BDDAPI.test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Put_Request {
	public static	HashMap map = new HashMap();
	int emp_ID =1124;
	@BeforeClass
	public void putData() {
	
		map.put("name", RestUtils.empName());
		map.put("salary", RestUtils.empSalaray());
		map.put("age", RestUtils.empage());
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/update"+emp_ID;
	}
	
	@Test
	public void testPut() {
		given()
			.contentType("/application/json")
			.body(map)
		.when()
			.put()
		.then()
		
			.statusCode(200)
			.log().all();
			
}

}
