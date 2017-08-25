package pageTests;

import org.testng.annotations.Test;

import base.TestNGAnnotations;
import pageFactory.Homepage;
import pageFactory.Leadspage;

public class LeadsTC5 extends TestNGAnnotations {
	@Test
	public void TC05()
	{
		new Homepage()
		.username()
		.password()
		.lgnbutton();
		new Leadspage()
		.crmlinktxt()
		.leadstabclk()
		.findleads()
		.Emailidclk()
		.emailtxtbox()
		.btnclk()
		.verifytxt()
		.dupbtnclk()
		.verifytxtheader()
		.submitclk();
		
	}

}
