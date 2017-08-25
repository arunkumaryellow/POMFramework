package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends AbstractPage{
	
	public Homepage()
	{
		PageFactory.initElements(eventdriver, this);
	}
	@FindBy(how=How.ID,using="username")
	WebElement uName;
	public Homepage username()
	{
		type(uName, "DemoSalesManager");
		return this;
	}
	
	@FindBy(how=How.ID,using="password")
	WebElement password;
	public Homepage password()
	{
		type(password, "crmsfa");
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	WebElement lgButton;
	public Leadspage lgnbutton()
	{
		click(lgButton);
		return new Leadspage();
	}
	

}
