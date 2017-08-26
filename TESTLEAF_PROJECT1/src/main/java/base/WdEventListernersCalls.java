package base;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WdEventListernersCalls implements WebDriverEventListener{

	@Override
	public void afterAlertAccept(WebDriver arg0) {
		
		System.out.println("Alert accepted successfully");
		
	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) {
		
		System.out.println("Alert Dismissed successfully");

	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		
		System.out.println("The "+arg2+" value has entered successfully");

	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		
		System.out.println("The element "+arg0+" has clicked successfully");

		
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		
		System.out.println("The "+arg0+" elemnt found successfully");

		
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		
		System.out.println("The "+arg0+" navigated successfully");

	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		
		System.out.println("Alert accepted");

	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		
		System.out.println("After the refresh of page");

	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		
		System.out.println("After navigating done");

		
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		
		System.out.println("Alert script");

	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		
		System.out.println("Before the alert accepted");

	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		
		System.out.println("Before alert dismiss");

	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		
		System.out.println("Before the value change to");

	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
	/*	WebDriverWait wait=new WebDriverWait(arg1, 10);
		wait.until(ExpectedConditions.elementToBeClickable(arg0));*/
		
		System.out.println("Before the click on");

	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		
		System.out.println("Before find by");

	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		
		System.out.println("Before navigating back");

	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		
		System.out.println("Before Navigating forward");

	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		
		System.out.println("Before refresh");

	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		
		System.out.println("Before the navigation done");

	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		
		System.out.println("Before the script");

	}

	@Override
	public void onException(Throwable exception, WebDriver arg1) {
		
		String full_msg=exception.getMessage();
		String Splitmsg[]=full_msg.split("Element info:");
		if(exception instanceof NoSuchElementException)
		{
			System.out.println("The element "+Splitmsg[1]+" could not found ");
			//System.out.println("The element could not be found:"+exception.getMessage());
		}
		else if(exception instanceof NoSuchWindowException)
		{
			System.out.println("The window could not be found:"+exception.getMessage());
		}
		else if(exception instanceof NullPointerException)
		{
			System.out.println("The value retuns null:"+exception.getMessage());
		}
		else if(exception instanceof NoAlertPresentException)
		{
			System.out.println("The Alert could not found:"+exception.getMessage());
		}
		else if(exception instanceof NoSuchFrameException)
		{
			System.out.println("The frame does not exist:"+exception.getMessage());
		}
		else if(exception instanceof ElementNotVisibleException)
		{
			System.out.println("The element not visible:"+exception.getMessage());
		}
		else if(exception instanceof ElementNotSelectableException)
		{
			System.out.println("The element not selectable:"+exception.getMessage());
		}
		else if(exception instanceof IndexOutOfBoundsException)
		{
			System.out.println("Index Error :"+exception.getMessage());
		}
		else if(exception instanceof org.openqa.selenium.TimeoutException)
		{
			System.out.println("The value "+exception.getMessage()+" loading timeout");
		}
		throw new RuntimeException();

	}

}
