package TestNg;

import org.testng.annotations.Test;

public class Groups {
	//to run particular testing like smoke,regression,unit,functional. u can select groups 
	//in XMLfile(create it)write <groups> <run><include name="Functional"></include></run>
	 // </groups>.so that it will run only particular test. grp.xml file is created.
  @Test(groups= {"smoke","Regression"})
  public void display() {
	  System.out.println("your msg is displayed..");
  }
  @Test(groups= {"Functional","UnitTesting"})
  public void visible() {
	  System.out.println("your msg is visible..");
  }
  @Test(groups= {"Functional","UnitTesting","Regression"})
  public void textMsg() {
	  System.out.println("i got your textmsg ..");
  }
  @Test(groups= {"smoke"})
  public void call() {
	  System.out.println("thanks for the call..");
  }
}
