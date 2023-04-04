package com.SMS_GenericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	
	

	/**
	 * thid method is used for the fetching the data form the excel sheet
	 * @param Sheetname
	 * @param RowNo
	 * @param ColumnNo
	 * @return
	 * @throws Throwable
	 */

	public String fetch_Data_from_ExcelSheet(String Sheetname, int RowNo, int ColumnNo) throws Throwable
	{
		
		  FileInputStream fis = new FileInputStream(IPConstants.Excelpath);
		   Workbook wb = WorkbookFactory.create(fis);
		   Sheet sh = wb.getSheet(Sheetname);
		   String value =  sh.getRow(RowNo).getCell(ColumnNo).getStringCellValue();
		   return value;
		   
	}
	
	
	
	public int getLastRowNo(String SheetName)throws Throwable
	{
		
		FileInputStream fi = new FileInputStream(IPConstants.Excelpath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(SheetName);
		int count = sh.getLastRowNum();
		return count;
		
	}
	public void writeDataIntoExcel(String SheetName,int RowNo,int ColumnNo,String data)throws Throwable
	{
		
		    FileInputStream fi = new FileInputStream(IPConstants.Excelpath);
		       Workbook wb = WorkbookFactory.create(fi);
		       Sheet sh = wb.getSheet(SheetName);
		       sh.getRow(RowNo).createCell(ColumnNo).setCellValue(data);
		       FileOutputStream fout = new FileOutputStream(IPConstants.Excelpath);
		       wb.write(fout);
		       
	}
	
	public HashMap<String,String> readMultipleData(String SheetName)throws Throwable
	{
		FileInputStream fi = new FileInputStream(IPConstants.Excelpath);
		
		   Workbook  wb = WorkbookFactory.create(fi);
		   Sheet sh = wb.getSheet(SheetName);
		   int count = sh.getLastRowNum();
		   HashMap<String,String> map = new HashMap<String,String>();
		   for(int i=0;i<=count;i++)
		   {
			   String key = sh.getRow(i).getCell(0).getStringCellValue();
			   String value = sh.getRow(i).getCell(1).getStringCellValue();
			   map.put(key, value);
		   }
		   return map;
			   
			   
		   }

	public Object[][] readMultilpleSetOfData(String Sheetname) throws Throwable 
	{
		FileInputStream fi = new FileInputStream(IPConstants.Excelpath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(Sheetname);
	    int lastRow = sh.getLastRowNum()+1;
	    int lastCell = sh.getRow(0).getLastCellNum();
	    
	    
	    Object[][] obj = new Object[lastRow][lastCell];
	    for(int i=0;i<lastRow;i++)
	    {
	    	for(int j=0;j<lastCell;j++)
	    	{
	    		obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
	    	}
	    }
		
		return obj;
	}
	
	}


	
	



