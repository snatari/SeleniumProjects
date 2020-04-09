package Tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.GoogleSearchPages;
public class GoogleSearchTest {
	static WebDriver driver= null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 googleSearch();
	}
	 public static void googleSearch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				 "C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.navigate("https://www.google.com/");
		GoogleSearchPages.textbox_Search(driver).sendKeys("Automation step  by step");
		GoogleSearchPages.button_Search(driver).click();
		//other way of click() operation is below....
		//GoogleSearchPages.button_Search(driver).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		driver.close();
		System.out.println("You Did PagePOM Model Succesfully!.......");
	 }
}
