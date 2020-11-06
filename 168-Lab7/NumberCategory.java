/*
 *File name: CompareNumber.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Feb 25, 2020
 *
 *Class: IT 168
 *Lecture Section: 01
 *Lecture Instructor: Dr. Fang
 *Lab Section: 02
 *Lab Instructor: Allan Buckley
 */
package edu.ilstu;

import java.util.Scanner;
/**
 * Determine is a number is positive, negative, or zero
 *
 *@author Aaron Gee
 *
 */
public class NumberCategory
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int myNumber = 0;
		
		System.out.print("Please enter any negative or positive number: ");
		myNumber = input.nextInt();
		if (myNumber > 0)
		{
			System.out.println("\nThe number is positive.");
		}
		else if (myNumber < 0)
		{
			System.out.println("\nThe number is negative.");
		}
		else
		{
			System.out.println("\nThe number is 0.");
		}

	}

}
