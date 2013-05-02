package com.mycompany.project.client;

public class Integercheck {
	public static boolean check(String text){
		boolean temp = false;

		if(text.length()!=0)
			temp=true;
		try{
			Integer.parseInt(text);
		}catch(NumberFormatException e){
			temp = false;
		}
		
		return temp;
	}
}
