package pavan.youtube.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomateDatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//it is not working only this class.
		String month="May 2020";
		String day ="21";
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/home");
		driver.findElement(By.id("checkin")).click();
		String text = driver.findElement(By.xpath("//div[@class='datepicker -bottom-left- -from-bottom- active']"
				+ "//nav[@class='datepicker--nav']")).getText();
		System.out.println("text is :"+text);
		//driver.findElement(By.xpath("//div[1]//nav[1]//div[3]//*[local-name()='svg']"
			//	+ "//*[name()='path' and contains(@d,'M 14,12 l ')]")).click();
		driver.findElement(By.xpath("//div[@class='datepicker -bottom-left- -from-bottom- active']//nav[@class=)")).click();
		Thread.sleep(3000);
		System.out.println("tset");
		driver.quit();
		/*while(true) {
		String text = driver.findElement(By.xpath("//div[@class='datepicker -bottom-left- -from-bottom- active']"
				+ "//nav[@class='datepicker--nav']")).getText();
		if(text.equals(month)) {
		System.out.println("text is :"+text);
		break;
		}
		else {
			driver.findElement(By.xpath("//div[1]//nav[1]//div[3]//*[local-name()='svg']"
					+ "//*[name()='path' and contains(@d,'M 14,12 l ')]")).click();
			
		}
			
		Thread.sleep(3000);
		driver.quit();
	}*/

}}
