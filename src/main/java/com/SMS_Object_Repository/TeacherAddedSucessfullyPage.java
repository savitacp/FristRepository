package com.SMS_Object_Repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeacherAddedSucessfullyPage {
	
	@FindBy(xpath="//span[.='Teacher']")
	private WebElement clickonteacherlnk;
	
	
	@FindBy(xpath="//a[.= 'All Teacher']")
	private WebElement AllTeacherlinkbtn;
	
	@FindBy(xpath="//tbody/tr/td[2]")
	private List<WebElement> allteachername;
	
//	@FindBy(xpath="//li[@id='example1_next']")
//	private WebElement clickonnxtbtn;
//	  
	//intialization
	public TeacherAddedSucessfullyPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	
	}
	//utilization
	


	public WebElement getClickonteacherlnk() {
		return clickonteacherlnk;
	}

	public WebElement getAllTeacherlinkbtn() {
		return AllTeacherlinkbtn;
	}

	public List<WebElement> getAllteachername() {
		return allteachername;
	}

	public WebElement getClickonnxtbtn() {
		return getClickonnxtbtn();
	}
	
	//Business library
	public void clickOnTeacher() {
		clickonteacherlnk.click();
		
	}
	public void clickOnAllTeacher() {
		AllTeacherlinkbtn.click();
		
	}
	public void clickOnAllTeacherName() {
		allteachername.add(AllTeacherlinkbtn);
		
	}
	


	
	}



	
	
	


