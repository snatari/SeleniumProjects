package Rahulshetty;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\chromedriver_win32.\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.google.com/nonprofits/account/signup?locality=us");
		driver.get("https://accounts.google.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Terms")).click();
		
	Set<String> ids =	driver.getWindowHandles();
	Iterator<String> it =ids.iterator();
	String parentwindow = it.next();
	String childwindow =it.next();
	
		
		driver.switchTo().window(childwindow);
		
		System.out.println("after switching to child " +driver.getTitle());
		driver.switchTo().window(parentwindow);
		
		System.out.println("after switching to parent " +driver.getTitle());
           driver.quit();
	}

	
}
