package base;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import dataProvider.Exceldata;

import org.testng.annotations.AfterTest;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotations extends Wdmethods {
	public static String excelname;
	public static String sheetname;
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest");
		
	}
	@BeforeGroups
	public void beforeGroups()
	{
		System.out.println("beforGroups");
	}
	/*@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass");
	}*/
	@DataProvider(name = "fetchdata")
	  public static Object[][] credentials() throws IOException {
	 
		return Exceldata.excelvalues(excelname, sheetname);
	       // return new Object[][] { { "DemoSalesManager", "crmsfa" }};
	 
	  }
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
		invokeapp("chrome", "http://leaftaps.com/opentaps/");
	}
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("After Suite");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}
	@AfterGroups
	public void beforGroups()
	{
		System.out.println("beforGroups");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method");
		quitbrowser();
		
	}

}
