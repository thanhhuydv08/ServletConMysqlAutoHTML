package controller;

import java.awt.Component;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.RootPaneContainer;

import com.mysql.jdbc.Statement;

import model.Book;


public class Controller implements databaseAbtract{
	Connection connection;
	ArrayList<Book> arrayList= new ArrayList<Book>();
   
	public Controller(String databaseName) {
		// TODO Auto-generated constructor stub
		try {
			connection = new ReadDatabaseName().ReadDatabase(databaseName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Book> CRUDdatabase(String sql, Frame frame, int key) {
		// TODO Auto-generated method stub
		try {
			Statement statement = (Statement) connection.createStatement() ;
			if(key==1||key==2||key==3) {
				int check =statement.executeUpdate(sql);
				if(check==1) {
					JOptionPane.showMessageDialog(frame, "Truy vấn Database thành công.");
					connection.close();
				}else {
					JOptionPane.showMessageDialog(frame, "Truy vấn Thất bại.");
					connection.close();
				}

			}else if(key==4) {
				ResultSet resultSet = statement.executeQuery(sql);
				while(resultSet.next()) {
					arrayList.add(new Book(resultSet.getString("namebook"), resultSet.getString("author"), resultSet.getString("namecompany"), resultSet.getString("price")));
					
				}
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arrayList;
	}


}
