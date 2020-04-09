package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysExer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("Sulluru");
		Actions act = new Actions(driver);
		//here i copied the Username value(Sulluru) to password field by using" keys" keyword..
		act.click(driver.findElement(By.name("userName")))
		.keyDown(Keys.CONTROL)
		.sendKeys("a")//ctrl+a to select
		.sendKeys("c")//ctrl+c to copie
		.keyDown(Keys.CONTROL)
		.click(driver.findElement(By.name("password")))
		.keyDown(Keys.CONTROL)
		.sendKeys("v")//ctrl+v to paste it in password field.
		.keyDown(Keys.CONTROL).build().perform();
		
		Thread.sleep(3000);
		driver.close();

	}

}
