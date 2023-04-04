package practicepackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderOfAnnotationExecution {
	
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("-------connect to database-------");
		
	}
	
	//@BeforeTest
	//public void beforetest()
	//{
		
	//	System.out.println("------launch the browser---------");
		
	//}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("------launch the browser--------");
		
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("--------login to application------");
	}
	
	@Test
	public void addTeacher()
	{
		System.out.println("-------script of add teacher-------");
		
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("----------logout from the application----");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("-----browser close---");
		
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("----close the database---");
	}
	

	
	

}
