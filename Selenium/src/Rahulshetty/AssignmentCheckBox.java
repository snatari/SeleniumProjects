package Rahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssignmentCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				 "C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	//1.	Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked

//		
//		System.out.println(driver.findElement(By.name("checkBoxOption1")).isSelected());
//		driver.findElement(By.name("checkBoxOption1")).click();
//		Thread.sleep(3000);
//		System.out.println(driver.findElement(By.name("checkBoxOption1")).isSelected());
//		//System.out.println(driver.findElement(By.name("checkBoxOption1")).isEnabled());
//		//to uncheck  the checkBox again.
//		driver.findElement(By.name("checkBoxOption1")).click();
//		Thread.sleep(3000);
//		System.out.println(driver.findElement(By.name("checkBoxOption1")).isSelected());
//		
//	//2.	How to get the Count of number of check boxes present in the page
//		
//		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
//		
		//u can do 1 &2 like above or using Assertions
		WebElement option =driver.findElement(By.name("checkBoxOption1"));
		Assert.assertFalse(option.isSelected());
		option.click();
		Assert.assertTrue(option.isSelected());
		Thread.sleep(2000);
		option.click();
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 3);
      System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.close();
	}

}
