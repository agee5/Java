/*
 *File name: TimeCalculator.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Feb 4, 2020
 *
 *Class: IT 168
 *Lecture Section: 01
 *Lecture Instructor: Dr. Fang
 *Lab Section: 02
 *Lab Instructor: Allan Buckley
 */
package edu.ilstu;

/**
 * Convert seconds into Hours, Minutes, and Seconds
 *
 *@author Aaron Gee
 *
 */
import java.util.Scanner;

public class TimeCalculator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//Creating Constants for second in minutes, minutes in hour, and seconds in minutes
		final int secondsInMinute = 60;
		final int minutesInHour = 60;
		final int secondsInHour = 3600;
		
		//Taking user input for number of seconds they would like to convert
		System.out.print("Please Enter number of seconds: ");
		int inputSeconds = input.nextInt();
		
		//Calculate Number of seconds that will not fit into a minute
		int seconds = inputSeconds % secondsInMinute;
		
		//Subtract the total of seconds that cannot go into minute from total
		inputSeconds = inputSeconds - seconds;
		
		//Calculate number of minutes the remaining seconds will go into
		int minutes = (inputSeconds / secondsInMinute) % secondsInMinute;
		int subMinutes = minutes * minutesInHour;
		inputSeconds = inputSeconds - subMinutes;
		
		//Calculate number of hours there are with number of minutes are left
		int hours = inputSeconds / secondsInHour;
		
		//Output results
		System.out.println("Hours: "+ hours);
		System.out.println("Minutes: "+ minutes);
		System.out.println("Seconds: "+ seconds);

	}

}
