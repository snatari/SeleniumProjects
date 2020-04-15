package windows.handling.pyt;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Windows')]")).click();
		driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]"))
				.click();
		Set<String> windows = driver.getWindowHandles();
		for (String all : windows) {
			// this will get id of all windows.
			System.out.println(all);
			String winTitle = driver.switchTo().window(all).getTitle();
			//prints the title of the window.
			System.out.println(winTitle);
			// to close particular window validation is required.
			// closing parent window. u can close child window by giving title name of the
			// browser/window.
			 if(winTitle.equals("Frames & windows")) {
			//if (winTitle.equals("Sakinalium | Home")) {
				driver.close();
			}
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
