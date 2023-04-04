package com.SMS_GenericUtility;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility {
	
	Connection con = null;
	private String expData;
	
	public void connectToDb() throws Throwable
	{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection(IPConstants.DBURL,IPConstants.DBUSERNAME,IPConstants.DBPASSWORD);
	}
	
	public String executeQueryAndGetData(String query,String exData,int columnIndex)throws Throwable
	{
		ResultSet result = con.createStatement().executeQuery(query);
		boolean flag = false;
		while(result.next())
		{
			String data = result.getString(columnIndex);
			
			if(data.equalsIgnoreCase(expData))
			{
				
				flag = true;
				break;
				
			}


		}
	      if(flag)
	      {
	    	  System.out.println("data is verified");
	    	  return expData;
	    	  
	      }
	
	      else
	      {
	    	  System.out.println("Database is not updated");
	    	  return "";
	    	  
	      }
	      }
	public void closeDB() throws Throwable
	{
		con.close();
	}
	

}
