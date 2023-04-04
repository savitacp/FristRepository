package com.SMS_Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="email")
	private WebElement usernametxtbtn;
	
	@FindBy(id="password")
	private WebElement passwordnametxtbtn;
	
	@FindBy(id="btnSubmit")
	private WebElement submitbtn;
	
	//intialization
	
	public LoginPage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
		
	}
	//utilization

	public WebElement getUsernametxtbtn() {
		 return usernametxtbtn;
	}

	public WebElement getPasswordnametxtbtn() {
		 return passwordnametxtbtn;
	}

	public WebElement getSubmitbtn() {
		  return submitbtn;
	}
	//Business Library
	public void login( String USERNAME,String PASSWORD)
	{
	
		usernametxtbtn.sendKeys(USERNAME);
		passwordnametxtbtn.sendKeys(PASSWORD);
		submitbtn.click();
		
		
		
		
	}
	
	
		

}
