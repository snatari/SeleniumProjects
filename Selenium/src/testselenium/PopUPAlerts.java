package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUPAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe ");
		WebDriver driver = new FirefoxDriver();
//		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
//		//driver.findElement(By.xpath("//button[@type='button']")).click();
//		driver.findElement(By.cssSelector("button.btn")).click();
//		//driver.switchTo().alert();
//		String Text = driver.switchTo().alert().getText();
//		System.out.println(Text);
//	// driver.switchTo().alert().accept();
//	 if(Text.contentEquals("Please select start place.")) {
//		 driver.switchTo().alert().accept();
//		 Thread.sleep(5000);
//		 System.out.println("Got Correct text Msg!");
//	 }
//	 else
//		 System.out.println("Sorry got Wrong Text Message");
//	 driver.close();
//
//	}
//
//}
//	driver.get("https://intellipaat.com/?gclid=Cj0KCQiAgKzwBRCjARIsABBbFugs5QuZO-m6BTGC5Uv6zFMrtFiCQ6Q0L2MyASiCmQ7rT-o1QzEcPb8aAtnpEALw_wcB");	
//		//driver.findElement(By.linkText("Login")).click();
//		//driver.findElement(By.xpath("//*[@id=\'menu-course-new-top-menu\']/li[3]/a")).click();
//		driver.findElement(By.cssSelector("#menu-course-new-top-menu > li.login-topmenu > a")).click();
//		driver.switchTo().alert().getText();
//		
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.findElement(By.id("name")).sendKeys("Swathi");
		Thread.sleep(3000);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		String Text=driver.switchTo().alert().getText();
		
		System.out.println(Text);
		driver.switchTo().alert().dismiss();
		driver.close();
		
		
		
		
		
		
		
		
}
}