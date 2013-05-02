package com.mycompany.project.client;
/**
 * This a utility class with a function that check for valid TagNo type.
 * @author Yunus
 *
 */
public class TagNofieldcheck {
	/*public static void main(String[] args){
		System.out.print(TagNofieldcheck.check("/"));
	}*/
	
	/**
	 * This function lets us check whether the parameter is valid TagNo type. 
	 * @param INT - parameter to be tested
	 * @return True- if it is a valid TagNo type else False.
	 */
	public static boolean  check(String INT){
		boolean temp = false;
		if(INT.length()!=0)
			temp = true;
		try{
			
		Double.parseDouble(INT);
		
		}
		catch(NumberFormatException e){
			temp = false;
		}
		
		return temp;
		}
}
