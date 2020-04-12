package YouTube.pavan.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//in the search box sending keys
		driver.findElement(By.name("q")).sendKeys("java");
		//it will dispaly all java related list.
		//using List to keep all the elements & used FindElements.
	List<WebElement> listelement =driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println("List of elements are: "+listelement.size());
		//now looping to find what element to select & click
	for(int i=0;i<listelement.size();i++) {
		String datalist =	listelement.get(i).getText();
		if(datalist.contains("java interview questions")) {
		listelement.get(i).click();	
		break;
		}
			
		}
	Thread.sleep(3000);
	driver.quit();

	}

}
