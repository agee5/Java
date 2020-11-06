/*
 *File name: OECDHandler.java
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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Handles the method the user chooses to run from OECD menu
 *
 *@author Aaron Gee
 *
 */
public class OECDHandler
{
	public final int SIZE = 50;
	public Country[] myCountry = new Country[SIZE];
	private int actualSize = 0;
	static private Comparator<Country> descpersonalEarnings;
	
	public OECDHandler()
	{
		
	}
	
	public void read(String filePath)
	{
		int count = 0;
		
		String pathToFile = filePath;
		
		File file = new File(pathToFile);
		try
		{
			Scanner reader = new Scanner(file);
			reader.nextLine();
			
			while (reader.hasNextLine())
			{
				String currentLine = reader.nextLine();
				String[] info = currentLine.split(",");
				String country = info[0];
				int employment = Integer.parseInt(info[1]);
				double jobSecurity = Double.parseDouble(info[2]);
				double lifeExpectancy = Double.parseDouble(info[3]);
				int personalEarnings = Integer.parseInt(info[4]);
				
				myCountry[count] = new Country(country, employment, jobSecurity, lifeExpectancy, personalEarnings);
				count++;
				
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found");
			e.printStackTrace();
		}
		
		actualSize = count;
	}
	
	public void displayAllCountries()
	{
		System.out.printf("%n%-20s%-20s%-20s%-20s%-20s%n", "Country", "Employment Rate", "Job Security", "Life Expectancy", "Personal Earnings");
		for (int i = 0; i < actualSize; i++)
		{
			System.out.println(myCountry[i].toString());
		}
	}
	
	public void searchByName()
	{
		Scanner keyboard = new Scanner(System. in);
		
		int counter = 0;
		
		System.out.print("Please input a country's name: ");
		String input = keyboard.nextLine();
		System.out.println("\n");
		
		for(int i = 0; i < actualSize; i++)
		{
			if(myCountry[i].getName().contentEquals(input))
			{
				System.out.printf("%-20s%-20s%-20s%-20s%-20s%n", "Country", "Employment Rate", "Job Security", "Life Expectancy", "Personal Earnings");
				System.out.println(myCountry[i].toString());
				counter++;
			}
		}
		if (counter == 0)
		{
			System.out.println("The input does not match any countries in the database.");
		}
	}
	
	public void searchByEmploymentRate()
	{
		boolean error = false;
		int input = 0;
		int counter = 0;
		
		do
		{
			try
			{
				Scanner keyboard = new Scanner(System.in);
				
				System.out.print("Please give an employment rate: ");
				input = keyboard.nextInt();
				
				for(int i = 0; i < actualSize; i++)
				{
					if(myCountry[i].getEmploymentRate() >= input)
					{
						counter++;
					}
				}
				
				if (counter == 1)
				{
					System.out.println("\nThere is "+ counter +" country that has a higher employment rate than "+ input +"\n");
					System.out.printf("%-20s%-20s%-20s%-20s%-20s%n", "Country", "Employment Rate", "Job Security", "Life Expectancy", "Personal Earnings");
				}
				else if (counter > 1)
				{
					System.out.println("\nThere are "+ counter +" countries that have a higher employment rate than "+ input +"\n");
					System.out.printf("%-20s%-20s%-20s%-20s%-20s%n", "Country", "Employment Rate", "Job Security", "Life Expectancy", "Personal Earnings");
				}
				else
				{
					System.out.println("\nNo countries have a higher employment rate than "+ input);
				}
				
				
				
				for(int i = 0; i < actualSize; i++)
				{
					if(myCountry[i].getEmploymentRate() >= input)
					{
						System.out.println(myCountry[i].toString());
					}
				}
				error = false;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Invalid Input..Pls Input Integer Only..");
				error = true;
			}
		}
		while(error);
	}
	
	private void sortCountriesByEarnings()
	{
		//Could not figure out sort, sorry.
	}
	
	public void rankCountriesByEarnings()
	{
		sortCountriesByEarnings();
		
		try
		{
			FileWriter fw = new FileWriter("countries ranked by earnings.txt", false);
			PrintWriter pw = new PrintWriter(fw);
			
			for(int i = 0; i < actualSize; i++)
			{
				pw.write(myCountry[i].toString());
			}
			System.out.println("Successful!");
			pw.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	

}
