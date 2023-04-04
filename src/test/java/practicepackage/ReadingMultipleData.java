package practicepackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Savitha\\eclipse-workspace\\com.StudentManagementSystem\\Excel\\Testdata.xlsx");
		Workbook wb  = WorkbookFactory.create(fis);
	
		Sheet sh = wb.getSheet("Sheet1");
		int count = sh.getLastRowNum();
		
		for(int i=1;i<=count;i++)
		{
			
			String orgn = sh.getRow(i).getCell(0).getStringCellValue();
			String loc = sh.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(orgn+ " " +loc);
			
		}
		
	

	}

}
