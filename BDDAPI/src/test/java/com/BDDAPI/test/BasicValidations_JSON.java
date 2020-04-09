package com.BDDAPI.test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BasicValidations_JSON {
	//1.Test StatusCode
	@Test(priority=1)
	public void testCaseCode() {
		//given()
		when()
			.get("http://jsonplaceholder.typicode.com/posts/5")
		.then()
			.statusCode(200)
			.log().all();//Give Response in console(Details)
		
	}
	//2.Log Response
	
	@Test(priority=2)
	public void testLoggin() {
		given()
		.when()
			.get("http://services.groupkt.com/country/get/iso2code/IN")
		.then()
			.statusCode(200)
			.log().all();
		
	}
	//3.Verify single content in the responseBody.
	@Test(priority=3)
	public void testSingleLoggin() {
		given()
		.when()
			.get("http://services.groupkt.com/country/get/iso2code/IN")
		.then()
			.statusCode(200)
			.body("RestResponse.result.name",equalTo("India"))
			.log().all();
		
	}
	//4.Verify multiple content in the responseBody.
	//hasItems() is a method.can take multiple contents.
		@Test(priority=4)
		public void testmultipleLoggin() {
			given()
			.when()
				.get("http://services.groupkt.com/country/get/all")
			.then()
				.statusCode(200)
				.body("RestResponse.result.name",hasItems("India","Australia","United States of America,"))
				.log().all();
			
		}
		//5.Setting parameters and Headers
		@Test(priority=5)
		public void testParamsAndHeaders() {
			given()
				.param("MyName", "Laddu")
				.header("MyHeader","Indian")
			.when()
				.get("http://services.groupkt.com/country/get/iso2code/IN")
			.then()
				.statusCode(200)
				.log().all();
			
		}
}
