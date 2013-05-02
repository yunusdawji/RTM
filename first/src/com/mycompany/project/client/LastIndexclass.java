package com.mycompany.project.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * This is utility class with a function the returns TagNo of the last entry of stock table
 * @author Yunus
 *
 */

public class LastIndexclass {
/**
 * Returns the last TagNo in the database from a table
 * @param Table - Table Name from the database
 * @return Last TagNo from table 1 
 */
	public static String con(String Table){
		String connectionUrl = "jdbc:sqlserver://localhost;"
				+ "user=Yunus;" + "password=abcd1234;"
				+ "databaseName=NRI;";
		 String s = null;
		Connection con = null;
		Statement stmt = null;
		try {
			con = DriverManager.getConnection(connectionUrl);
			try {
			
					
					
					stmt = con.createStatement();
					 String SQL1 = "SELECT IDENT_CURRENT('" + Table +"');";
	    	    	   
	    	    	    ResultSet rs = stmt.executeQuery(SQL1);
						
	    	    	    	
						while (rs.next()) {
	    	    	    	  s = rs.getString(""); 
							}
						
							
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}catch (Exception ee) {
		ee.printStackTrace();
	}
		return s;
	
		
	}
}
