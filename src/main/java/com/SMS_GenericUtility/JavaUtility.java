package com.SMS_GenericUtility;

import java.sql.Date;
import java.util.Random;

public class JavaUtility {
	
	public int random()
	{
		Random ran = new Random();
		int random = ran.nextInt(1000);
		return random;
		
	}
  
	public String getSystemDate()
	{
		Date dt = new Date(0);
		String date = dt.toString();
		return date;
	}
	
}
