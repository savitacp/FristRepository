package practicepackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFromDatabase1

{
	public static void main(String args[])throws Throwable
	{
	
	
	//Register to the database
	Driver driver = new Driver();
	DriverManager.registerDriver(driver);
	//connect to the database
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp1", "root", "root");
	//create the statement
	Statement state = con.createStatement();
	//Execute the Query
	String query="Select * from emp;";
	ResultSet result=state.executeQuery(query);
	while(result.next())
	{
		System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4));
	}
	
	
	// Close Connection
	
	
	con.close();
}
}
	
	
