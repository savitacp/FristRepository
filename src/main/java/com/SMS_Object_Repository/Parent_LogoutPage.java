package com.SMS_Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Parent_LogoutPage {
	
	
	@FindBy(xpath="//span[text()='Mr.']")
	private WebElement Parent;
	
	@FindBy(xpath="//a[.='Sign out']")
	private WebElement SignOutbtnP;
	
	

public  Parent_LogoutPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}





	public WebElement getSignOutbtnP() {
		return SignOutbtnP;
	}




	public void setSignOutbtnP(WebElement signOutbtnP) {
		SignOutbtnP = signOutbtnP;
	}








public void clickOnParentImage() throws Throwable {
	
	Thread.sleep(5000);
	 Parent.click();
	
}

public void ClickOnSignOut() throws Throwable{
	Thread.sleep(5000);
	SignOutbtnP.click();
	
}
}


