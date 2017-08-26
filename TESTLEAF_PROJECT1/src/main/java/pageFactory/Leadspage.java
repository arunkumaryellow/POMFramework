package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Leadspage extends AbstractPage{
	public Leadspage()
	{
		PageFactory.initElements(eventdriver, this);
	}
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	WebElement CRMLinktextclk;
	public Leadspage crmlinktxt()
	{
		click(CRMLinktextclk);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	WebElement Leadstabclk;
	public Leadspage leadstabclk()
	{
		click(Leadstabclk);
		return this;
		
	}
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	WebElement Findleadsclk;
	public Leadspage findleads()
	{
		click(Findleadsclk);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	WebElement Emailidclk;
	public Leadspage Emailidclk()
	{
		click(Emailidclk);
		return this;
	}
	@FindBy(how=How.NAME,using="emailAddress")
	WebElement EmailidTxtbox;
	public Leadspage emailtxtbox()
	{
		type(EmailidTxtbox, "abc@mail.com");
		return this;
	}
	@FindBy(how = How.XPATH,using="//button[text()='Find Leads']")
	WebElement Finleadbtn;
	public Leadspage btnclk()
	{
		click(Finleadbtn);
		return this;
	}
	@FindBy(how = How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]/a")
	WebElement firstNametext;
	public Leadspage verifytxt()
	{
		verifytext(firstNametext, "James");
		return this;
	}
	@FindBy(how = How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]/a")
	WebElement clickfirstname;
	public Leadspage clickfirstname()
	{
		click(clickfirstname);
		return this;
	}
	@FindBy(how = How.XPATH,using="//a[text()='Duplicate Lead']")
	WebElement DuplicateLeadBtn;
	public Leadspage dupbtnclk()
	{
		click(DuplicateLeadBtn);
		return this;
	}
	@FindBy(how = How.ID,using="sectionHeaderTitle_leads")
	WebElement LeadsHeadertitle;
	public Leadspage verifytxtheader()
	{
		verifytext(LeadsHeadertitle, "Duplicate Lead");
		return this;
		
	}
	@FindBy(how = How.NAME,using="submitButton")
	WebElement Submit;
	public Leadspage submitclk()
	{
		click(Submit);
		return this;
	}
	/*@FindBy(how = How.ID,using="viewLead_firstName_sp")
	WebElement firstnamedupl;*/

}
