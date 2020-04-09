package Rahulshetty;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class SortingColByArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				 "C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	driver.manage().window().maximize();
	//List<WebElement> firstcolList =driver.findElements(By.cssSelector("tr td:nth-child(2)"));
	List<WebElement> firstcolList =driver.findElements(By.xpath("//tr/td[2]"));
	ArrayList<String> originalList = new ArrayList<String>();
	for(int i=0;i<firstcolList.size();i++) {
		System.out.println(firstcolList.get(i).getText());
		originalList.add(firstcolList.get(i).getText());
	}System.out.println("++++++++++originalArraylist+++++++");
	for(int i=0;i<originalList.size();i++) {
		System.out.println(originalList.get(i));
	}
	ArrayList<String> copiedList = new ArrayList<String>();
	for(int i=0;i<originalList.size();i++) {
		copiedList.add(originalList.get(i));
		
	}
	Collections.sort(copiedList);
	System.out.println("++++++++++copiedList++++++++");
	for(String s:copiedList) {
		System.out.println(s);
	}
	Assert.assertTrue(originalList.equals(copiedList));
	driver.close();
	}
	
}
