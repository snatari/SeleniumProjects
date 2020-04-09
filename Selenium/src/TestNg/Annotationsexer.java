package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotationsexer {
	//==========================================
	//diff.btw BeforeClass And BeforeMEthod is beforeclass will open the browser for diff. URLS in same page.
	//BeforeMethod will open the browser for mul.URLS  in mulitiple windows.
	WebDriver driver=null;
//	@BeforeClass
//	public void launch() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		 driver = new ChromeDriver();
//		 driver.manage().window().maximize();
//	}
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}

	@Test
	public void google() {
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Google");
	}
	@Test
	public void facebook() {
		driver.get("https://www.facebook.com/");
		Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
		
	}
	//=====================================================================
	//diff.btw AfterClass andAfterMethod is AfterClass will close the browser last after 2 methods/test is excuted.
	//AfterMethod will close the browser  each time after every method/test case is executed.
//	@AfterClass
//	public void close() {
//		driver.close();
//	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
