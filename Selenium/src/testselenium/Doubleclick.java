package testselenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		// Module 8 Lecture2.
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	System.setProperty("webdriver.gecko.driver","C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe ");
	//	WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
	//WebElement ele=	driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]"));
		//act.moveToElement(ele).doubleClick().build().perform();
	// or u can use below option toooo..
		//act.doubleClick(ele).build().perform();
		// it is used to right click the element. right click is also called as contextClick();
	//act.moveToElement(ele).contextClick(ele).build().perform();
	//act.contextClick(ele).perform();
		//23 line u can do like below tooo..
		driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]")).click();
		driver.close();
	}

}
