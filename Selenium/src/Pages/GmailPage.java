package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailPage {
	static WebDriver driver = null;
	static WebElement element = null;
	public static WebElement email_Gmail(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Use another account')]"));
		//element = driver.findElement(By.id("identifierId"));
		
		return element;
		
	}
	public static WebElement emailPhone_Gmail(WebDriver driver) {
 //  element = driver.findElement(By.xpath("//body[@id='yDmH0d']/div[@class='H2SoFe LZgQXe TFhTPc']/div[@id='initialView']/div[@class='xkfVF']/div[@id='view_container']/div[@class='zWl5kd']/div[@class='DRS7Fe bxPAYd k6Zj8d']/div[@class='pwWryf bxPAYd']/div[@class='Wxwduf Us7fWe JhUD8d']/div[@class='WEQkZc']/div[@class='bCAAsb']/form/span/section[@class='TgkVnd']/div[@class='dMArKd bxPAYd k6Zj8d']/div/div[@class='zeRELc']/div[@class='pQ0lne']/ul[@class='OVnw0d']/li[2]/div[1]"));
  // element = driver.findElement(By.id("identifierId"));
  // element = driver.findElement(By.xpath("//input[@id='identifierId']"));
		return element;
		
	}
	public static WebElement password_Gmail(WebDriver driver) {
		element = driver.findElement(By.name("password"));
		
		return element;
		

}
	public static WebElement clickNext_Button(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[text()='Next']"));
		
		return element;
		
}}
