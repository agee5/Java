/*
 *File name: OddIntegers.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Mar 24, 2020
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
 * Display the first n positive odd integers and compute
 *
 *@author Aaron Gee
 *
 */
public class OddIntegers
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int numOfInt = 0;
		int counter = 0;
		int sum = 0;
		
		System.out.print("Enter a number: ");
		numOfInt = keyboard.nextInt();
		int[] numArray = new int[numOfInt];
		
		for (counter = 0; counter < numOfInt; counter++)
		{
			int oddNum = 2 * counter + 1;
			numArray[counter] = oddNum;
			sum += oddNum;
		}
		
		for (int i = 0; i < numOfInt; i++)
		{
			System.out.print(numArray[i] +" + ");
		}
		System.out.println(" = " + sum);
		

	}

}
