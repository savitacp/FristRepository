package com.SMS_Object_Repository;

import java.util.HashMap;

import org.apache.commons.collections4.MultiSet.Entry;
import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SMS_GenericUtility.Excel_Utility;
import com.SMS_GenericUtility.JavaUtility;
import com.SMS_GenericUtility.WebDriverUtility;


public class Admin_AddNewTeacher {
	
	
		//declaration
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
		
		@FindBy(xpath ="//option[text()='Female']")
		private WebElement femalebtn;
		

		
		//intialization
		 public Admin_AddNewTeacher(WebDriver driver)
		 
		 {
			PageFactory.initElements(driver, this); 
			
		 }
		 
		// utilization
		 

		public void getIndexnotxtbtn(String indexno) {
			indexnotxtbtn.sendKeys(indexno);
		}


		public void getFullnametxtkbtn(String fullname) {
			fullnametxtkbtn.sendKeys(fullname);
		}


		public void getInametxtbtn(String namewithinital) {
			 inametxtbtn.sendKeys(namewithinital);
		}


		public void getAddresstxtbtn(String address) {
			 addresstxtbtn.sendKeys(address);
		}


		public void getGenderbtn() {
			genderbtn.click();
			femalebtn.click();
		 
		}


		public void getPhonetxtbtn(String phone) {
			 phonetxtbtn.sendKeys(phone);
		}


		public void  getEmailtxtbtn(String email) {
			 emailtxtbtn.sendKeys(email);
		}


		public void getPhotofield(String pathofpic) {
			 photofield.sendKeys(pathofpic);
		}


		public void getSubmitnbtn() {
			 submitnbtn.click();
		}
				

}
