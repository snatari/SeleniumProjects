package com.BDDAPI.test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BasicValidations_XML {
	// 1.Verifying single content in XML Response
	@Test(priority = 1)
	public void testSingleContent() {
		given().when().get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")// it give XML format as OutPut.
				.then().body("CUSTOMER.ID", equalTo("15")).log().all();

	}

	// 2.Verifying Multiple content in XML Response
	@Test(priority = 2)
	public void testMultipleContent() {
		given().when().get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")// it give XML format as OutPut.
				.then().body("CUSTOMER.ID", equalTo("15")).body("CUSTOMER.FIRSTNAME", equalTo("Bill"))
				.body("CUSTOMER.LASTNAME", equalTo("Clancy")).body("CUSTOMER.STREET", equalTo("319 Upland Pl."))
				.body("CUSTOMER.CITY", equalTo("Seattle"));
	}

	// OR
	// 3.Verifying all the content in XML Response in ONEGO
	// text() is method & is a XPath Function
	@Test(priority = 3)
	public void testMultipleContentinONEGO() {
		given().when().get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")// it give XML format as OutPut.
				.then().body("CUSTOMER.text()", equalTo("15BillClancy319 Upland Pl.Seattle"));

	}

	// 4.Find the Values using XML path in XML response
	@Test(priority = 4)
	public void testUsingXPath() {
		given().when().get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")// it give XML format as OutPut.
				.then().body(hasXPath("/CUSTOMER/FIRSTNAME", containsString("Bill")));

	}
	//Another way of @Test(priority = 4)
	@Test(priority = 5)
	public void testUsingXPath1() {
		given().when().get("http://thomas-bayer.com/sqlrest/INVOICE/")
				.then().body(hasXPath("/INVOICEList/INVOICE[text()='30']"))
				.log().all();
	}
}
