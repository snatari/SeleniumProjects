package windows.pop.pyt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpOkAndCancel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Alerts')]")).click();
		// Alert with ok button.
		// driver.findElement(By.xpath("//a[contains(text(),'Alert with
		// OK')]")).click();

		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		// Switch to alert popup.
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		// Alert with ok and cancel button.
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		System.out.println(driver.switchTo().alert().getText());
		// Cancel button to dismiss the popup.
		driver.switchTo().alert().dismiss();
		String actText = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(" dismiss/Cancel button :" + actText);
		if (actText.contains("You Pressed Cancel")) {
			System.out.println("test case is pased!!!");
		}
		// Alert with text box with ok & cancel button.
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Harshitha");
		driver.switchTo().alert().accept();
		String textmsg = driver.findElement(By.xpath("//p[@id='demo1']")).getText();

		if (textmsg.contains("Hello Harshitha How are you today")) {
			System.out.println("Alert with textbox test case is pased!!!");
		}
		driver.close();
	}

}
