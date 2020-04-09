package TestNg;

import org.testng.annotations.Test;

public class TestNgExer {
	//if u don't give priority to test then it will run (test cases/methods)by alphabetical order.
  @Test(priority=1)
  public void display() {
	  System.out.println("You'r Message is Displayed sucessfully....");
  }
  @Test(priority=2)
  public void action() {
	  System.out.println("action is displayed in Alaphabetically....");
  }
}
