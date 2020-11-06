/*
 *File name: OECDApp.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Apr 29, 2020
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
 * OECD Database app, reads input from .csv file and prompts user with menu with options
 *
 *@author Aaron Gee
 *
 */
public class OECDApp
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		OECDHandler oecd = new OECDHandler();
		oecd.read("I:\\work\\Program7\\src\\edu\\ilstu\\oecd_bli.csv");
		menu(oecd);
		

	}
	
	public static void menu(OECDHandler oecd)
	{	
		int selection = 0;
		
		while (true)
		{
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("\n\t\t\t\tWelcome to the OECD Database");
			System.out.println("\t\t\t    ==========================================");
			System.out.println("\t\t\t       1. Browse all countries.");
			System.out.println("\t\t\t       2. Search for a country.");
			System.out.println("\t\t\t       3. Search for countries based on employment rate.");
			System.out.println("\t\t\t       4. Rank countries by personal earnings.");
			System.out.println("\t\t\t       5. Exit.");
			System.out.println("\t\t\t    ==========================================");
			System.out.print("Please make your choice: ");
			selection = keyboard.nextInt();
			
			if(selection == 1)
			{
				oecd.displayAllCountries();
			}
			else if (selection == 2)
			{
				oecd.searchByName();
			}
			else if(selection == 3)
			{
				oecd.searchByEmploymentRate();
			}
			else if(selection == 4)
			{
				oecd.rankCountriesByEarnings();	
			}
			else if(selection == 5)
			{
				System.out.println("Thank you for using the database, Please come back next time.");
				break;
			}
			else
			{
				System.out.println("Please enter a number between 1 and 5");
			}
		}
	}

}
