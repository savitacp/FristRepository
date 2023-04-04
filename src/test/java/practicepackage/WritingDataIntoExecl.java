package practicepackage;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataIntoExecl {

	public static void main(String[] args)
	{
	
		FileInputStream fi = new FileInputStream(".C:\\Users\\Savitha\\eclipse-workspace\\com.StudentManagementSystem\\Excel\\Testdata.xlsx")
		
		 Workbook wb = WorkbookFactory.create(fi);
		        
          Sheet sh = wb.getSheet("Sheet1");
           Row row = sh getRow(2);
            
            
            
            
            
            
	}
	
	

}
