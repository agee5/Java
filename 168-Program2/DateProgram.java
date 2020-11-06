/*
 *File name: DateProgram.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Jan 30, 2020
 *
 *Class: IT 168
 *Lecture Section: 01
 *Lecture Instructor: Dr. Fang
 *Lab Section: 02
 *Lab Instructor: Allan Buckley
 */
package edu.ilstu;

import java.text.DateFormatSymbols;

/**
 * Convert date format
 *
 *@author Aaron Gee
 *
 */

import java.util.Scanner;

public class DateProgram
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		boolean stop = false;
		
		//While loop so program will continue to run
		while(!stop) {
			
			//Ask user for date they would like to format
			System.out.print("\nEnter the date in MM/DD/YYYY format: ");
			String date = input.nextLine();
		
			//Split values from date into an array using / to split
			String[] values = date.split("/");
		
			//Setting 1st value in array to month
			int month = Integer.parseInt(values[0]);
			//Setting 2nd value in array to day
			int day = Integer.parseInt(values[1]);
			//Setting 3rd value in array to year
			int year = Integer.parseInt(values[2]);
		
			//Converting integer value of day into string value of month
			String monthString = new DateFormatSymbols().getMonths()[month-1];
		
			//Output date in new format
			System.out.println(monthString +" "+ day +", "+year);
			
			//Ask user if they would like to run program again
			System.out.print("\nWould you like to run again? (yes or no)");
			String s = input.nextLine();
			
			//If statement to set boolean value based on user input
			if(s.equals("no")) {
				stop = true;
			}
		}
	}
}
