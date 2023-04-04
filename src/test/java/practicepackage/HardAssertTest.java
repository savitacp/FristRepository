package practicepackage;

import static org.testng.Assert.*;
import org.testng.annotations.Test;


public class HardAssertTest {
	
	@Test
	public void hardassert01()
	{
		System.out.println("----TestScript01----");
		System.out.println("----TestScript02----");
		//Assert.assertEquals("Testyantra", "qspiders");
		assertEquals("Testyantra", "qspiders");
		System.out.println("----TestScript03----");
		System.out.println("----TestScript04----");
		
		
		
	}
	@Test
	public void hardassert02()
	{
		
		System.out.println("----TestScript05----");
		System.out.println("----TestScript06----");
		
		System.out.println("----TestScript07----");
		System.out.println("----TestScript08----");
		
		
	}
	
	@Test
	public void harassert03()
	{
		System.out.println("----TestScript09----");
		System.out.println("----TestScript10----");
		//Assert.assertEquals("Testyantra", "qsiders", "jspiders");
		assertEquals("Testyantra", "qsiders", "jspiders");
		System.out.println("----TestScript11----");
		System.out.println("----TestScript12----");
		
		
	}

}
