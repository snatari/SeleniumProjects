package Rahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
	//public static WebElement ele = null;
//	public static Select s;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight ui-state-active')]"))
				.click();
	WebElement	ele = driver.findElement(By.cssSelector("#Adults"));
		Select s = new Select(ele);
		s.selectByIndex(4);
		Thread.sleep(2000);
		s.selectByValue("7");
		Thread.sleep(2000);
		s.selectByVisibleText("9");
		// Thread.sleep(2000);
	WebElement	 ele1 = driver.findElement(By.id("Childrens"));
//		// ele =driver.findElement(By.name("childs"));
		 	Select s1 = new Select(ele1);
//		//s1.selectByValue("2");
//		//s1.selectByIndex(3);
		s1.selectByVisibleText("2");
	Thread.sleep(2000);
	WebElement	ele2 =driver.findElement(By.cssSelector(".span.span16"));
//		WebElement	ele2=	driver.findElement(By.id("Infants"));
			Select s2 = new Select(ele2);
//		//s2.selectByValue("3");
//	//	s2.selectByVisibleText("3");
		s2.selectByIndex(3);
//
		Thread.sleep(2000);
//		driver.close();
//			
		// driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
		WebElement class1 = driver.findElement(By.name("class"));
		Select sel = new Select(class1);
		sel.selectByValue("Premium Economy");
		driver.findElement(By.name("airline")).sendKeys("Atlantic Faroe Is (RC)");
//	 ele = driver.findElement(By.name("airline"));
//	ele.sendKeys("Atl");
//	 ele.sendKeys(Keys.ARROW_DOWN);
//	
//	 ele.sendKeys(Keys.ENTER);
//	
		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
		String text = driver.findElement(By.xpath("//div[@id='homeErrorMessage']")).getText();
		System.out.println(text);
		driver.close();

		

	}

}
