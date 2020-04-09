package Tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.RahulShettyAcademyPages; 
public class RahulShettyTest {
	static WebDriver driver= null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rahulAcademy();
	}
	public static void rahulAcademy() {
		System.setProperty("webdriver.chrome.driver", 
				 "C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://courses.rahulshettyacademy.com/");
		driver.manage().window().maximize();
		RahulShettyAcademyPages.coursesLink_click(driver).sendKeys(Keys.RETURN);
		//System.out.println(";;;;;");
		RahulShettyAcademyPages.selectCourse_click(driver).sendKeys("core java");
		//RahulShettyAcademyPages.selectCourse_click(driver).sendKeys(Keys.RETURN);
		RahulShettyAcademyPages.searchBox_click(driver).click();
		//RahulShettyAcademyPages.selectCourse_click(driver).sendKeys(Keys.RETURN);
		System.out.println("+++++");
	}
}
