/*
 *  Filename:  ConvertLoop.java
 *  
 *  Programmer: 
 *  ULID:  
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
 * Converts given nested for loops to nested while loops
 *
 * @author Cathy Holbrook
 *
 */
public class ConvertLoop
{
	public static void main(String[] args)
	{
		System.out.println("Original code with for loop");
		int s = 0;
		int t = 1;
		 
		for (int i = 0; i < 5; i++)
		{
			s = s + i;
			for (int j = i; j > 0; j--)
			{
				t = t + (j-1);
			}
			s = s + t;
			System.out.println("T is " + t);
		}
		System.out.println("S is " + s);

		System.out.println("\n\nNew code with while loop");
		
		/* **************************************************
		 * Add new code here
		 ****************************************************/
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 1;
		
		while (i < 5)
		{
			k = k + i;
			j = i;
			while (j > 0)
			{
				l = l + (j - 1);
				j = j - 1;
			}
			i = i + 1;
			k = k + l;
			System.out.println("L is "+ l);
		}
		System.out.println("K is "+ k);
		}

	}
