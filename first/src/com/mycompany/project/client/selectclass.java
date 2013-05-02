package com.mycompany.project.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class selectclass {
	public static void main(String[] args){
		ResultSet rs = new selectclass().con("[Buying price], [Tag No], [table 2]", "Table_1", "Type LIKE 'Anarkali'");
		Double d = 0.0;
		int count = 0;
		try {
			while(rs.next()){
				if(rs.getBoolean("table 2"))
				{
					ResultSet rs1 = new selectclass().con("[Quantity]", "Table_2", "[Tag No] = "+ rs.getString("Tag No"));
					while(rs1.next()){
						count = count + Integer.parseInt(rs1.getString("Quantity"));
						d = d + (Double.parseDouble(rs.getString("Buying price"))*Double.parseDouble(rs1.getString("Quantity")));
					}
				}
				else{
				d = d + Double.parseDouble(rs.getString("Buying price"));
				count = count + 1;
				}
				}
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	System.out.print(d);
	System.out.print(count);
	}
	
	
	public ResultSet con(String x, String z, String y){
		String connectionUrl = "jdbc:sqlserver://localhost;"
				+ "user=Yunus;" + "password=abcd1234;"
				+ "databaseName=NRI;";
	
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(connectionUrl);
			try {
				String SQL = null;
				
					stmt = con.createStatement();
					SQL = "SELECT "+ x + " From "+ z +" WHERE "+ y;
					//System.out.print(SQL);
					rs = stmt.executeQuery(SQL);
					
					
					
							
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}catch (Exception ee) {
		ee.printStackTrace();
	}
		return rs;
		
		
	}
}
