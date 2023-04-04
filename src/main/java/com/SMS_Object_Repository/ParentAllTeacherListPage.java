package com.SMS_Object_Repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParentAllTeacherListPage {
	
//declartion
	@FindBy(xpath="//tbody/tr/td[2]")
	private List<WebElement> allteachername;
	
	@FindBy(xpath="//a[text()=\"Next\"]")
	private WebElement nextbtn;
	
	

//intialization

public ParentAllTeacherListPage(WebDriver driver)
{
	PageFactory.initElements( driver,this);
}


//utilization
public List<WebElement> getAllteachername() {
	return allteachername;
}



public void  getNextbtn() throws InterruptedException {
	Thread.sleep(2000);;
	 nextbtn.click();
}



	
}

//Business Library




	





