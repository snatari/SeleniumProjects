package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;

import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenTesting {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		// how to pass the data from excel sheet to face book page(user name ,password).
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement usn=driver.findElement(By.id("email"));
		WebElement pwd=driver.findElement(By.id("pass"));
		Workbook wb = Workbook.getWorkbook(new File("C:\\Users\\swath\\Documents\\Credentials.xls"));

		Sheet sh = wb.getSheet("data");
		for(int i=1;i<sh.getRows();i++) {
			//with the webelement object passing data from excel through sendkeys .
			usn.sendKeys(sh.getCell(0, i).getContents());
			pwd.sendKeys(sh.getCell(1, i).getContents());
			Thread.sleep(2000);
			//clear the fields to pass the rest of name and password from excel.
			usn.clear();
			pwd.clear();
			//===========================================================================
			//u can sendkeys directly without creating webelement..
//			driver.findElement(By.id("email")).sendKeys(sh.getCell(0, i).getContents());
//			driver.findElement(By.id("pass")).sendKeys(sh.getCell(1, i).getContents());
//			Thread.sleep(2000);
//			
//			driver.findElement(By.id("email")).clear();
//			driver.findElement(By.id("pass")).clear();
			//===================================================================================
		}
		driver.close();
	}

}
