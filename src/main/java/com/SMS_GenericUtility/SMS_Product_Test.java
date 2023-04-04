package com.SMS_GenericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SMS_Product_Test {

	public static void main(String[] args)
	{
		FileUtility fLib = new FileUtility();
		Excel_Utility eLib = new Excel_Utility();
		JavaUtility jLib = new JavaUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		wLib.maximizeWindow(driver);
		jLib.random();
		
		
		driver.get("http://rmgtestingserver/domain/Student_Management_System/view/login.php");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("12345");
		 driver.findElement(By.id("btnSubmit")).click();
		 
	}

}
