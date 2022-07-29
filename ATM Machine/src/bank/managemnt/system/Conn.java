package bank.managemnt.system;

import java.sql.*;
import java.lang.*;
public class Conn
{
	Connection c;
	Statement s;
	public Conn()
	{
		
		
		try
		{	
			
		    //Class.forName(com.mysql.cj.jdbc.Driver);
			
			Class.forName("com.mysql.cj.jdbc.Driver");  
		
//		    Driver myDriver = new com.mysql.cj.jdbc.Driver();
//     		DriverManager.registerDriver(myDriver);
//			
			//create connection
			String connectionURL = "jdbc:mysql://localhost:3306/bankmanagementsystem?autoReconnect=true&useSSL=false";
			 c = DriverManager.getConnection(connectionURL,"root","Sai@1998");
			 
			 
			 //Create Statement
			 s = c.createStatement();
			 
			 
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
