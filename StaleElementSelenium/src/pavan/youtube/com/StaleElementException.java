package pavan.youtube.com;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.pavantestingtools.com/");
		driver.manage().window().maximize();
	WebElement elementlink=	driver.findElement(By.xpath("//ul[@class='menupbt nav-menu']//a[contains(text(),'Training')]"));
		elementlink.click();
		driver.navigate().back();
		Thread.sleep(3000);
		//now elementlink is not able to recognize .put in try catch block
		//find the element again
		elementlink.click();
		try {
			elementlink.click();
		}catch(StaleElementReferenceException e) {
			elementlink=	driver.findElement(By.xpath("//ul[@class='menupbt nav-menu']//a[contains(text(),'Training')]"));
			elementlink.click();
		}
		

	}

}
