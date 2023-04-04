package practicepackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFromDatabaseTest {

	public static void main(String[] args) throws Throwable
	{
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
		Statement state = con.createStatement();
		String quary = "select * from testyantrastd";
		ResultSet result = state.executeQuery(quary);
		while(result.next())
		{
			System.out.println(result.getString(1)+" "+result.getString(2));
		}
		con.close();

	}

}
