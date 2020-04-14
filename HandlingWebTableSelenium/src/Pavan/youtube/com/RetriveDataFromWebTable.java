package Pavan.youtube.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetriveDataFromWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Displays all the details of the employee.which is present in web table.
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		// returns column size
		int colcount = driver.findElements(By.xpath("html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/thead/tr/th"))
				.size();
		System.out.println("column count is :" + colcount);
		// Dispalys all header data in console.
		for (int i = 1; i <= colcount; i++) {
			String colHead = driver
					.findElement(
							By.xpath("html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/thead/tr/th[" + i + "]"))
					.getText();
			System.out.print(colHead + " ");
		}
		// returns row count/size.
		int rowcount = driver
				.findElements(
						By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr"))
				.size();
		System.out.println("No of rows are: " + rowcount);
		// loop to get each row data.
		for (int r = 1; r <= rowcount; r++) {
			for (int c = 1; c <= colcount; c++) {

				String rowData = driver.findElement(
						By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[" + r
								+ "]/td[" + c + "]"))
						.getText();
				System.out.print(rowData + " ");
			}
			System.out.println("");
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
