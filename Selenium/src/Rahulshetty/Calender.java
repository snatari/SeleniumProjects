package Rahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// select the calender not active one (cuurent date). selecting future dates.
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox dates inactiveWidget ')]")).click();
		
		driver.findElement(By.xpath("//div[@class='DayPicker-wrapper']//div[1]//div[3]//div[4]//div[3]")).click();
		driver.close();
	}

}
