/*
 *File name: BookDriver.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Feb 11, 2020
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
 * Driver class for Book Class
 *
 *@author Aaron Gee
 *
 */
public class BookDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		Book book1 = new Book(0.075, "Life of Pi", 13.50);
		Book book2 = new Book(0.075, "Harry Potter", 22.00);
		
		System.out.print("Enter number to buy of Life of Pi: ");
		double noOfPi = input.nextDouble();
		double costOfPi = book1.calculateSales(noOfPi);
		System.out.println("Cost for Life of Pi = $"+ costOfPi);
		
		System.out.print("Enter the number to buy of Harry Potter: ");
		double noOfHP = input.nextDouble();
		double costOfHP = book2.calculateSales(noOfHP);
		System.out.println("Cost for Harry Potter = $"+ costOfHP);
		
		System.out.print("Enter percent of increase for Life of PI (in decimal form): ");
		double increase = input.nextDouble();
		book1.increasePrice(increase);
		
		System.out.print("Enter percent of increase for Harry Potter (in decimal form): ");
		double increase2 = input.nextDouble();
		book1.increasePrice(increase2);
		
		double newCostOfPI = book1.calculateSales(noOfPi);
		System.out.println("Cost for Life of Pi = $"+ newCostOfPI);
		
		double newCostOfHP = book2.calculateSales(noOfHP);
		System.out.println("Cost for Harry Potter = $"+ newCostOfHP);
	}

}
