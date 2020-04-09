package Rahulshetty;

import java.util.Set;


import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountingLinksWebPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", 
				 "C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver  driver = new FirefoxDriver();
		driver.get("http://qaclickacademy.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Practice')]")).click();
		//1.To get all the links(Total) in the webpage.
		System.out.println(driver.findElements(By.tagName("a")).size());
		//2.to find all the links in the particular section like Header,Body , Footer.
		//we are limiting the webdriver scope..
		
		WebElement footer =driver.findElement(By.id("gf-BIG"));
		// a gain finding the total no of links in footer.
		System.out.println(footer.findElements(By.tagName("a")).size());
		//in the footer finding the one column total no of links.
		WebElement columnlinks =	driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(columnlinks.findElements(By.tagName("a")).size());
		//click on each link in the column and each pages are opening.
		for(int i=1;i<columnlinks.findElements(By.tagName("a")).size();i++) {
		//this will click each link & open in new tab.	
		 String clicklinktab =Keys.chord(Keys.CONTROL,Keys.ENTER);
		 columnlinks.findElements(By.tagName("a")).get(i).sendKeys(clicklinktab);
		 Thread.sleep(3000);
		 
		 
		}
		Set<String> windows = driver.getWindowHandles();
	//	java.util.Iterator<String> it =windows.iterator();
		Iterator<String> it =windows.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());//getting title of each link.
		}
		
		
		
		driver.quit();
		

		
		
		
		
		
		
		
		

	}

}
