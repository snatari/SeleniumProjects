package Pavan.youtube.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
	int sizeRow =	driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div//form//div[4]/table/tbody/tr")).size();
		System.out.println(sizeRow);
		
		int count =0;
		for(int i=1;i<=sizeRow ;i++) {
			//this normal way of finding status for single row.
			//String textstatus =driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div//form//div[4]/table/tbody/tr[1]//td[5]")).getText();
			//we substiuted tr[1] with tr[i] for that we need to add "".
			//td[5] is constant we need to get all status of column 5th.
			String textstatus =driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]"
					+ "/div/div//form//div[4]/table/tbody/tr["+i+"]//td[5]")).getText();
			if(textstatus.contains("Enabled")) {
				count++;
			}else {
				System.out.println("sorry not able to find the status");
			}
		}System.out.println("No of Employess Enabled are :"+count);
	Thread.sleep(2000);
		driver.quit();

	}

}
