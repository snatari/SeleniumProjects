package actions.methods.pyt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeableElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Resizable')]")).click();
		driver.switchTo().frame(0);
		//WebElement source = driver.findElement(By.id("resizable"));
		WebElement source = driver.findElement(By.xpath("//div[@id='resizable']"));
		Actions act = new Actions(driver);
		System.out.println("+++++++++++");
		act.moveToElement(source).dragAndDropBy(source, 200, 250).build().perform();
		System.out.println("==============");
		Thread.sleep(6000);
		driver.quit();

	}

}
