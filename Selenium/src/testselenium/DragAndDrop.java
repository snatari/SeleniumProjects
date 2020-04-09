package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Droppable' )]")).click();
		
		driver.findElement(By.xpath("//iframe[@class='demo-frame']")).click();
		driver.findElement(By.tagName("iframe")).click();
		driver.switchTo().frame(0);
		// below 2 comments are not working!!!!!....
		//driver.switchTo().frame("demo-frame");//string arg();
		//driver.switchTo().frame(arg0);//webelement arg();
		
		Thread.sleep(1000);
		// we use Actions class to perform any actions like doubleclick,contextclick(rightclick),draganddrop .
		Actions act = new Actions(driver);
	WebElement src=	driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		act.dragAndDrop(src, target).perform();
		Thread.sleep(3000);
		//checking the condition is it dragged correctly or not.
		if(target.getText().matches("Dropped!")) {
			System.out.println("Suceesfully dragged and Dropped!.....");
		}
		else
			System.out.println("Sorry Try again!");
		driver.close();
		
	}

}
