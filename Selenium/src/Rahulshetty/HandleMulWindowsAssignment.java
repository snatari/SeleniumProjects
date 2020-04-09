package Rahulshetty;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMulWindowsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swath\\Downloads\\chromedriver_win32.\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		//System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
//	WebElement ele=driver.findElement(By.xpath("//h3[contains(Text(),'New Window')]"));
//	System.out.println(ele.getText());
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it =ids.iterator();
        String parentwindow = it.next();
        String childwindow = it.next();
        
      driver.switchTo().window(childwindow);
      //  System.out.println(driver.getTitle());
        
      WebElement ele =  driver.findElement(By.xpath("//h3[contains(text(),'New Window')]"));
      System.out.println(ele.getText());
        driver.switchTo().window(parentwindow);
      
       // WebElement    ele1 = driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window)']"));
       // WebElement ele1 = driver.findElement(By.linkText("Opening a new window"));
     //   above 2 find element are not working . so i copied xpath .
        // u can do it in 2 ways 
        // first way
//        WebElement ele1 = driver.findElement(By.xpath("//*[@id='content']/div/h3"));
//        System.out.println(ele1.getText());
        //secondway simple not many lines in one statement miultiple operations.
        System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText());
        driver.quit();
     	}

}
