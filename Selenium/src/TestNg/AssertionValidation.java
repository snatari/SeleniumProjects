package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionValidation {
  @Test
  public void validate() {
	  String s1="Swathi";
	  String s3 ="Swathi";
	  Assert.assertEquals(s1, s3);
	  System.out.println("Both s1&s3 are same..");
	  //==================================================================
	  //Assert fail will "fail" the test case even though it is correct.
	 // Assert.fail("Error please check!");
	//=================================================================
	  //if the condition is "False" then below statements will " not " executed.
	 // Assert.assertTrue(12<10,"InvalidResult..");
	 // System.out.println("Failed sorry!");
	  //=================================================================
	  //if the condition is "true" then below statements" will be" executed.
	//  Assert.assertTrue(12>10,"TrueResult..");
	 // System.out.println("passed");
	  //===================================================================
  }
  @Test
  public void check() {
	  String s2="Sulluru";
	  String s4="sulluru";
	  Assert.assertEquals(s2, s4);
	  System.out.println("Both s2&s4 are 'not'same!..");
	//  Assert.assertTrue(s2==s4,"InvalidResult..");
	
  }
}
