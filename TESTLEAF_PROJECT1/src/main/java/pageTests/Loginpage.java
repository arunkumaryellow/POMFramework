package pageTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestNGAnnotations;
import pageFactory.Homepage;


public class Loginpage extends TestNGAnnotations{
	
	@Test(dataProvider = "Authentication")
	public void login()
	{
		new Homepage()
		.username()
		.password()
		.lgnbutton();
		
	}
	@DataProvider(name = "Authentication")
	  public static Object[][] credentials() {
	 
	        return new Object[][] { { "DemoSalesManager"},{ "crmsfa" }};
	 
	  }

}
