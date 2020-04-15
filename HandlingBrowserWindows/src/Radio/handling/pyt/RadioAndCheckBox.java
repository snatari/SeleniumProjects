package Radio.handling.pyt;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioAndCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Saraswathi");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("God");
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"))
				.sendKeys("Hi, I am Learning Selenium");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input"))
				.sendKeys("Saraswathi@yahoo.com");
		driver.findElement(By.xpath(
				"//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']"))
				.sendKeys("1233456789");
		// Radio buttons
		// driver.findElement(By.name("radiooptions")).click();
		System.out.println(driver.findElement(By.name("radiooptions")).isSelected());
		driver.findElement(By.name("radiooptions")).click();
		// verify radio button is selected or not.
		if (driver.findElement(By.name("radiooptions")).isSelected() == true) {
			System.out.println("Female radio button selected!!!");
		}
		// Check box can select multiple boxes!!
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		// scrolldown
		// driver.findElement(By.id("msdd")).click();
		// drop down box
		WebElement ele = driver.findElement(By.id("Skills"));

		Select sel = new Select(ele);
		System.out.println("size of ele skills is: " + sel.getOptions().size());
		sel.selectByVisibleText("Client Server");
		WebElement ele1 = driver.findElement(By.id("countries"));
		Select sel1 = new Select(ele1);
		// sel1.selectByVisibleText("Canada");
		sel1.selectByValue("Canada");
		driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"))
				.sendKeys("Denmark");
		WebElement ele2 = driver.findElement(By.id("yearbox"));
		Select sel2 = new Select(ele2);
		sel2.selectByVisibleText("1920");
		WebElement ele3 = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select sel3 = new Select(ele3);
		sel3.selectByValue("September");

		WebElement ele4 = driver.findElement(By.id("daybox"));
		Select sel4 = new Select(ele4);
		sel4.selectByValue("28");
		driver.findElement(By.id("firstpassword")).sendKeys("Hello123");
		driver.findElement(By.id("secondpassword")).sendKeys("Hello123");
		driver.findElement(By.id("submitbtn")).click();
		// refresh button
		// driver.findElement(By.id("Button1")).click();
		if (driver.getTitle().contains("Web Table") == true) {

			System.out.println("Succesfully registered!!!");
		}
		Thread.sleep(6000);
		//System.out.println("Registered");
		driver.quit();
		
	}

}
