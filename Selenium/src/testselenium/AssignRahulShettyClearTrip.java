package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.support.ui.Select;

public class AssignRahulShettyClearTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\chromedriver_win32.\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
//		driver.switchTo().alert().getText();
//		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("DepartDate")).click();//sendKeys("2");
		// i copied cssselector 
	//	driver.findElement(By.cssSelector("#ui-datepicker-div > div.monthBlock.first > table > tbody > tr:nth-child(1) > td.ui-datepicker-days-cell-over.undefined.selected > a")).click();
		// here i have selected CSS for the calander for activedate (present) by class .
		//for that u need to put (a is tag name)a.classvalue f value have spaces we put dot(.)in the gaps.
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();
		WebElement element = driver.findElement(By.id("Adults"));
		Select S = new Select(element);
		S.selectByIndex(1);
		element = driver.findElement(By.id("Childrens"));
		 S = new Select(element);
		S.selectByValue("2");
		//finding element by ID
		//driver.findElement(By.id("MoreOptionsLink")).click();
		//finding element by Xpath ID
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
		//finding element by Xpath title.
	//	driver.findElement(By.xpath("//a[@title='More search options']")).click();
		
	//	driver.findElement(By.id("MoreOptionsLink")).click();
		element = driver.findElement(By.id("Class"));
		Select S1 = new Select(element);
		S1.selectByVisibleText("First");
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Atlasjet (KK)");
		driver.findElement(By.id("SearchBtn")).click();

		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
//		WebElement msg = driver.findElement(By.xpath("//div[contains(text(),'You missed this')]"));
//		String mess = msg.getText();
//		System.out.println(mess);
		
	
		 driver.close();
		
	}

}
