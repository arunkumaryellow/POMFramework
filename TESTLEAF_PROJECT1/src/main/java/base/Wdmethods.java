package base;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;


public class Wdmethods extends WdEventListernersCalls{
	
	WebDriver drivernew;
	public static EventFiringWebDriver eventdriver;
	
	/**
	 * This method is used to locate the elements
	 * Ex: locateele("id","usename")
	 * @param element- locator should be passed
	 * @param value - value of the locator should be passed
	 * @return element
	 */
	public WebElement locateele(String element,String value)
	{
		WebElement ele=null;
		switch(element)
		{
		case ("id"):
			ele=eventdriver.findElement(By.id(value));
			break;
		case ("name"):
			ele=eventdriver.findElement(By.name(value));
			break;
		case ("classname"):
			ele=eventdriver.findElement(By.className(value));
			break;
		case ("linktext"):
			ele=eventdriver.findElement(By.linkText(value));
			break;
		case ("partialLinkText"):
			ele=eventdriver.findElement(By.partialLinkText(value));
			break;
		case ("xpath"):
			ele=eventdriver.findElement(By.xpath(value));
			break;
		case ("cssSelector"):
			ele=eventdriver.findElement(By.cssSelector(value));
			break;
		case ("tagname"):
			ele=eventdriver.findElement(By.tagName(value));
			break;
		case ("type"):
			ele=eventdriver.findElement(By.xpath("//*[@type='"+value+"']"));
			break;
		default:
			System.out.println("The given "+element+" is not correct");
		}
		return ele;
		
	}
	public void type(WebElement ele,String value)
	{
		ele.sendKeys(value);
	}
	
	public void click(WebElement ele)
	{
		ele.click();
	}
	
	public void selectbyvalue(WebElement ele, String value)
	{
		Select dp=new Select(ele);
		dp.selectByValue(value);
		
	}
	public void selectbyvistext(WebElement ele, String value)
	{
		Select dp=new Select(ele);
		dp.selectByVisibleText(value);
	}
	public void selectbyIndex(WebElement ele,int value)
	{
		Select dp=new Select(ele);
		dp.selectByIndex(value);
	}
	public void switchtowindow(int index)
	{
		Set<String> allwindows= eventdriver.getWindowHandles();
		int app_index=allwindows.size();
		if(app_index>index)
		{
			System.out.println("The given "+index+" is not appeared in the application");
		}
		else
		{
		List<String> currentwindow= new ArrayList<>();
		currentwindow.addAll(allwindows);
		eventdriver.switchTo().window(currentwindow.get(index));
		}
		
			
		
	}
	public void alertaccept()
	{
		
		eventdriver.switchTo().alert().accept();
		
	}
	public void alertDismiss()
	{
		eventdriver.switchTo().alert().dismiss();
	}
	public String alerttext()
	{
		String text=eventdriver.switchTo().alert().getText();
		return text;
		
	}
	public void alerttype(String value)
	{
		eventdriver.switchTo().alert().sendKeys(value);
	}
	public void switchtoframe(WebElement ele)
	{
		eventdriver.switchTo().frame(ele);
		
	}
	public String verifytitle()
	{
		String title=eventdriver.getTitle();
		return title;
	}
	/*public void verifytext(WebElement ele,String title)
	{
		String actual_title=eventdriver.getTitle();
		if(actual_title.equalsIgnoreCase(title))
		{
			System.out.println("Title verified");
		}
		else
		{
			System.out.println("Title mismatch");
		}
		//return title;
	}*/
	public String getattribute(WebElement ele, String value)
	{
		String text=ele.getAttribute(value);
		return text;
	}
	public String gettext(WebElement ele)
	{
		String text=ele.getText();
		return text;
	}
	public void verifytext(WebElement ele,String value)
	{
		String expectedvalue=ele.getText();
		
		if(value.equalsIgnoreCase(expectedvalue))
		{
			System.out.println("Text Verified");
		}
		else
		{
			System.out.println("Text not verified");
		}
		
	}
	public void screenshot()
	{
		
	}
	public void closebrowser()
	{
		eventdriver.close();
	}
	public void quitbrowser()
	{
		eventdriver.quit();
	}
	public void invokeapp(String browser,String url)
	{
		
		switch(browser)
		{
		case ("ie"):
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
		 drivernew =new InternetExplorerDriver();
		
			break;
		case ("chrome"):
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		drivernew=new ChromeDriver();
			break;
		case ("Firefox"):
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		drivernew=new FirefoxDriver();
		break;
		default:
			System.out.println("The "+browser+" name is not supported");
		}
		eventdriver=new EventFiringWebDriver(drivernew);
		Wdmethods handler=new Wdmethods();
		eventdriver.register(handler);
		eventdriver.manage().window().maximize();
		eventdriver.get(url);
		
	}

}
