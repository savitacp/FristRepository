        package sms_Admin_Parent;
        import java.util.List;
        import java.util.Random;
        import java.util.concurrent.TimeUnit;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

import com.SMS_GenericUtility.DatabaseUtility;
import com.SMS_GenericUtility.Excel_Utility;
import com.SMS_GenericUtility.FileUtility;
import com.SMS_GenericUtility.JavaUtility;
import com.SMS_GenericUtility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

        public class Admin_Parent_Teacher
        {
            
        	public static void main(String [] args) throws Throwable
        	{

        		FileUtility fLib = new FileUtility();
        		Excel_Utility eLib = new Excel_Utility();
        		JavaUtility jLib = new JavaUtility();
        		WebDriverUtility wLib = new WebDriverUtility();
        		DatabaseUtility dLib = new DatabaseUtility();
        		
        		WebDriverManager.chromedriver().create();
        		WebDriver driver = new ChromeDriver();
        		
        		wLib.maximizeWindow(driver);
        		wLib.implictlyWait(driver, 20);
        		
        		//perform login action
        		driver.get(fLib.readDataFromPropertyFile("urlofsms"));
        		driver.findElement(By.id("email")).sendKeys(fLib.readDataFromPropertyFile("username"));
        		driver.findElement(By.id("password")).sendKeys(fLib.readDataFromPropertyFile("password"));
        		driver.findElement(By.id("btnSubmit")).click();
        		
        		//click on Teacher and add teacher sub link
        		driver.findElement(By.xpath("//span[text() = 'Teacher']")).click();
        		driver.findElement(By.xpath("//a[text() =' Add Teacher']")).click();
        		
        	
        	    //fill all the credential
        		driver.findElement(By.id("index_number")).sendKeys(eLib.fetch_Data_from_ExcelSheet("AddTeacher", 0, 1)+jLib.random());
        		driver.findElement(By.id("full_name")).sendKeys(eLib.fetch_Data_from_ExcelSheet("AddTeacher", 1, 1)+jLib.random());
        		WebElement newteachername = driver.findElement(By.id("i_name"));
        		newteachername.sendKeys(eLib.fetch_Data_from_ExcelSheet("AddTeacher", 2, 1)+jLib.random());
        		String actualtechername = newteachername.getText();
        		System.out.println(actualtechername);
        		driver.findElement(By.id("address")).sendKeys(eLib.fetch_Data_from_ExcelSheet("AddTeacher", 3, 1)+jLib.random());
        		driver.findElement(By.id("gender")).click();
        		driver.findElement(By.xpath("//option[text() = 'Male']")).click();
        		driver.findElement(By.id("phone")).sendKeys(eLib.fetch_Data_from_ExcelSheet("AddTeacher", 5, 1));
        		driver.findElement(By.id("email")).sendKeys(jLib.random()+eLib.fetch_Data_from_ExcelSheet("AddTeacher", 6, 1));
        		driver.findElement(By.id("fileToUpload")).sendKeys(eLib.fetch_Data_from_ExcelSheet("AddTeacher", 7, 1));
        		driver.findElement(By.id("btnSubmit")).click();
        		
        		//validation 
        		String expectedresult = "Success!";
        		WebElement actresult = driver.findElement(By.xpath("//div[@id=\"insert_Success\"]/div/div/div[2]/strong"));
        		String actualresult = actresult.getText();
        		if(expectedresult.contains(actualresult))
        		{
        			System.out.println("Admin added a new teacher sucessfully");
        		}
        		else
        		{
        			System.out.println("Teacher is not added");	
        		}
        	
        		
        		
        		
        		
        		//logout from application
        		WebDriverWait wait = new WebDriverWait(driver,10);
        		WebElement ele = driver.findElement(By.xpath("//span[text() ='Admin A']"));
        		wait.until(ExpectedConditions.invisibilityOf(actresult));//till the dialague box will be visible till it will not perform click operarion
        		ele.click();
        		
        		WebElement ele2 = driver.findElement(By.xpath("//a[text() ='Sign out']"));
        		wait.until(ExpectedConditions.elementToBeClickable(ele2));
        		ele2.click();
        		
        		
        		//close the application
        		//driver.quit();
        		
        		
        		//login as parent
        		driver.get(fLib.readDataFromPropertyFile("urltosmsp"));
        		driver.findElement(By.id("email")).sendKeys(fLib.readDataFromPropertyFile("usernamep"));
        		driver.findElement(By.id("password")).sendKeys(fLib.readDataFromPropertyFile("passwordp"));
        		driver.findElement(By.id("btnSubmit")).click();
        		
        		//click on teacher link
        		driver.findElement(By.xpath("//span[text() ='Teacher']")).click();
        		driver.findElement(By.xpath("//a[text() =' All Teacher']")).click();
        		
        		boolean flag = false;
        		
        		
        		   while(true)
        		   {
        		
        			List<WebElement> teachername = driver.findElements(By.xpath("//tbody/tr/td[2]"));
        			for(WebElement teachernameonebyone : teachername)
        			{
        				String tchname = teachernameonebyone.getText();
        				System.out.println(tchname);
        				
        				if(tchname.equals(actualtechername))
        				{
        					System.out.println("new teacher are added into the all teacher list page successfully");
        					flag = true;
        					break;
        				}
        			}
        			if(flag)
        				break;	
        					
        				else
        				{
        				driver.findElement(By.xpath("//li[@id=\"example1_next\"]/a")).click();
        				
        				}
        		   }
        		   
        		
        	}
        }
        

       
        	
		