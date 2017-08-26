package pageTests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestNGAnnotations;
import dataProvider.Exceldata;
import pageFactory.Homepage;


public class Loginpage extends TestNGAnnotations{
	
	String Excelnametname;
	String sheetname;
	@BeforeClass
	public void setvalue()
	{
		Excelnametname = "Login";
		sheetname="Details";
		
	}
	@Test(dataProvider = "fetchdata")
	public void login(String uName, String pass)
	{
		new Homepage()
		.username(uName)
		.password(pass)
		.lgnbutton();
		
	}
	@DataProvider(name = "fetchdata")
	  public static Object[][] credentials() throws IOException {
	 
		return Exceldata.excelvalues("Login", "Details");
	       // return new Object[][] { { "DemoSalesManager", "crmsfa" }};
	 
	  }

}
