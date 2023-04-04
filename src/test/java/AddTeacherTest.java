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
import com.SMS_Object_Repository.Admin_HomePage;
import com.SMS_Object_Repository.Admin_TeacherPage;
import com.SMS_Object_Repository.LoginPage;
import com.SMS_Object_Repository.ParentAllTeacherListPage;
import com.SMS_Object_Repository.Parent_HomePage;
import com.SMS_Object_Repository.Parent_LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.SMS_GenericUtility.ListenerImplementation.class)
public class AddTeacherTest extends BaseClass{

	@Test
	public  void addTeacher() throws Throwable {
		

    		FileUtility fLib = new FileUtility();
    		Excel_Utility eLib = new Excel_Utility();
    		JavaUtility jLib = new JavaUtility();
    		WebDriverUtility wLib = new WebDriverUtility();
    		DatabaseUtility dLib = new DatabaseUtility();
    		
    		
    		String URL = fLib.readDataFromPropertyFile("urlofsms");
    		String USERNAME = fLib.readDataFromPropertyFile("username");
    		String PASSWORD = fLib.readDataFromPropertyFile("password");
    		String value = eLib.fetch_Data_from_ExcelSheet("AddTeacher", 1, 1);
    		String URLP = fLib.readDataFromPropertyFile("urltosmsp");
    		String USERNAMEP = fLib.readDataFromPropertyFile("usernamep");
    		String PASSWORDP = fLib.readDataFromPropertyFile("passwordp");
    		
    		WebDriverManager.chromedriver().create();
    		WebDriver driver = new ChromeDriver();
    		
    		wLib.maximizeWindow(driver);
    		driver.get(URL);
    		wLib.implictlyWait(driver, 20);
    		
    		
    		//login
    		LoginPage lp = new LoginPage(driver);
    		lp.login(USERNAME, PASSWORD);
    		
    		//click on teacher and click on add teacher
    		
    	     Admin_HomePage ap = new Admin_HomePage(driver);
    		
    		ap.clickOnTeacher();
    		
    		ap.clickOnAddTeacher();
    		
    		//Logout from parent
    		
    		
    		
    		
    		//fill all the details of the new teacher
    		Admin_TeacherPage atp = new Admin_TeacherPage(driver);
    		atp.addteacher(eLib, driver, jLib);
    		
    		
    		
 
            //signout as a admin
    		
    		ap.clickOnAdminImage();
    		ap.ClickOnSignOut();
    		//ap.clickOnSignOut();
    		
    		//url

    		wLib.maximizeWindow(driver);
    		driver.get(URLP);
    		wLib.implictlyWait(driver, 20);
    		
    		//login as a parent
    		
    		Parent_LoginPage pp = new Parent_LoginPage(driver);
    		pp.loginp( USERNAMEP,PASSWORDP);
    		
    		//homepage of parents
    		ParentAllTeacherListPage palp = new ParentAllTeacherListPage(driver);
    		
    		Parent_HomePage ph = new Parent_HomePage(driver);
    		//ph.clickonDashboard();
    		//ph.clickOnAttendance();
    		//ph.clickOnProfile();
    		//ph.clickOnSonPayment();
    		ph.clickOnTeacher();
    		ph.getAllTeacherlinkbtn();
    		
    	
    		
    		String actualteachername = "Srivali mam";
    		//Verification
			boolean flag = false;
			while(true) 
			{
				List<WebElement> teachername = palp.getAllteachername();
				for(WebElement teachernameonebyone : teachername)
				{
					String tchname = teachernameonebyone.getText();
					System.out.println(tchname);
					
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
    		
    		//view the  AddedTeacher
    		//ParentAllTeacherListPage pl = new ParentAllTeacherListPage(driver);
    		//pl.clickOnAllTeacher();
    		//pl.clickOnNextbtn();
    		//TeacherAddedSucessfullyPage tp = new TeacherAddedSucessfullyPage(driver);
    		//tp.clickOnTeacher();
    		//tp.clickOnAllTeacher();
    		
    		
    	}
		
	}



