package practicepackage;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class DatabaseTest1 {

	public static void main(String[] args)
	
	{
	
	Connection con =null;
	int result = 0;
     {
	    
		Driver driver = new Driver();
		 DriverManager.registerDriver(driver);
        Connection con= Driver.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
        Statement state= createStatement();
        String query = "insert into emp1 values";
        Resultset result = updateQuery(query);
		        
		
		

	}

}
