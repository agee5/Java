/*
 *  Programmer:  Cathy Holbrook & Mary Elaine Califf
 *
 *  Date:  Feb 21, 2014
 *
 *  File name:  PersonTester.java
 *
 *  Class:  IT 168
 *  Section:
 *  Instructor:   
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * Tests methods in the Person class
 *
 * @author Cathy Holbrook and Mary Elaine Califf
 *
 */
public class PersonTester
{
	public static void main(String[] args) 
	{
		
		/*
		 * Test Case 1:  Single Male, valid data
		 */
		System.out.println("Test case 1 - single male, valid data");
		Person malePerson = new Person("John Doe", "m", "s");
		if (malePerson.isValidMaritalStatus())
		{
			malePerson.determineTitle();
			System.out.println(malePerson.getTitle() + " " + malePerson.getName());
			System.out.println("Marital status is valid:  " + malePerson.getMaritalStatus());
		}
		else
		{
			System.out.println("Marital status is invalid:  " + malePerson.getMaritalStatus());
		}
		if (malePerson.isValidGender())
		{
			System.out.println("Gender is valid:  " + malePerson.getGender());
		}
		else
		{
			System.out.println("Gender is not valid:  " + malePerson.getGender());
		}

		
		/*
		 * Test Case 2:  Married Male, valid data
		 * Reuses the same object created in Case 1 for all other male test cases
		 */	
		System.out.println("\nTest case 2 - married male, valid data");
		malePerson.setMaritalStatus("M");
		if (malePerson.isValidMaritalStatus())
		{
			malePerson.determineTitle();
			System.out.println(malePerson.getTitle() + " " + malePerson.getName());
			System.out.println("Marital status is valid:  " + malePerson.getMaritalStatus());
		}
		else
		{
			System.out.println("Marital status is invalid:  " + malePerson.getMaritalStatus());
		}
		if (malePerson.isValidGender())
		{
			System.out.println("Gender is valid:  " + malePerson.getGender());
		}
		else
		{
			System.out.println("Gender is not valid:  " + malePerson.getGender());
		}

		
		/*
		 * Test Case 3:  Male, invalid gender
		 */
		System.out.println("\nTest case 3 - male, invalid gender");
		malePerson.setGender("Y");
		if (malePerson.isValidGender())
		{
			System.out.println("Gender is valid:  " + malePerson.getGender());
		}
		else
		{
			System.out.println("Gender is not valid:  " + malePerson.getGender());
		}
		
		/*
		 * Test Case 4:  Male, invalid marital status
		 */
		System.out.println("\nTest case 4 - male, invalid marital status");
		malePerson.setMaritalStatus("B");
		if (malePerson.isValidMaritalStatus())
		{
			System.out.println("Marital status is valid:  " + malePerson.getMaritalStatus());
		}
		else
		{
			System.out.println("Marital status is invalid:  " + malePerson.getMaritalStatus());
		}	
		
		/*
		 * Test Case 5:  Single Female, valid data
		 */
		Person femalePerson = new Person("Jane Doe", "F", "S");
		System.out.println("\nTest Case 5 - single female, valid data");
				
		if (femalePerson.isValidMaritalStatus())
		{
			femalePerson.determineTitle();
			System.out.println(femalePerson.getTitle() + " " + femalePerson.getName());
			System.out.println("Marital status is valid:  " + femalePerson.getMaritalStatus());
		}
		else
		{
			System.out.println("Marital status is invalid:  " + femalePerson.getMaritalStatus());
		}
		if (femalePerson.isValidGender())
		{
			System.out.println("Gender is valid:  " + femalePerson.getGender());
		}
		else
		{
			System.out.println("Gender is not valid:  " + femalePerson.getGender());
		}

		
		/*
		 * Test Case 6: Married Female, valid data
		 * Uses the same object created in Case 5 for all other female test cases
		 */
		System.out.println("\nTest Case 6 - Married Female, valid data");
		femalePerson.setMaritalStatus("M");

		if (femalePerson.isValidMaritalStatus())
		{
			femalePerson.determineTitle();
			System.out.println(femalePerson.getTitle() + " " + femalePerson.getName());
			System.out.println("Marital status is valid:  " + femalePerson.getMaritalStatus());
		}
		else
		{
			System.out.println("\nMarital status is invalid:  " + femalePerson.getMaritalStatus());
		}
		if (femalePerson.isValidGender())
		{
			System.out.println("Gender is valid:  " + femalePerson.getGender());
		}
		else
		{
			System.out.println("Gender is not valid:  " + femalePerson.getGender());
		}

		
		/*
		 * Test Case 7:  Married Female, invalid gender
		 */
		System.out.println("\nTest Case 7 - Married Female, invalid gender");
		femalePerson.setGender("X");
		if (femalePerson.isValidGender())
		{
			System.out.println("Gender is valid:  " + femalePerson.getGender());
		}
		else
		{
			System.out.println("Gender is not valid:  " + femalePerson.getGender());
		}
		
		/*
		 * Test Case 8:  Female, invalid marital status
		 */
		System.out.println("\nTest Case 8: - Female, invalid marital status");
		femalePerson.setMaritalStatus("D");
		if (femalePerson.isValidMaritalStatus())
		{
			femalePerson.determineTitle();
			System.out.println(femalePerson.getTitle() + " " + femalePerson.getName());
			System.out.println("Marital status is valid:  " + femalePerson.getMaritalStatus());
		}
		else
		{
			System.out.println("Marital status is invalid:  " + femalePerson.getMaritalStatus());
		}
		
		/*
		 * Test case 9: Get data from user
		 */
		Scanner kb = new Scanner(System.in);
		System.out.println();
		System.out.print("Type in the letter m followed by enter: ");
		String tempGender = kb.nextLine();
		System.out.print("Type in the letter s followed by enter: ");
		String tempStatus = kb.nextLine();
		Person myPerson = new Person("John Doe",tempGender,tempStatus);
		myPerson.determineTitle();
		System.out.println(myPerson.getTitle() + " " + myPerson.getName());
		System.out.println("Gender: "+ myPerson.getGender()+ " and Status: " + myPerson.getMaritalStatus());
	}

}
