package actions.methods.pyt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Slider')]")).click();
		// returns how many frames are there in the webpage.
		// frames are identified with the tagname.
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//*[@id='slider']/span"));
		Actions act = new Actions(driver);
		// just gave random numbers 150,200 for X&Y co-ordinates.
		// act.clickAndHold(source).moveByOffset(150, 200).build().perform();
		// or
		act.dragAndDropBy(source, 150, 200).build().perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
