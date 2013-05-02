package com.mycompany.project.client;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RetriveData {
	public static String getMRP(String TagNo){
		ResultSet rs = new selectclass().con("MRP", "Table_1", "[Tag No] = " + TagNo);
		String MRP = "";
		try {
			while(rs.next()){
				MRP = rs.getString("MRP");
			}
			rs.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return MRP;
	}
	public static String invoiceTotal(String invoiceno){
		ResultSet rs = new selectclass().con("Discount, [Tag No], Quantity, Returned", "SalesTable", "[Invoice No] = " + invoiceno /*+ "AND [Returned] = 'False'" */);
		Double total = 0.0;
		try {
			while(rs.next()){
				String mrp = RetriveData.getMRP(rs.getString("Tag No"));
				total = total + ((Double.parseDouble(mrp) - Double.parseDouble(rs.getString("Discount")))*Double.parseDouble(rs.getString("Quantity")));
			}
			rs.close();
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return total.toString();
		
	}
	public static String returnedinvoiceTotal(String invoiceno, String date, String likeorequals){
		ResultSet rs = new selectclass().con("[Tag No]", "Returntable", "[Return Date] " + likeorequals +" '"+ date +"'" + " AND [Invoice No] = " + invoiceno);
		Double total = 0.0;
		try {
			
			//System.out.print("Yes");
			while(rs.next()){
				//System.out.print("Yes");
				ResultSet rs1 = new selectclass().con("Discount, Quantity", "SalesTable", "[Invoice No] = " + invoiceno + " AND [Returned] = 'True'" + " AND [Tag No] = " + rs.getString("Tag No") );
				
				while(rs1.next()){
					//System.out.print("yes");
					String mrp = RetriveData.getMRP(rs.getString("Tag No"));
					total = total + ((Double.parseDouble(mrp) - Double.parseDouble(rs1.getString("Discount")))*Double.parseDouble(rs1.getString("Quantity")));
					
				}
				rs1.close();
				}
			rs.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return total.toString();
		
	}
	
	public static String getQuantity(String TagNo){
		ResultSet rs = new selectclass().con("[Table 2]", "Table_1", "[Tag No] = " + TagNo + "AND Sold = 'false'");
		Integer quantity = 0;
		try {
			while (rs.next()){
				if(!rs.getBoolean("Table 2")){
					quantity = 1;
				}
				else{
					ResultSet rs1 = new selectclass().con("Quantity, Sold", "Table_2", "[Tag No] = " + TagNo);
					while(rs1.next()){
						quantity = Integer.parseInt(rs1.getString("Quantity")) - Integer.parseInt(rs1.getString("Sold"));
					}
					rs1.close();
				}
			}
			rs.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return quantity.toString();
		
	}
	public static void main(String[] args){
		System.out.print(RetriveData.returnedinvoiceTotal("55","7/23/2012", "=" ));
	}
}
