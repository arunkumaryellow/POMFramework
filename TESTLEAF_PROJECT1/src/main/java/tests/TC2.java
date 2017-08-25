package tests;

import org.testng.annotations.Test;

import base.TestNGAnnotations;
import base.Wdmethods;

public class TC2 extends TestNGAnnotations{
	@Test
	public void test() throws InterruptedException
	{
		//invokeapp("chrome", "http://leaftaps.com/opentaps");
		type(locateele("id", "username"), "DemoSalesManager");
		type(locateele("id","password"),"crmsfa");
		click(locateele("classname", "decorativeSubmit"));
		click(locateele("linktext", "CRM/SFA"));
		click(locateele("linktext", "Leads"));
		click(locateele("linktext", "Find Leads"));
		click(locateele("xpath", "//span[text()='Email']"));
		type(locateele("name","emailAddress"),"abc@mail.com");
		click(locateele("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(5000);
		String firstname=gettext(locateele("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]/a"));
		click(locateele("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]/a"));
		click(locateele("xpath", "//a[text()='Duplicate Lead']"));
		String title=gettext(locateele("id", "sectionHeaderTitle_leads"));
		if(title.equalsIgnoreCase("Duplicate Lead"))
		{
			System.out.println(title+" Verified successfully");
		}
		else
		{
			System.out.println("Failed");
		}
		click(locateele("name", "submitButton"));
		String checkname=gettext(locateele("id", "viewLead_firstName_sp"));
		if(firstname.equalsIgnoreCase(checkname))
		{
			System.out.println("Verified");
		}
		else
		{
			System.out.println("Not verified");
		}
		//quitbrowser();
		
	}

}
