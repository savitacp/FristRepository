package practicepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MMT {

	public static void main(String[] args) {
		
		 ChromeOptions option = new ChromeOptions();
		 option.addArguments("--disabled-notification");
		 WebDriver driver = ((Object) new ChromeDriver()).setup();
		 WebDriver driver = new ChromeDriver(option);
		 
		 
		 driver.manage().window().maximize();
		 driver.get("");
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.findElement(By.xpath()).click();
		 
		 driver.findElement(By.xpath()).click();
		 
		 WebElement from = driver.findElement(By.xpath());
		 from.sendKeys("Bangalore");
		 
		 driver.findElement(By.xpth());
		 WebElement to = driver.findElement(By.xpath());
		 to.sendKeys("Mangalore");
		           
		 driver.findElement(By.xpath()).click();
	}
}

		 
		
		
		
		
		
		
		

	}

}
