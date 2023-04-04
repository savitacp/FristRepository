package practicepackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	 public SoftAssert sa = new  SoftAssert();
	
	
	@Test
	public void softassert01()
	{
		System.out.println("-----TestScript01-----");
		System.out.println("-----TestScript02-----");
		sa.assertEquals("Testyantra","qsiders");
		System.out.println("-----TestScript03-----");
		
		
	}
	

		
	
    @Test
	public void softassert02()
	{
		System.out.println("-----TestScript03-----");
		System.out.println("-----TestScript04-----");
		System.out.println("-----TestScript05-----");
		
		
	}


}
