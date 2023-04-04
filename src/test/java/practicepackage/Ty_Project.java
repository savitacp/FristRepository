package practicepackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Ty_Project {
	
	

	public static void main(String[] args) throws Throwable 
	{
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://rmgtestingserver:8084/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		driver.findElement(By.xpath("//a[text()='Projects']")).click();
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		WebElement actpojname = driver.findElement(By.xpath("//input[@name=\"projectName\"]"));
		actpojname.sendKeys("studemtManagementSystem105");
		String expojname =actpojname.getText();
		driver.findElement(By.xpath("//input[@name=\"createdBy\"]")).sendKeys("Mr.Mukesh");
		driver.findElement(By.xpath("//label[text()='Project Status ']")).click();
		driver.findElement(By.xpath("//option[text()='Created']")).click();
		
		//Select sc = new Select(dropdown);
		//sc.selectByVisibleText("created");
		
		driver.findElement(By.xpath("//input[@value=\"Add Project\"]")).click();
		
		
		
		Driver driver1 = new Driver();
		DriverManager.registerDriver(driver1);
		Connection conn = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
		Statement stat =  conn.createStatement();
		String query = "select* from project;";
		ResultSet result = stat.executeQuery(query);
		
		boolean flag = false;
		while(result.next())
		{
			String actproj = result.getString(4);
			System.out.println(actproj);
			
			
			if(actproj.equalsIgnoreCase(expojname))
			{
				flag=true;
				break;
			}
			if(flag)
			{
				System.out.println("Project is created");
			}
			else
			{
				System.out.println("project not created");
				
				
				
				
			}
			}
		}
		
		
		
}


