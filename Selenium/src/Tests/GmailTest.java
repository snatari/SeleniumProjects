package Tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.GmailPage;

public class GmailTest {
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub}
		launch();
	}
	public static void launch() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		GmailPage.email_Gmail(driver).click();
		Thread.sleep(5000);
		GmailPage.emailPhone_Gmail(driver).sendKeys("342-456-6673");
		GmailPage.clickNext_Button(driver).click();
		GmailPage.password_Gmail(driver).sendKeys("Hello123");
		GmailPage.clickNext_Button(driver).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("Succesfull");
	}
}

