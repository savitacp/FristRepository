package practicepackage;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class CountElements {

	public static void main(String[] args) {
	
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		String teamName = "Singapore";
		List<Web> teams = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		//List <WebElement> matches = driver.FindElements(By.xpath(teamName));
		
		boolean flag = false;
		for (WebElement name:teams)
		{
			
			String text = name.getText();
			if (text.equals(teamName))
			{
				
				System.out.println("is present");
				flag=true;
				break;
			}
			
		}
		{
				
		System.out.println("not present");	

	}

}
}
