package com.javascriptexecuter.pyt;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		// 1.to flash an element.
		WebElement signupfree = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));
		// JavaScriptUtilClass.flashing(signupfree, driver);
		// loginbutton
		// WebElement
		// loginbutton=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a"));
		// JavaScriptUtilClass.flashing(loginbutton, driver);
		// 2.drawing an border an element.
		JavaScriptUtilClass.borderColor(signupfree, driver);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File filetarget = new File("C:\\screenshotselenium\\twoplugs.png");
		// FileUtils.copyFile(src,filetarget);
		// normal way of aget title
		System.out.println("Normal way of get title : " + driver.getTitle());
		// 3.Capture the title of the page by JS
		String titlejs = JavaScriptUtilClass.getTitleJS(driver);
		System.out.println("JS way of get title : " + titlejs);
		// 4.click on element by js(loginbutton)
		WebElement loginbutton = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a"));
		// JavaScriptUtilClass.clickElementbyJS(loginbutton , driver);
		Thread.sleep(3000);
		// 5.Generate ALRET info
		// it will display popup message on webpage!!!
		// JavaScriptUtilClass.generateAlretbyJS( driver,"You clicked on login button");
		// Thread.sleep(3000);
		// normal way to refresh webpage
		// driver.navigate().refresh();
		// 6.Refreshing the webpage by JS.

		JavaScriptUtilClass.refreshBrowserByJS(driver);

		// 7.Scrolling webpage at paricular webelment by JS
		WebElement signuplink = driver.findElement(By.xpath("//h3[contains(text(),'Sign up')]"));
		// JavaScriptUtilClass.scrollWebPageByJS(signuplink, driver);
		// Thread.sleep(9000);
		// 7.Scrolling webpage till end/bottom of the page by JS
		JavaScriptUtilClass.scrollWebPagedownByJS(driver);
		Thread.sleep(9000);
		driver.close();

	}

}
