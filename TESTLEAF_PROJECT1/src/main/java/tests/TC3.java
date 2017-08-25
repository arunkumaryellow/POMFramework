package tests;

import org.testng.annotations.Test;

import base.TestNGAnnotations;
import base.Wdmethods;

public class TC3 extends TestNGAnnotations{
	@Test
	public void TC2() throws InterruptedException {
		// TODO Auto-generated method stub		
		//WebElement wbElm;
		
		//invokeapp("chrome", "http://leaftaps.com/opentaps");
		
		
		type(locateele("id", "username"), "DemoSalesManager");
		
		
		type(locateele("id", "password"), "crmsfa");
		
		
		click(locateele("xpath", "//input[@value='Login']"));
		
		
		click(locateele("linktext", "CRM/SFA"));
		
		
		click(locateele("linktext", "Leads"));
		
		
		
		click(locateele("linktext", "Find Leads"));
		
		
		type(locateele("xpath", "(//input[@name='firstName'])[3]"),"bb");
		
		
		click(locateele("xpath", "//button[text()='Find Leads']"));
		
		Thread.sleep(5000);
		
        click( locateele("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
        
        String checkTitle = verifytitle();
        if(checkTitle.equalsIgnoreCase("View Lead | opentaps CRM")){
        	
        
            click(locateele("linktext", "Edit"));
        	
          
            type(locateele("id", "updateLeadForm_companyName"),"Glencore");
        	
        
            click(locateele("xpath", "//input[@value='Update']"));
       
            
        	String companyName = gettext(locateele("id", "viewLead_companyName_sp"));
        	
        	if(companyName.contains("Glencore")){
        		System.out.println("The Company Name is updated");
        	}
        }
        else{
        	System.out.println("The Title did not match");
        }
       // quitbrowser();
	}

}
