package TestNg;

import org.testng.annotations.Test;

public class TestSuiteXMLFile {
	//creating XMLFile by grouping two or more classes.
	//here i grouped two classes TestSuiteXMLFile.java and TestSuite1.java
	//testsuite.xml is created.(XML file ).
  @Test
  public void login() {
	  System.out.println("you logged in..");
  }
  @Test
  public void password() {
	  System.out.println("you password is correct..");
  }
  @Test
  public void click() {
	  System.out.println("you logged into account..");
  }
}
