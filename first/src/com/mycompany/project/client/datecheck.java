package com.mycompany.project.client;

import java.util.Date;

public class datecheck {
	
	public static String getdate(Date d){
		d.setTime(d.getTime()+20000000);
		String date = "";
		@SuppressWarnings("deprecation")
		String gmtdate = d.toGMTString();
		int i = 0;
		int j = 0;
		while(gmtdate.length()!=i && j < 3){
			date = date + gmtdate.charAt(i);
			if(gmtdate.charAt(i)== ' ')
				j++;
			i++;
			
		}
		return date;
	}
	
	public static void main(String[] args){
		Date d = new Date();
		System.out.print(datecheck.getdate(d));
		//System.out.print(d.toLocaleString());
		//long temp = 20000000;
	//	d.setTime(d.getTime()+temp);
		System.out.print(d.toGMTString());
		
	//	System.out.print(d.getYear());
	}
}
