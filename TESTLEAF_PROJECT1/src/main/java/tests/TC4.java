package tests;

import org.testng.annotations.Test;

import base.TestNGAnnotations;
import base.Wdmethods;

public class TC4 extends TestNGAnnotations{
	@Test
    public void test1(){
		//invokeapp("firefox","http://leaftaps.com/opentaps");
		type(locateele("id", "username"),"DemoSalesManager");
		type(locateele("id", "password"),"crmsfa");
		click(locateele("classname", "decorativeSubmit"));
		click(locateele("linktext", "CRM/SFA"));
		click(locateele("linktext", "Create Lead"));
		type(locateele("id", "createLeadForm_companyName"),"Testleaf");
		type(locateele("id", "createLeadForm_firstName"),"Asif");
		type(locateele("id", "createLeadForm_lastName"),"Ahmed");
		selectbyvalue(locateele("name", "dataSourceId"),"LEAD_CONFERENCE");
		selectbyvalue(locateele("name", "marketingCampaignId"),"CATRQ_CARNDRIVER");
		type(locateele("id", "createLeadForm_primaryPhoneNumber"),"2345678");
		type(locateele("id", "createLeadForm_primaryEmail"),"xyz@testleaf.com");
		click(locateele("classname", "smallSubmit"));
		String s= gettext(locateele("id", "viewLead_companyName_sp")).trim().replace("Testleaf", "").replace("()","");
		System.out.println(s);
		//quitbrowser();
	}

}
