package com.SMS_Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SMS_GenericUtility.WebDriverUtility;

public class Admin_HomePage {
	
	
	

	@FindBy(xpath="//span[.='My Profile']")
	private WebElement MyProfileLink;
	
	@FindBy(xpath="//span[.='Classroom']")
	private WebElement ClassroomLink;
	
	@FindBy(xpath="//span[.='Grade']")
	private WebElement GradeLink;
	
	@FindBy(xpath="//span[.='Subject']")
	private WebElement SubjectLink;
	
	@FindBy(xpath="//span[.='Teacher']")
	private WebElement TeacherLink;
	
	@FindBy(xpath="//a[.=' Add Teacher']")
	private WebElement AddTeacherLink;
	
	@FindBy(xpath="//a[.=' All Teacher']")
	private WebElement AllTeacherLink;
	
	@FindBy(xpath="//span[.='Admin A']")
	private WebElement Admin;
	
	@FindBy(xpath="//a[.='Sign out']")
	private WebElement SignOutbtn;
	
	


public  Admin_HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}




public WebElement getGrade() {
	return GradeLink;
}




public WebElement getMyProfileLink() {
	return MyProfileLink;
}




public WebElement getClassroomLink() {
	return ClassroomLink;
}




public WebElement getGradeLink() {
	return GradeLink;
}




public WebElement getSubjectLink() {
	return SubjectLink;
}




public WebElement getTeacherLink() {
	return TeacherLink;
}




public WebElement getAddTeacherLink() {
	return AddTeacherLink;
}




public WebElement getAllTeacherLink() {
	return AllTeacherLink;
}




public WebElement getAdmin() {
	return Admin;
}




public WebElement getSignOutbtn() {
	return SignOutbtn;
}
	

//Business Library


	public void clickOnMyProfile() {
		
		MyProfileLink.click();
		
	}
	
	public void clickOnClassroom() {
		
		ClassroomLink.click();
	}
	
  public void clickOnTeacher() throws Throwable {
		Thread.sleep(4000);
  	TeacherLink.click();
	}
  
public void clickOnAddTeacher() throws Throwable {
		Thread.sleep(4000);
  	AddTeacherLink.click();
	}
  
public void clickOnAllTeacher() throws Throwable {
	Thread.sleep(4000);
	AllTeacherLink.click();
}
 

public void clickOnAdminImage() throws Throwable {
	
	Thread.sleep(5000);
	Admin.click();
	
}

public void ClickOnSignOut() throws Throwable{
	Thread.sleep(5000);
	SignOutbtn.click();
	
}



	
}




 
	







