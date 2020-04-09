package YoutubExer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class YoutubeExercise {
	
  @Test
  public void launch() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.a.testaddressbook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("sign-in")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("user_email")).sendKeys("watermelon00@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("water123");
		//driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		driver.findElement(By.name("commit")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Addresses']")).click();
		driver.findElement(By.xpath("//a[text()='New Address']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("address_first_name")).sendKeys("hi");
		driver.findElement(By.id("address_last_name")).sendKeys("www");
		driver.findElement(By.id("address_street_address")).sendKeys("moroon");
		driver.findElement(By.id("address_city")).sendKeys("goa");
		//driver.findElement(By.id("address_state")).click();
		//driver.findElement(By.xpath("//option[text()='California']")).click();
	
			WebElement ele=driver.findElement(By.id("address_state"));
			Select state=	new Select(ele);
			state.selectByValue("CA");
		driver.findElement(By.id("address_country_us")).click();
		//driver.findElement(By.id("address_birthday")).click();
		driver.findElement(By.id("address_color")).click();
		//driver.findElement(By.id("address_color")).click();
		String selectColor ="#dc3545";//red color
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('address_color').value=\'"+selectColor+"\'");
		driver.findElement(By.name("commit")).click();
		driver.findElement(By.name("address[website]")).sendKeys("www.dddbook.com");
		
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
  }
  
 
}