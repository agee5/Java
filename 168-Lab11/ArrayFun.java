/*
 *File name: ArrayFun.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Apr 7, 2020
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
 * <insert class description here>
 *
 *@author Aaron Gee
 *
 */


public class ArrayFun
{

	/**
	 * @param args
	 */
	public static int fillArray(int[] arr, Scanner keyboard)
	{
		int count = 0;
		for(int i = 0; i < 100; i++)
		{
			System.out.print("Please enter an integer to enter into the array or -999 to exit: ");
			int input = keyboard.nextInt();
			if(input == -999)
			{
				break;
			}
			arr[i] = input;
			count++;
		}
		return count;
	}
	
	public static int computeProduct(int[] arr, int count)
	{
		int result = 1;
		
		for(int i = 0; i < count; i++)
		{
			result = result * arr[i];
		}
		return result;
	}
	
	public static int countMultiples(int[] arr, int count, int factor)
	{
		
		int multCount = 0;
		for(int i = 0; i < count; i++)
		{
			if (arr[i] % factor == 0)
			{
				multCount++;
			}
		}
		return multCount;
	}
	
	public static void printArray(int[] arr, int count)
	{
		for(int i = 0; i < count; i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int arr[] = new int[100];
		int count = 0;
		
		count = fillArray(arr, keyboard);
		int product = computeProduct(arr, count);
		System.out.println("\nThe product of the array is "+ product);
		System.out.print("\nEnter a factor: ");
		int factor = keyboard.nextInt();
		int multiple = countMultiples(arr, count, factor);
		System.out.println("\nThere is "+ multiple +" multiple(s) of "+ factor +" in the array");
		printArray(arr, count);
	}

}
