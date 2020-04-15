package pavan.youtube.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PastDateSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("datepicker")).click();
		for(int i=2;i>=1;i++) {
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
	String preDate =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		//System.out.println(preDate);
	if(preDate.contains("February")) {
		driver.findElement(By.xpath("//a[contains(text(),'20')]")).click();
		break;
	}
		
		}Thread.sleep(3000);
		driver.quit();
		
}
}