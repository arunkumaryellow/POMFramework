package pageTests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestNGAnnotations;
import dataProvider.Exceldata;
import pageFactory.Homepage;
import pageFactory.Leadspage;


public class LeadsTC5 extends TestNGAnnotations {
	
	
	@BeforeClass
	public void setvalue()
	{
		excelname = "Login";
		sheetname="Details";
		
	}
	@Test(dataProvider="fetchdata")
	public void TC05(String uName, String pass)
	{
		new Homepage()
		.username(uName)
		.password(pass)
		.lgnbutton();
		new Leadspage()
		.crmlinktxt()
		.leadstabclk()
		.findleads()
		.Emailidclk()
		.emailtxtbox()
		.btnclk()
		.verifytxt()
		.clickfirstname()
		.dupbtnclk()
		.verifytxtheader()
		.submitclk();
		
	}
	/*@DataProvider(name = "fetchdata")
	  public static Object[][] credentials() throws IOException {
	 
		return Exceldata.excelvalues("Login", "Details");
	       // return new Object[][] { { "DemoSalesManager", "crmsfa" }};
	 
	  }*/

}
