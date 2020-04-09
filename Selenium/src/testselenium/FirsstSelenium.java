package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirsstSelenium {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
////		driver.get("https://www.amazon.com//");
////		Thread.sleep(5000);
		System.setProperty("webdriver.chrome.driver", 
				 "C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//	driver.get("https://www.google.com/");
//	driver.findElement(By.name("q")).sendKeys("Nelson Middle School");
//	driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div/div[2]/div/span")).click();
//	driver.findElement(By.name("btnk")).click();
	driver.get("http://schools.friscoisd.org/campus/elementary/norris/home");
	driver.get("https://schools.friscoisd.org/campus/middle-school/nelson/home");
}
}