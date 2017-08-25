package base;

import org.openqa.selenium.WebElement;

public interface WdInterfacemethods {
	public WebElement locateele(String element,String value);
	
	public void type(WebElement ele,String value);
	
	
	public void click(WebElement ele);
	
	
	public void selectbyvalue(WebElement ele, String value);
	
	public void selectbyvistext(WebElement ele, String value);
	
	public void selectbyIndex(WebElement ele,int value);
	
	public void switchtowindow(int index);
	
	public void alertaccept();
	
	public void alertDismiss();
	
	public String alerttext();
	
	public void alerttype(String value);
	
	public void switchtoframe(WebElement ele);
	
	public String verifytitle();
	
	public String getattribute(WebElement ele, String value);
	
	public String gettext(WebElement ele);
	
	public boolean verifytext(WebElement ele,String value);
	
	public void screenshot();
	
	public void closebrowser();
	
	public void quitbrowser();
	
	public void invokeapp(String browser,String url);
	


}
