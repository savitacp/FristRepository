package practicepackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SMS_GenericUtility.Excel_Utility;
import com.SMS_GenericUtility.FileUtility;

public class DataPro {
	
	
	@Test(dataProvider = "readSetOfdata")
	public void getData(String scr,String dst,String loc)
	{
		System.out.println("from-----> "+scr+" to -----> "+ dst+" location--->"+loc);
		
	}
	@DataProvider
	public Object[][] readSetOfdata() throws Throwable
	{
		Excel_Utility eLib = new Excel_Utility();
		Object[][] value = eLib.readMultilpleSetOfData("DP");
		return value;
	}

}
