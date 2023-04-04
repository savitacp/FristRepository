package sms_Admin_Add_Student;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_New_Student {

	public static void main(String[] args) throws Throwable
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
		 
		 
		 driver.findElement(By.xpath("//span[text()='Student']")).click();
		 driver.findElement(By.xpath("//a[text()=' Add Student']")).click();
		 
		 driver.findElement(By.id("index_number")).sendKeys("45");
		 driver.findElement(By.id("full_name")).sendKeys("priya");
		 driver.findElement(By.id("i_name")).sendKeys("Mrs");
		 driver.findElement(By.id("address")).sendKeys("Tamilnadu");
		 driver.findElement(By.id("email")).sendKeys("priyaarun45@gmail.com");
		 driver.findElement(By.id("phone")).sendKeys("959-162-7669");
		 driver.findElement(By.id("b_date")).sendKeys("23/2/1995");
		 WebElement dropdown = driver.findElement(By.id("gender"));
		 dropdown.click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//option[text()='Female']")).click();
		 dropdown.sendKeys(Keys.ESCAPE);
		 Thread.sleep(2000);
		 driver.findElement(By.id("fileToUpload")).sendKeys("D:\\Madhu\\doctor.jpg");
		// Thread.sleep(2000);
		// driver.findElement(By.id("btnSubmit")).click();
		 
		 
		 
		// driver.findElement(By.xpath("//label[text()='Index Number']")).sendKeys("G-45");
		 driver.findElement(By.id("g_full_name")).sendKeys("Mukesh");
		 driver.findElement(By.id("g_i_name"  )).sendKeys("Mr");
		 driver.findElement(By.id("g_address")).sendKeys("Mysore");
		 driver.findElement(By.id("g_email" )).sendKeys("madhu.jp@gmail.com");
		 driver.findElement(By.id("g_phone" )).sendKeys("872-212-2770");
		 driver.findElement(By.id("g_b_date")).sendKeys("5-3-1987");
		 WebElement dropdown1 = driver.findElement(By.id("g_gender"));
		 dropdown1.click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"g_gender\"]/option[2]")).click();
		 driver.findElement(By.id("g_fileToUpload")).sendKeys("D:\\Madhu\\doctor.jpg");
		 driver.findElement(By.xpath("//button[text()='Next']")).click();
		 
		 
		
		 
	     

	}

}
