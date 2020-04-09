package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe ");
		WebDriver driver = new FirefoxDriver();
	//	driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.get("https://selenium.dev/selenium/docs/api/java/");
		Thread.sleep(5000);
		driver.switchTo().frame("packageListFrame");
		Thread.sleep(5000);
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//span[text()='CommandProcessor']")).click();
		driver.switchTo().frame("classFrame");
		//driver.findElement(By.xpath(")).click();
		driver.switchTo().defaultContent();
		
	}

}
