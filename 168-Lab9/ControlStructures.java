/*
 *  Filename:  ControlStructures.java
 *  
 *  Programmer: Cathy Holbrook
 *  ULID:  cjholbr
 *
 *  Date:  
 *
 *  Class: IT 168
 *
 *  Lecture Section:
 *  Lecture Instructor:
 *  Lab Section: 
 *  Lab Instructor: 
 */
package edu.ilstu;

/**
 * Each method is the code to run the
 * control structures from Lab 3
 *
 * @author Cathy Holbrook
 *
 */
public class ControlStructures {
	
	/**
	 * No-arg constructor
	 */
	public ControlStructures(){
	}
	
	/**
	 * 
	 * Checks to see if a string is all numeric
	 *
	 * @param: 	str		The string to test
	 * @return:	Whether the string is valid
	 *
	 */
	public boolean isNumeric(String str)
	{
		boolean valid = true;
		String regex = "\\d*";
		
		valid = str.matches(regex);
		
		return valid;
	}
	
	/**
	 * 
	 * Pre-Lab Problem 1 code
	 *
	 * @param: 	variable1 	First integer value to compare
	 * @param:	variable2	Second integer value to compare
	 * @return:	Answer - true or false - after comparison of two numbers
	 *
	 */
	public String preLab1 (int variable1, int variable2)
	{
		String answer = null;
		
		if (variable1 < variable2){
			answer = "true";
		} else {
			answer = "false";
		}
		 
		return answer;
	}
	
	/**
	 * 
	 * Pre-Lab Problem 2 code
	 *
	 * @param: 	variable1 	First integer value to compare
	 * @param:	variable2	Second integer value to compare
	 * @return:	Answer - true or false - after comparison of two numbers
	 *
	 */
	public String preLab2 (int variable1, int variable2)
	{
		String answer = null;
		
		if (variable1 > variable2){
			answer = "true";
		} else {
			answer = "false";
		}
		
		return answer;
	}
	
	/**
	 * 
	 * Pre-Lab Problem 3 code
	 *
	 * @param: 	variable1 	First integer value to compare
	 * @param:	variable2	Second integer value to compare
	 * @return:	Answer - true or false - after comparison of two numbers
	 *
	 */
	public String preLab3 (int variable1, int variable2)
	{
		String answer = null;
		
		if (variable1 <= variable2){
			answer = "true";
		} else {
			answer = "false";
		}
		
		return answer;
	}
	
	/**
	 * 
	 * Pre-Lab Problem 4 code
	 *
	 * @param: 	number 		Initial value to go through the loop
	 *
	 */
	public void preLab4 (int number)
	{
	
		while (number < 5){
			number = number + 1;
		}
		System.out.println("Number is " + number);
	}
	
	/**
	 * 
	 * Pre-Lab Problem 5 code
	 *
	 * @param: 	number 		Initial value to go through the loop
	 *
	 */
	public void preLab5 (int number)
	{
	
		while (number < 4){
			System.out.println(number);
			number = number + 1;
		}
		System.out.println("The last number is " + number);
	}
	
	/**
	 * 
	 * Pre-Lab Problem 6 code
	 *
	 * @param: 	number 		Initial value to go through the loop
	 *
	 */
	public void preLab6 (int number)
	{
	
		while (number > 5){
			System.out.println(number);
			number = number -2;
		}
		System.out.println("The last number is " + number);
	}
	
	/**
	 * 
	 * Pre-Lab Problem 7 code
	 * This method accepts the amount of a purchase and the amount someone pays and
	 * calculates the change.  All values are in the form of pennies.  
	 * For example:  $1.00 would be 100
	 * The number of each coin is stored in the instance variables of the Change class
	 *
	 * @param:  change
	 * @param:  amountOwed
	 * @param:  amountPaid
	 *
	 */
	
	public boolean calculateChange(Change change, int amountOwed, int amountPaid)
	{
		boolean enoughMoney = true;
					
		int returnChange = amountPaid - amountOwed;
		if (returnChange < 0){
			enoughMoney = false;			
		}
		else
		{
			int dollars = returnChange / 100;
			int changeLeft = returnChange % 100;
			int quarters = changeLeft / 25;		
			changeLeft = changeLeft % 25;
			int dimes = changeLeft / 10;
			changeLeft = changeLeft % 10;
			int nickels = changeLeft / 5;
			int pennies = changeLeft % 5;
			
			change.setDollars(dollars);
			change.setQuarters(quarters);
			change.setDimes(dimes);
			change.setNickels(nickels);
			change.setPennies(pennies);
		}
		
		return enoughMoney;
	}
}
