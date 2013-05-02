package com.mycompany.project.client;
/**
 * 
 * This is utility class with a function that helps us check for valid entry for amount.
 * @author Yunus
 *
 */
public class Moneyfieldcheck {
	
	/*public static void main(String[] args){
		System.out.print(Moneyfieldcheck.check("/"));
	}*/
	/**
	 * This function checks whether the given parameter is valid entry for amount.
	 * <br/> 
	 * @param DOUBLE - parameter that need to be checked of type String.
	 * @return True - if the given parameter is valid entry for amount, else False. 
	 */
	public static boolean check(String DOUBLE){
	boolean temp = false;
		if(DOUBLE.length()!=0)
			temp = true;
		try{
			
		Double.parseDouble(DOUBLE);
		
		}
		catch(NumberFormatException e){
			temp = false;
		}
		
	return temp;	
	}

}
