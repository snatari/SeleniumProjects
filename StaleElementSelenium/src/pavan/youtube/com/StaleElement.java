package pavan.youtube.com;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaleElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://freecrm.com/index.html");
		driver.manage().window().maximize();
		// Absolute XPath
		// driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
		// Relative Xpath
		driver.findElement(
				By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='E-mail address']"));
		email.sendKeys("Harshi@gmail.com");
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("asdef");
		driver.navigate().refresh();
		try {
			email.sendKeys("Harshi@gmail.com");
			pwd.sendKeys("asdef");
		} catch (StaleElementReferenceException e) {
			email = driver.findElement(By.xpath("//input[@placeholder='E-mail address']"));
			email.sendKeys("Harshi@gmail.com");
			pwd = driver.findElement(By.name("password"));
			pwd.sendKeys("asdef");
			Thread.sleep(3000);
		}
		driver.quit();
	}
}
