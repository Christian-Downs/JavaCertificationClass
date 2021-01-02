package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World with Maven");
		Connection connection = null;
		
		try {
		Class.forName("org.postgresql.Driver");
		
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "511908";
		connection=DriverManager.getConnection(url,username,password);
		
		System.out.println("Connection Success");
		
		Statement statement = connection.createStatement();
		
		String sql="Select * from player";
		
		
		
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		catch (SQLException e)
		{
			
		}
		finally {
			
		}
	}
}
