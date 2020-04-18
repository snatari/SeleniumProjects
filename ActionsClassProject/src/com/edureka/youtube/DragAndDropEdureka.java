package com.edureka.youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEdureka {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();

		driver.switchTo().frame(0);
		WebElement dragSource = driver.findElement(By.id("draggable"));
		WebElement dropTarget = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.clickAndHold(dragSource).moveToElement(dropTarget).build().perform();
		// or
		// act.dragAndDrop(dragSource, dropTarget).build().perform();

		Thread.sleep(3000);
		driver.close();
	}

}
