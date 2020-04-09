package Rahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//redo this again it is not working!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		System.setProperty("webdriver.gecko.driver", 
				 "C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver  driver = new FirefoxDriver();
		driver.get("http://qaclickacademy.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Practice')]")).click();
		  driver.findElement(By.id("checkBoxOption2")).click();
		  String text=driver.findElement(By.id("checkBoxOption2")).getText();
		System.out.println(driver.getTitle());
		
//		WebElement dropdown =driver.findElement(By.id("dropdown-class-example"));
//		Select sel = new Select(dropdown);
//		sel.selectByVisibleText(text);
		driver.findElement(By.name("enter-name")).sendKeys(text);
		Thread.sleep(3000);
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert();
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		driver.close();

	}

}
