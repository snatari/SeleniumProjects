package Rahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				 "C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver  driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		// different ways to write cssSelector.
	//	driver.findElement(By.cssSelector("[id='name']")).sendKeys("Rahul");
		driver.findElement(By.cssSelector("[name='enter-name']")).sendKeys("Rahul");
	//	driver.findElement(By.cssSelector("[class='inputs']")).sendKeys("Rahul");
	//	driver.findElement(By.cssSelector("[placeholder='Enter Your Name']")).sendKeys("Rahul");
		
		// type is placing text in first textbox it is not going to second text box below wont work..
		//driver.findElement(By.cssSelector("[type='text']")).sendKeys("Rahul");
		 
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		driver.switchTo().alert();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		driver.switchTo().alert();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		driver.close();
	}

}
