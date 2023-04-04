package com.SMS_Object_Repository;

import java.util.HashMap;

import org.apache.commons.collections4.MultiSet.Entry;
import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SMS_GenericUtility.Excel_Utility;
import com.SMS_GenericUtility.JavaUtility;

public class Admin_TeacherPage {
	
	@FindBy(id ="index_number") 
	private WebElement indexnotxtbtn;
	
	@FindBy(id="full_name")
	private WebElement fullnametxtkbtn;
	
	@FindBy(id="i_name")
	private WebElement inametxtbtn;

	@FindBy(id="address")
	private WebElement addresstxtbtn;
	
	@FindBy(id="gender")
	private WebElement genderbtn;
	
	@FindBy(id="phone")
	private WebElement phonetxtbtn;
	
	@FindBy(id="email")
	private WebElement emailtxtbtn;
	
	@FindBy(id="fileToUpload")
	private WebElement photofield;
	
	@FindBy(id="btnSubmit")
	private WebElement submitnbtn;

	
	//intialization
	 public Admin_TeacherPage(WebDriver driver)
	 
	 {
		PageFactory.initElements(driver, this); 
		
	 }
	 
	// utilization
	 

	public WebElement getIndexnotxtbtn() {
		return indexnotxtbtn;
	}


	public WebElement getFullnametxtkbtn() {
		return fullnametxtkbtn;
	}


	public WebElement getInametxtbtn() {
		return inametxtbtn;
	}


	public WebElement getAddresstxtbtn() {
		return addresstxtbtn;
	}


	public WebElement getGenderbtn() {
		return genderbtn;
	}


	public WebElement getPhonetxtbtn() {
		return phonetxtbtn;
	}


	public WebElement getEmailtxtbtn() {
		return emailtxtbtn;
	}


	public WebElement getPhotofield() {
		return photofield;
	}


	public WebElement getSubmitnbtn() {
		return submitnbtn;
	}
		
	
	//Business Library
	
	public void addteacher(Excel_Utility eLib,WebDriver driver,JavaUtility jLib) throws Throwable
	{
	    HashMap<String, String> map = eLib.readMultipleData("AddTeacher");
	    for(java.util.Map.Entry<String, String> set:map.entrySet())
	    {
	    	if(set.getKey().equalsIgnoreCase("index_number"))
	    	{
	    		
	    		driver.findElement((By.name(set.getKey()))).sendKeys(set.getValue()+jLib.random());
	    	}
	    	else
	    	{
	    		driver.findElement((By.name(set.getKey()))).sendKeys(set.getValue());
	    	}
	    	  
	    	submitnbtn.click();
	    	
	    		
	    	}
	    
	    
	    	
	
	}
		
}