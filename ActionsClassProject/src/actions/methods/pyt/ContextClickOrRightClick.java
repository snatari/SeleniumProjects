package actions.methods.pyt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickOrRightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		//ContextClick means RightClick.
	WebElement ele=	driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		//To perform Mouse Actions we need to Use Actions Class.
	Actions act = new Actions(driver);
	act.contextClick(ele).build().perform();//Right Click on the element.
	driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-paste']")).click();
	String txt =driver.switchTo().alert().getText();
	System.out.println("Alert for Paste option: "+txt);
	driver.switchTo().alert().accept();
	//Verifying txt is matching.
	if(txt.contains("clicked: paste")) {
		System.out.println("Test case is passed!!!");
	}
	Thread.sleep(3000);
	driver.quit();

	}

}
