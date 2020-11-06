/*
 *File name: Triangle.java
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
 * Create a triangle of asterisks
 *
 *@author Aaron Gee
 *
 */
public class Triangle
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int sizeOfTri = 0;
		boolean good = false;
		
		while ( !good )
		{
			System.out.print("Enter the size of triangle: ");
			sizeOfTri= keyboard.nextInt();
			
			if ( sizeOfTri < 1 || sizeOfTri >50)
			{
				System.out.println("Please Enter a number between 1 and 50!");
			}
			else
			{
				good = true;
			}
		}
		
		for (int i = 1; i <= sizeOfTri; i++) {
		    for (int f = 0; f < i; f++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		for (int i = sizeOfTri-1; i > 0; i--) {
		    for (int f = 0; f < i; f++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
	

	}
}
