package actions.methods.pyt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		// Login
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		// Admin-->userManagement-->users
		Actions act = new Actions(driver);
		WebElement eleAdmin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		WebElement eleUserMa = driver.findElement(By.id("menu_admin_UserManagement"));
		WebElement eleUser = driver.findElement(By.id("menu_admin_viewSystemUsers"));
		// instead of writing 3 times.u can do it single step like below.
		/*
		 * act.moveToElement(eleAdmin).build().perform();
		 * act.moveToElement(eleUserMa).build().perform();
		 * act.moveToElement(eleUser).click().build().perform();
		 */
		// single step.
		act.moveToElement(eleAdmin).moveToElement(eleUserMa).moveToElement(eleUser).click().build().perform();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
