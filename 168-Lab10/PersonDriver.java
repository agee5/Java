/*
 *File name: PersonDriver.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Mar 28, 2020
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
public class PersonDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String firstName;
		String lastName;
		int age = 0;
		String firstName2;
		String lastName2;
		int age2 = 0;
		
		System.out.print("Please enter a first name: ");
		firstName = keyboard.nextLine();
		System.out.print("Please enter a last name: ");
		lastName = keyboard.nextLine();
		System.out.print("Please enter an age for this person: ");
		age = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.print("\nPlease enter a first name for person 2: ");
		firstName2 = keyboard.nextLine();
		System.out.print("Please enter a last name for person 2: ");
		lastName2 = keyboard.nextLine();
		System.out.print("Please enter an age for person 2: ");
		age2 = keyboard.nextInt();

		Person person1 = new Person(firstName, lastName, age);
		Person person2 = new Person(firstName2, lastName2, age2);
		
		System.out.println("");
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		
		System.out.println(person1.equals(firstName, firstName2, lastName, lastName2));

	}

}
