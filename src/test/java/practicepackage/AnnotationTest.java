package practicepackage;

import java.util.Objects;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AnnotationTest {
	
	@Test(dataProvider = "data")
	public void getData(String src,String dst)
	{
		System.out.println("from"+src+"to"+dst);
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] obj = new Object[2][2];
		
		
		obj[0][0]     ="Qspider";
		obj[0][1]     ="Testyanthra";
		
		obj[1][0]     ="Testyanthra";
		obj[1][1]     ="Sony";
		return obj;
		
		
		
		
		
	}

}
