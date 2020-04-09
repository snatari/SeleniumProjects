package TestNg;

import org.testng.annotations.Test;

public class TestSuite1 {
	//creating XMLFile by grouping two or more classes.
  @Test
  public void sum() {
	  System.out.println("1+2=3");
  }
  @Test
  public void mul() {
	  System.out.println("2*3=6");
  }
  @Test
  public void sub() {
	  System.out.println("10-4=6");
  }
}
