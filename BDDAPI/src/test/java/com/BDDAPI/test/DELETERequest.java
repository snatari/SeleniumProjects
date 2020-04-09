package com.BDDAPI.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DELETERequest {
	@Test
	public void deleteEmpRecord() {
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/delete"+11493;
		Response response = given()
		.when()
			.delete()
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.log().all().extract().response();
		String JSONString = response.asString();
		Assert.assertEquals(JSONString.contains("Successfully! deleted records"),true);
	}

}
