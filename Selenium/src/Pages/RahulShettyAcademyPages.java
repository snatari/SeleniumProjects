package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RahulShettyAcademyPages {
	static WebElement ele = null;

	public static WebElement coursesLink_click(WebDriver driver) {
		ele = driver.findElement(By.xpath("//div[@class='nav-outer clearfix']//a[contains(text(),'Courses')]"));

		return ele;

	}
	public static WebElement selectCourse_click(WebDriver driver) {
		 ele=driver.findElement(By.xpath("//input[@id='search-courses']"));
		return ele;
	}
	public static WebElement searchBox_click(WebDriver driver) {
		ele=driver.findElement(By.xpath("//button[@id='search-course-button']"));
		 return ele;
	}
}
