package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestNGAnnotations;
import base.Wdmethods;

public class TestNGcases extends TestNGAnnotations{
	
	
	
    @Test
    public void TestCase() throws InterruptedException
	{
    type(locateele("xpath","//input[@id='username']"),"DemoSalesManager");
	type(locateele("xpath", "//input[@id='password']"),"crmsfa");
	click(locateele("type", "submit"));
	click(locateele("linktext","CRM/SFA"));
	click(locateele("linktext","Leads"));
	click(locateele("linktext","Find Leads"));
	click(locateele("xpath","//span[text()='Phone']"));
	type(locateele("xpath","//input[@name='phoneCountryCode']"),"91");
	type(locateele("xpath","//input[@name='phoneNumber']"),"9840495772");
	click(locateele("xpath","//button[text()='Find Leads']"));
	Thread.sleep(5000);
	String Str=gettext(locateele("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	click(locateele("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	click(locateele("xpath","//a[text()='Delete']"));
	click(locateele("linktext","Find Leads"));
	type(locateele("xpath","//input[@name='id']"),Str);
	click(locateele("xpath","//button[text()='Find Leads']"));
	//QuitApp();
	}
	


	

}
