package admin_addNewTeacher;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SMS_GenericUtility.BaseClass;
import com.SMS_GenericUtility.DatabaseUtility;
import com.SMS_GenericUtility.Excel_Utility;
import com.SMS_GenericUtility.FileUtility;
import com.SMS_GenericUtility.JavaUtility;
import com.SMS_GenericUtility.WebDriverUtility;
import com.SMS_Object_Repository.Admin_AddNewTeacher;
import com.SMS_Object_Repository.Admin_HomePage;

import com.SMS_Object_Repository.LoginPage;
import com.SMS_Object_Repository.ParentAllTeacherListPage;
import com.SMS_Object_Repository.Parent_HomePage;
import com.SMS_Object_Repository.Parent_LoginPage;
import com.SMS_Object_Repository.Parent_LogoutPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Admin_AddTeacher {
	
@Listeners(com.SMS_GenericUtility.ListenerImplementation.class)
	

		@Test
		public  void addTeacher() throws Throwable {
			

	    		FileUtility fLib = new FileUtility();
	    		Excel_Utility eLib = new Excel_Utility();
	    		JavaUtility jLib = new JavaUtility();
	    		WebDriverUtility wLib = new WebDriverUtility();
	    		DatabaseUtility dLib = new DatabaseUtility();
	    		
	    		//launch the browser
	    		WebDriverManager.chromedriver().create();
	    		WebDriver driver = new ChromeDriver();
	    		
	    		wLib.maximizeWindow(driver);
	    		driver.get(fLib.readDataFromPropertyFile("urlofsms"));
	    		wLib.implictlyWait(driver, 20);
	    		
	    		
	    		
	    		LoginPage lp = new LoginPage(driver);
	    		Admin_HomePage ap = new Admin_HomePage(driver);
	    		Admin_AddNewTeacher atp = new Admin_AddNewTeacher(driver);
	    		Parent_LogoutPage pl = new Parent_LogoutPage(driver);
	    		Parent_LoginPage pp = new Parent_LoginPage(driver);
	    		Parent_HomePage ph = new Parent_HomePage(driver);
	    		ParentAllTeacherListPage palp = new ParentAllTeacherListPage(driver);
	    		
	    		//login
	    		lp.login(fLib.readDataFromPropertyFile("username"), fLib.readDataFromPropertyFile("password"));
	    		
	    		//click on teacher and click on add teacher
	    		ap.clickOnTeacher();
	    		ap.clickOnAddTeacher();
	    		
	    		//fill all the details of the new teacher
	    		
	    		atp.getIndexnotxtbtn(eLib.fetch_Data_from_ExcelSheet("AddTeacher", 0, 1));
	    		atp.getFullnametxtkbtn(eLib.fetch_Data_from_ExcelSheet("AddTeacher", 1, 1)+jLib.random());
	    		String actualteachername = eLib.fetch_Data_from_ExcelSheet("AddTeacher", 2, 1)+jLib.random();
	    		atp.getInametxtbtn(actualteachername);
	    		atp.getAddresstxtbtn(eLib.fetch_Data_from_ExcelSheet("AddTeacher", 3, 1)+jLib.random());
	    		atp.getPhonetxtbtn(eLib.fetch_Data_from_ExcelSheet("AddTeacher", 5, 1));
	    		atp.getEmailtxtbtn(eLib.fetch_Data_from_ExcelSheet("AddTeacher", 6, 1)+jLib.random()+eLib.fetch_Data_from_ExcelSheet("AddTeacher", 8, 1));
	    		atp.getGenderbtn();
	    		atp.getPhotofield(eLib.fetch_Data_from_ExcelSheet("AddTeacher", 7, 1));
	    		atp.getSubmitnbtn();
	    		
	    		
	 
	          
	    		//signout as a admin
	    		ap.clickOnAdminImage();
	    		ap.ClickOnSignOut();
	    		
	    		
	    		//login as parents
	    		driver.get(fLib.readDataFromPropertyFile("urlofsms"));
	    		//login as a parent
	    		Thread.sleep(2000);
	    		pp.loginp(fLib.readDataFromPropertyFile("usernamep"), fLib.readDataFromPropertyFile("passwordp"));
	    		ph.clickOnTeacher();
	    		ph.getAllTeacherlinkbtn();
	    		
	    	
	    		
	    		
	    		//Verification
				boolean flag = false;
				while(true) 
				{
					List<WebElement> teachername = palp.getAllteachername();
					for(WebElement teachernameonebyone : teachername)
					{
						String tchname = teachernameonebyone.getText();
						//System.out.println(tchname);
						
						if(tchname.equals(actualteachername))
						{
							System.out.println("new teacher are added into the all teacher list page successfully");
							flag = true;
							break;
						}
					
					}
					if(flag)
						break;
					else
						palp.getNextbtn();
					
				}
	    		
	    		//signout as a Parent
				pl.clickOnParentImage();
	    		
	    		pl.ClickOnSignOut();
	    		
	    		driver.quit();
	    	}
			
		}






