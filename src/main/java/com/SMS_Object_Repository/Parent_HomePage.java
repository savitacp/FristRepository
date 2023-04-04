package com.SMS_Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Parent_HomePage {
	
	

	@FindBy(xpath="//span[.='Dashboard']")
	private WebElement Dashboardlinkbtn;
	
	@FindBy(xpath="//span[.='Profile']")
	private WebElement Profilelinkbtn;
	
	@FindBy(xpath="//span[.='Teacher']")
	private WebElement Teacherlinkbtn;
	
	
	@FindBy(xpath=" /html/body/div/aside/section/ul/li[4]/ul/li[2]/a")
	private WebElement AllTeacherlinkbtn;
	

	@FindBy(xpath="//span[.='Subject']")
	private WebElement Subjectlinkbtn1;
	

	@FindBy(xpath="//span[.='Timetable']")
	private WebElement Timetablelinkbtn;
	
	@FindBy(xpath="//span[.='Attendance']")
	private WebElement Attendancelinkbtn;
	
	@FindBy(xpath="/html/body/div/aside/section/ul/li[8]/a/span")
	private WebElement Mysonpaymentlinkbtn;
	

	@FindBy(xpath="//span[.='Exam']")
	private WebElement Examlinkbtn;
	
	@FindBy(xpath="//span[.='Mr.']")
	private WebElement Parenticonelinkbtn1;
	

	@FindBy(xpath="//a[.='Sign out']")
	private WebElement ParentSignoutbtn;
	

	//intialization
	 public  Parent_HomePage(WebDriver driver)
	 
	 {
		PageFactory.initElements(driver, this); 
		
	 }
	 
	
	 // utilization
	 
	public WebElement getDashboardlinkbtn() {
		return Dashboardlinkbtn;
	}


	public WebElement getProfilelinkbtn() {
		return Profilelinkbtn;
	}


	public WebElement getTeacherlinkbtn() {
		return Teacherlinkbtn;
	}
	
	public void getAllTeacherlinkbtn() {
		  AllTeacherlinkbtn.click();
	}


	public WebElement getSubjectlinkbtn1() {
		return Subjectlinkbtn1;
	}


	public WebElement getTimetablelinkbtn() {
		return Timetablelinkbtn;
	}


	public WebElement getAttendancelinkbtn() {
		return Attendancelinkbtn;
	}


	public WebElement getMysonpaymentlinkbtn() {
		return Mysonpaymentlinkbtn;
	}


	public WebElement getExamlinkbtn() {
		return Examlinkbtn;
	}


	public WebElement getParenticonelinkbtn1() {
		return Parenticonelinkbtn1;
	}


	public WebElement getParentSignoutbtn() {
		return ParentSignoutbtn;
	}
	 
	//Business scenario
public void clickonDashboard() {
		
	Dashboardlinkbtn.click();
		
	}
	
	public void clickOnProfile() {
		
		Profilelinkbtn.click();
	}
	
  public void clickOnTeacher() throws Throwable {
		
	  Teacherlinkbtn.click();
	  Thread.sleep(2000);
	}
//  public void clickOnAllTeacher() {
//		
//	  AllTeacherlinkbtn.click();
//	}
  
public void clickOnSubject() {
		
	Subjectlinkbtn1.click();
	}
  
public void clickOnTimetable() {
	Timetablelinkbtn.click();
	
}
public void clickOnAttendance() {
     Attendancelinkbtn.click();
	
}
	
	public void clickOnSonPayment() {
		
		Mysonpaymentlinkbtn.click();
	}
		
public void clickOnExam() {
			
	Examlinkbtn.click();
			
}
public void clickonParentIcon() throws Throwable {
	Thread.sleep(5000);
	Parenticonelinkbtn1.click();
}
 public void clickonSignOut() {
	 ParentSignoutbtn.click();
 }
 
	 
 }

	
	
	
	
	
	
	
	
	
	

