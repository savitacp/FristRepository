package sms_Admin_Add_Exam;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_Exam {

	public static void main(String[] args)
	{

		WebDriverManager.chromedriver().create();
		WebDriver driver = new ChromeDriver();
		
		 Random ran = new Random();
		 int random =ran.nextInt(500);
		 System.out.println(random);
		 
		 driver.manage().window().maximize();
		 driver.get("http://rmgtestingserver/domain/Student_Management_System/view/login.php");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("12345");
		 driver.findElement(By.id("btnSubmit")).click();
		 
		 
		 driver.findElement(By.xpath("//span[text()='Exam']")).click();

		 driver.findElement(By.xpath("//a[text()='Create Exam']")).click();
		 driver.findElement(By.xpath("//a[text()='Add ']")).click();
		 driver.findElement(By.id("name")).sendKeys("Advance Selenium");
		 driver.findElement(By.id("btnSubmit")).click();
		
		
		
		
	}

}
