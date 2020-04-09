package testselenium;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayShoppingCart {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		//to maximize the window.
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@label='Search for anything']")).sendKeys("watches");
		driver.findElement(By.id("gh-ac")).sendKeys("watches");
		Thread.sleep(3000);
		driver.findElement(By.id("gh-btn")).click();
	//	driver.findElement(By.linkText("Men's Fashion Luxury Watch Stainless Steel Band Sport Analog Quartz Wristwatches").click();
		//driver.findElement(By.cssSelector("h3.class='Men's Fashion Luxury Watch Stainless Steel Band Sport Analog Quartz Wristwatches'").click();
		//sendkeys("watches");
		driver.findElement(By.cssSelector("#srp-river-results-listing1 > div > div.s-item__info.clearfix > a > h3")).click();
		driver.findElement(By.id("msku-sel-1")).click();
		//WebElement ele=driver.findElement(By.xpath("//select[@id=' ']"));
		//WebElement ele=driver.findElement(By.cssSelector("#"));
		WebElement ele=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/form[1]/div[1]/div[5]/div[2]/select[1]"));
		Select s = new Select(ele);
		//s.selectByIndex(1);
		s.selectByValue("2");
		s.selectByVisibleText("Silver+Orange+Black");
		driver.findElement(By.xpath("//div[contains(text(),'Buy 1')]")).click();
		
		driver.findElement(By.id("isCartBtn_btn")).click();
		
		//driver.switchTo().alert();
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		//driver.findElement(By.linkText("No thanks")).click();
		//driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();  
		
	}

}
