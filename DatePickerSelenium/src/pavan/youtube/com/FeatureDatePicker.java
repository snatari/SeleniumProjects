package pavan.youtube.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FeatureDatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("datepicker")).click();

		// driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		// or
		// driver.findElement(By.xpath("/html/body/div[5]/div/a[2]/span")).click();
		// or
		// driver.findElement(By.xpath("//span[@class='ui-icon
		// ui-icon-circle-triangle-e']")).click();
		// checking date is printing or not
		// String dateText
		// =driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		// System.out.println(dateText);
		for (int i = 6; i >= 1; i--) {
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			String dateText = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			Thread.sleep(1000);
			if (dateText.contains("October")) {
				//driver.findElement(By.xpath("//a[contains(text(),'26')]")).click();
				//or
				//driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr[5]/td[2]/a")).click();
			//or
					driver.findElement(By.linkText("26")).click();
				
				break;

			}
		}
		Thread.sleep(3000);
		
		driver.quit();
	}

}
