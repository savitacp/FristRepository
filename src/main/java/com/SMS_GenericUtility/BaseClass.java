package com.SMS_GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.SMS_Object_Repository.Admin_HomePage;
import com.SMS_Object_Repository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public DatabaseUtility dLib = new DatabaseUtility();
	public FileUtility fLib = new FileUtility();
	public Excel_Utility eLib = new Excel_Utility();
	public WebDriverUtility wLib = new WebDriverUtility();
    public WebDriver driver;
    public static WebDriver sdriver;
    
    
    @BeforeSuite
    public void configsBS() throws Throwable
    {
    	dLib.connectToDb();
    	System.out.println("---connect to Db----");
    	
    }
    
    @BeforeClass
    public void configBC() throws Throwable
    {
    	String BROWSER = fLib.readDataFromPropertyFile("browser");
    	String URL = fLib.readDataFromPropertyFile("urlofsms");
    	if(BROWSER.equalsIgnoreCase("chrome"))
    	{
    		WebDriverManager.chromedriver().setup();
    		driver = new ChromeDriver();
    		}
    	else if(BROWSER.equalsIgnoreCase("firefox"))
    	{
    		WebDriverManager.firefoxdriver().setup();
    		driver = new FirefoxDriver();
    	}
    	else
    	{
    		System.out.println("Invalid browser");
    		
    	}
    	sdriver = driver;
    	 wLib.maximizeWindow(driver);
    	 driver.get(URL);
    	 wLib.waitForPageLoad(driver);
   }
    
    
    
    
       @BeforeMethod
      public void configBM() throws Throwable   {
      String USERNAME = fLib.readDataFromPropertyFile("username");
      String PASSWORD = fLib.readDataFromPropertyFile("password");
      LoginPage lp = new  LoginPage(driver);
       lp.login(USERNAME, PASSWORD);
      }
      @AfterMethod
      public void configAM() throws Throwable
    {
   	   Admin_HomePage ap = new Admin_HomePage(driver);
     	ap.ClickOnSignOut();
   	
   }
    @AfterClass
    public void configAC()
    {
    	driver.quit();
    }
    @AfterSuite
    public void configAS() throws Throwable
    {
    	dLib.closeDB();
    
    }
}
