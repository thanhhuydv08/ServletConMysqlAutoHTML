package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.mysql.jdbc.Statement;

public class ReadDatabaseName {

	   Connection ReadDatabase(String databaseName) throws ClassNotFoundException, SQLException {
		String url ="jdbc:mysql://localhost:3306/"+databaseName+"?useUnicode=true&characterEncoding=UTF-8";
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url,"root","");
		Statement statement = (Statement) connection.createStatement();
	//	String sql="Select * from informationperson";
//		ResultSet resultSet = statement.executeQuery(sql);// tra ve list cua table
   //	statement.executeUpdate(sql); // tra ve 1 neu ghi duoc vao table, khi nao thuc hien  excuquery  tra ve list khi lay data ve select * , con exuupdate thu hien lech inseet. delete, udate
//		resultSet.next(); // lap de lay value tung cot trong table data
		return connection;
		
		
		
		
	}

	
}

