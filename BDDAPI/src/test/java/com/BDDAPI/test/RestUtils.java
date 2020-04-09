package com.BDDAPI.test;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {


	//public static String setFirstName() {
	public static String getFirstName() {
		String generatedstring = RandomStringUtils.randomAlphabetic(1);
		return ("Laddu"+generatedstring);
		
	}
	public static String getLastName() {
		String generatedstring = RandomStringUtils.randomAlphabetic(1);
		return ("Alluru"+generatedstring);
		
	}
	public static String getUserName() {
		String generatedstring = RandomStringUtils.randomAlphabetic(3);
		return ("Laddu"+generatedstring);
		
	}
	public static String getPassword() {
		String generatedstring = RandomStringUtils.randomAlphabetic(3);
		return ("Laddu"+generatedstring);
		
	}public static String getEmail() {
		String generatedstring = RandomStringUtils.randomAlphabetic(1);
		return (generatedstring+"gmail.com");
		
	}
	public static String empName() {
		String generatedstring = RandomStringUtils.randomAlphabetic(1);
		return ("Laddu"+generatedstring);
		
	}
	public static String empSalaray() {
		String generatedstring = RandomStringUtils.randomNumeric(5);
		return (generatedstring);
		
	}
	public static String empage() {
		String generatedstring = RandomStringUtils.randomNumeric(2);
		return (generatedstring);
		
	}
}
