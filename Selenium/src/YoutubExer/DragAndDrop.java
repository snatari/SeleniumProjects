package YoutubExer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
	//@Test
	//public void dragAnddropEMI() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Thread.sleep(2000);
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='loaninterest']")).clear();
		//driver.manage().window().wait(2000);
		//driver.findElement(By.xpath("//input[@id='loaninterest']")).clear();
		driver.findElement(By.xpath("//input[@id='loaninterest']")).sendKeys("12");
		//driver.close();
		//Actions act = new Actions(driver);
//		WebElement homeLoan = driver.findElement(By.xpath("//div[@id='loanamountslider']"));
//		WebElement interestrate = driver.findElement(By.xpath("//div[@id='loaninterestslider']"));
//		WebElement tenture = driver.findElement(By.xpath("//div[@id='loantermslider']"));
//		act.dragAndDropBy(homeLoan, 83, 0).build().perform();
//		Thread.sleep(2000);
//		act.dragAndDropBy(interestrate, 88, 0).build().perform();
//		Thread.sleep(2000);
//		act.dragAndDropBy(tenture, -111, 0).build().perform();
//		Thread.sleep(2000);
//		WebElement loanEmi = driver.findElement(By.xpath("//h4[text()='Loan EMI']"));
//		String loanamount = loanEmi.getText();
//		Assert .assertEquals("92,439",loanamount);
//		Thread.sleep(2000);
//		driver.close();
		//Thread.sleep(2000);
		//driver.findElement(By.id("loanamount")).clear();
		//driver.findElement(By.id("loanamount")).sendKeys("75,00,000");
		/*driver.findElement(By.xpath("//input[@id='loaninterest']")).clear();
		driver.findElement(By.xpath("//input[@id='loaninterest']")).sendKeys("12.5");
		Thread.sleep(2000);
		/*driver.findElement(By.xpath("//input[@id='loaninterest']")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='loaninterest']")).sendKeys("12.5");
		driver.findElement(By.xpath("//input[@id='loanterm']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='loanterm']")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='loanterm']")).sendKeys("15");
//		Thread.sleep(3000);
//		WebElement loanelement =driver.findElement(By.xpath("//h4[contains(text(),'Loan EMI')]"));
//		String textloan = loanelement.getText();
//		System.out.println(textloan);
//		WebElement loanamount =driver.findElement(By.xpath("//span[contains(text(),'92,439')]"));
//		String textamount = loanamount.getText();
//		Assert.assertEquals("92,439", textamount);
//		Thread.sleep(3000);
//		driver.close();*/
		
		
	}
}
