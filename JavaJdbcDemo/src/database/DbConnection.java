package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private Connection connection;
	public Connection connectDB() throws ClassNotFoundException, SQLException 
	{
		//Step 1: load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		//step 2: provide connection  parameters
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","mysqlroot");
		System.out.print("connected");
		return connection;
	}
	public void closeConnection() throws SQLException {
		connection.close();
	}

}
