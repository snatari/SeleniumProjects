package simple.Authentication.pyt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticationPopUpEasyWay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// this is the normal way of opening web site(asks for user name & pwd).
		// driver.get("http://the-internet.herokuapp.com/basic_auth");
		// syntax to pass username & pwd in the url.
		// http://username:password@test.com
		// username & password is admin @test is url.
		// Here passing username & pwd in the url it self.without using AutoIT or Sikuli
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		String text = driver
				.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]"))
				.getText();
		System.out.println("after valid credentails msg is: " + text);
		Thread.sleep(2000);
		driver.close();
	}

}
