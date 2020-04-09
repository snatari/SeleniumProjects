package Rahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInterActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//mouse interactions : mousehover, doubleclick, rightclick;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\chromedriver_win32.\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("diamondnecklace").doubleClick().build().perform();
	
		
		WebElement ele = driver.findElement(By.id("nav-link-accountList"));
		Thread.sleep(3000);
		act.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		act.moveToElement(ele).contextClick().build().perform();
		Thread.sleep(3000);
		driver.close();
		

	}

}
