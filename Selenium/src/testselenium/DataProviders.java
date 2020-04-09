package testselenium;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviders {
  @Test(dataProvider = "data")
  public void dataPrint(Integer n, String s) {
	  System.out.println(n+" "+s);
  }
//Data provider annotations will return Object[][] array.
  @DataProvider(name="data")
  public Object[][] dataInput() {
    return new Object[][] {
       {  1,"a" },
        { 2, "b" },
       { 3,"c"}
    };
  }
}
