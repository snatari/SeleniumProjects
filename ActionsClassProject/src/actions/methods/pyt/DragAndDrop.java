package actions.methods.pyt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//++++++++This romeDrag element is not able to find!!+++='=='
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dhtmlgoodies.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Drag and drop')]")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[6]/p[36]/a[2]")).click();
		// WebElement romeDrag= driver.findElement(By.cssSelector("#node18"));
		// WebElement romeDrag=
		// driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/ul/li[16]"));
//WebElement romeDrag=	driver.findElement(By.xpath("//li[contains(text(),'Rome')]"));
		WebElement romeDrag = driver.findElement(By.xpath("//ul[@id='allItems']//li[@id='node18']"));
		WebElement italyDrop = driver.findElement(By.cssSelector("#box1"));
		Actions act = new Actions(driver);
		// act.dragAndDrop(romeDrag, italyDrop).build().perform();
		// or
		act.clickAndHold(romeDrag).moveToElement(italyDrop).release().build().perform();

	}

}
