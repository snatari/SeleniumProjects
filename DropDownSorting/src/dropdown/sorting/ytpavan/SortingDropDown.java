package dropdown.sorting.ytpavan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SortingDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\swath\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("animals"));
		Select select = new Select(element);
		select.getOptions();
		List<String> originalList = new ArrayList<String>();
		List<String> tempList = new ArrayList<String>();
		List<WebElement> options = select.getOptions();
		for (WebElement e : options) {
			originalList.add(e.getText());
			tempList.add(e.getText());
		}
		System.out.println("OriginalList is: " + originalList);
		System.out.println("Before Sorting tempList :" + tempList);
		Collections.sort(tempList);
		System.out.println("After sorting tempList :" + tempList);
		// Verifying temList is sorted or not.
		if (originalList == tempList) {
			System.out.println("Sorry tempList is not sorted!!!!!");
		} else {
			System.out.println("temList is sorted");
		}
		driver.close();
	}

}
