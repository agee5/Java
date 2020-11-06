/*
 *File name: StringExperiment.java
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
 * Experimenting with strings
 *
 *@author Aaron Gee
 *
 */
public class StringExperiment
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String firstName = "Aaron";
		String middleName = "John";
		String lastName = "Gee";
		
		//Print full name
		System.out.println(firstName +" "+ middleName +" "+ lastName);
		
		//Print first and last name with middle initial
		char middleInt = middleName.charAt(0);
		System.out.println(firstName +" "+ middleInt +". "+ lastName);
		
		//Print first name in all uppercase and last name in all lowercase
		String upperFirst = firstName.toUpperCase();
		String lowerLast = lastName.toLowerCase();
		System.out.println(upperFirst +" "+ lowerLast);
		
		//Print length of last name
		int lastLength = lastName.length();
		System.out.println("Length of Last Name = "+ lastLength);
		
		//Calculate the middle letter of last name and print it out
		int middleOfLast = lastLength / 2;
		char middleLast = lastName.charAt(middleOfLast);
		System.out.println(middleLast);
		
		//Find last letter of first name and print it out
		int firstLength = firstName.length() - 1;
		char firstLastLetter = firstName.charAt(firstLength);
		System.out.println(firstLastLetter);

	}

}
