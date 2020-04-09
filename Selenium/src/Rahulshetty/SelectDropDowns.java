package Rahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//
//		driver.get("https://www.spicejet.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[@value='BLR']")).click();
//		Thread.sleep(3000);
//		// here [2](will be seleceted in FROM Dropdown) represent index there is same
//		// element in TO dropdown and FROM dropdown.
//	//	driver.findElement(By.xpath("(//a[@value='TIR'])[2]")).click();
//		// finding element by parent .
//		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='TIR']"))
//				.click();
//
//		Thread.sleep(3000);
//		driver.close();

		// ------------------AutoSuggestive DropDown -------------------
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement fromcity = driver
				.findElement(By.xpath("//div[contains(@class,'fsw_inputBox searchCity inactiveWidget')]"));

		fromcity.click();
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
		fromcity.clear();
		fromcity.sendKeys("mum");
		Thread.sleep(3000);
		//fromcity.sendKeys(Keys.ARROW_DOWN);
		//Thread.sleep(3000);
		fromcity.sendKeys(Keys.ENTER);

		// fromcity.clear();
		// Thread.sleep(3000);
//	 WebElement ele= driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
//	 ele.sendKeys("mum");
//	 ele.sendKeys(Keys.ARROW_DOWN);
//	 Thread.sleep(3000);
//	 fromcity.sendKeys(Keys.ENTER);

	}

}
