package com.mycompany.project.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Updateclass {
	public void con(String Table, String Column, String Condition){
		String connectionUrl = "jdbc:sqlserver://localhost;"
				+ "user=Yunus;" + "password=abcd1234;"
				+ "databaseName=NRI;";
	
		Connection con = null;
		Statement stmt = null;
		try {
			con = DriverManager.getConnection(connectionUrl);
			try {
				String SQL = null;
				
					stmt = con.createStatement();
					SQL = "UPDATE "+ Table + " SET "+ Column +" WHERE "+ Condition;
					System.out.print(SQL);
					stmt.executeUpdate(SQL);
					
							
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}catch (Exception ee) {
		ee.printStackTrace();
	}
	}
}
