/*
 *File name: ChangeMaker.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Mar 3, 2020
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
 * Dtermine how much change to give back
 *
 *@author Aaron Gee
 *
 */
public class ChangeMaker
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int dollarInCents = 100;
		int itemPrice = 0;
		int change = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		String quarterPlural;
		String dimePlural;
		String nickelPlural;
		
		System.out.println("Item price must be 25 cents to a dollar, int 5-cent increments.");
		System.out.print("Enter item price: ");
		itemPrice = keyboard.nextInt();
		
		if (itemPrice < 25)
		{
			System.out.println("Cost is invalid - it must be at least 25 cents.");	
		}
		else if (itemPrice > 100)
		{
			System.out.println("Cost is invalid - it must be no more than 100 cents");
		}
		else if ((itemPrice % 5) != 0)
		{
			System.out.println("Cost is invalid - it must be evenly divided by 5");
		}
		else
		{
			change = dollarInCents - itemPrice;
			quarters = change / 25;
			change = change - (quarters * 25);
			dimes = change / 10;
			change = change - (dimes * 10);
			nickels = change / 5;
		
			if (quarters > 1)
			{
				quarterPlural = "quarters";
			}
			else
			{
				quarterPlural = "quarter";
			}
			if (dimes > 1)
			{
				dimePlural = "dimes";
			}
			else
			{
				dimePlural = "dimes";
			}
			if (nickels > 1)
			{
				nickelPlural = "nickels";
			}
			else
			{
				nickelPlural = "nickel";
			}
		
			System.out.println("You bought an item for "+ itemPrice +" and you gave me a dollar");
			System.out.println("Your change is:");
			System.out.println(quarters +" "+ quarterPlural);
			System.out.println(dimes +" "+ dimePlural);
			System.out.println(nickels +" "+ nickelPlural);
		}
	}

}
