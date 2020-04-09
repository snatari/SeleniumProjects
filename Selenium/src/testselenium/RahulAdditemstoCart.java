package testselenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RahulAdditemstoCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//to maximize the window.
		driver.manage().window().maximize();
		int j=0;
		
		String veggi[] = {"Brocolli","Tomato","Mushroom","Corn","Mango","Raspberry","Pista","Cashews"};
	Thread.sleep(4000);
		List<WebElement> productsName= driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<productsName.size();i++) {
			//use split method to split(Brocolli - 1 Kg)
			String name[]=productsName.get(i).getText().split("-");
			//trim method to trim spaces for Brocolli.
			String formatedName =name[i].trim();
			//format it to get actual vegetable name

			//convert array into array list for easy search
			 List<String> itemsNeededList = Arrays.asList(veggi); 
			//  check whether name you extracted is present in arrayList or not-
			// int j=0;
			if(itemsNeededList.contains(formatedName)) {
				j++;
		//	driver.findElement(By.xpath("//*[@id='\root\']/div/div[1]/div/div[1]/div[3]")).click();
				//click on add to cart.
			// driver.findElement(By.xpath("//div[@clas='product-action']/button")).click();
			// driver.findElement(By.xpath("//button[@contains(text(),'ADD TO CART')]")).click();
			 driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			
			if(j==veggi.length) {
				break;
			}
			//	driver.close();
			}
				
			
			
			
			
			
		}
	
	
	
	}

}
