package practicepackage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonDataFromProperiesFile {

	public static void main(String[] args) throws Throwable
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Savitha\\eclipse-workspace\\com.StudentManagementSystem\\commonData\\commondata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String BROWSER = pobj.getProperty("browser");
		String URL = pobj.getProperty("url");
		String USERNAME = pobj.getProperty("username");
		String PASSWORD = pobj.getProperty("password");
		
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("email")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);	
		driver.findElement(By.id("btnSubmit")).click();
		
		
		
		
		
		
		
				
			
	}

}
