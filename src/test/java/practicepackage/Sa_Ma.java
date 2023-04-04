package practicepackage;

public class Sa_Ma {

	public static void main(String[] args) {
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

        import io.github.bonigarcia.wdm.WebDriverManager;

        public class Admin_Parent_Teacher {
        	
        	public static void main(String [] args) throws Throwable
        	{
        		
        		
        		
        		WebDriverManager.chromedriver().create();
        		WebDriver driver = new ChromeDriver();
        		driver.manage().window().maximize();
        		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        		
        		//perform login action
        		driver.get("http://rmgtestingserver/domain/Student_Management_System/view/login.php");
        		driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
        		driver.findElement(By.id("password")).sendKeys("12345");
        		driver.findElement(By.id("btnSubmit")).click();
        		
        		//click on Teacher and add teacher sub link
        		driver.findElement(By.xpath("//span[text() = 'Teacher']")).click();
        		driver.findElement(By.xpath("//a[text() =' Add Teacher']")).click();
        		
        		//fill all the credential
        		Random rand = new Random();
        		int randomnum = rand.nextInt(62345);
        		driver.findElement(By.id("index_number")).sendKeys("G"+randomnum);
        		driver.findElement(By.id("full_name")).sendKeys("Mukesh kumar"+randomnum);
        		WebElement newteachername = driver.findElement(By.id("i_name"));
        		newteachername.sendKeys("Mr."+"Mukesh kumar"+randomnum);
        		String actualtechername = newteachername.getText();
        		System.out.println(actualtechername);
        		driver.findElement(By.id("address")).sendKeys("benglore karnataka"+randomnum);
        		driver.findElement(By.id("gender")).click();
        		driver.findElement(By.xpath("//option[text() = 'Male']")).click();
        		driver.findElement(By.id("phone")).sendKeys("111-111-1111");
        		driver.findElement(By.id("email")).sendKeys("avcd"+randomnum+"@gmail.com");
        		driver.findElement(By.id("fileToUpload")).sendKeys("D:\\Madhu\\doctor.jpg");
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
        		driver.get("http://rmgtestingserver/domain/Student_Management_System/view/login.php");
        		driver.findElement(By.id("email")).sendKeys("dad3@gmail.com");
        		driver.findElement(By.id("password")).sendKeys("12345");
        		driver.findElement(By.id("btnSubmit")).click();
        		
        		//click on teacher link
        		driver.findElement(By.xpath("//span[text() ='Teacher']")).click();
        		driver.findElement(By.xpath("//a[text() =' All Teacher']")).click();
        		
        		
        			List<WebElement> teachername = driver.findElements(By.xpath("//tbody/tr/td[2]"));
        			for(WebElement teachernameonebyone : teachername)
        			{
        				String tchname = teachernameonebyone.getText();
        				
        				if(actualtechername.equals(tchname))
        				{
        					System.out.println("new teacher are added into the all teacher list page successfully");
        					
        					
        				}
        				else
        				{
        				driver.findElement(By.xpath("//li[@id=\"example1_next\"]/a")).click();
        				
        				}
        		}
        		
        		
        		}
        		
        		
        	}

       
		
		

}
