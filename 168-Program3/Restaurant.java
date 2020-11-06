/*
 *File name: Restaurant.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Feb 15, 2020
 *
 *Class: IT 168
 *Lecture Section: 01
 *Lecture Instructor: Dr. Fang
 *Lab Section: 02
 *Lab Instructor: Allan Buckley
 */
package edu.ilstu;

/**
 * Take users order, and calculate totals
 *
 *@author Aaron Gee
 *
 */
import java.util.Scanner;

public class Restaurant
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int salmonCount = 0;
		int chickenCount = 0;
		int steakCount = 0;
		int lambCount = 0;
		int fryCount = 0;
		int saladCount = 0;
		double subTotal = 0;
		double tax = 0;
		double serviceFee = 0;
		double totalSales = 0;
		
		System.out.println("\tWelcome to the online order system.");
		System.out.println("\nChoose the number of each entree you wish to order.");
		System.out.print("How many Salmon orders do you want: ");
		salmonCount = input.nextInt();
		System.out.print("How many Chicken orders do you want: ");
		chickenCount = input.nextInt();
		System.out.print("How many Steak orders do you want: ");
		steakCount = input.nextInt();
		System.out.print("How many Lamb orders do you want: ");
		lambCount = input.nextInt();
		System.out.print("\nChoose the number of each side you wish to order.");
		System.out.print("\nHow many Fries orders do you want: ");
		fryCount = input.nextInt();
		System.out.print("How many Salad orders do you want: ");
		saladCount = input.nextInt();
		
		System.out.println("\nYou have ordered the following:");
		System.out.println("Salmon\t\t\t"+ salmonCount);
		System.out.println("Chicken\t\t\t"+ chickenCount);
		System.out.println("Steak\t\t\t"+ steakCount);
		System.out.println("Lamb\t\t\t"+ lambCount);
		System.out.println("Fries\t\t\t"+ fryCount);
		System.out.println("Salad\t\t\t"+ saladCount);
		
		Order order1 = new Order(salmonCount, chickenCount, steakCount, lambCount, fryCount, saladCount);
		subTotal = order1.calculateSubTotal();
		System.out.printf("\nSubtotal:\t\t$%.2f", subTotal);
		
		tax = order1.calculateTax(subTotal);
		System.out.printf("\nTax:\t\t\t$%.2f", tax);
		
		serviceFee = order1.calculateServiceCharge(subTotal);
		System.out.printf("\nService Fee:\t\t$%.2f", serviceFee);
		
		totalSales = order1.calculateTotalCharge(subTotal, tax, serviceFee);
		System.out.printf("\nTotal:\t\t\t$%.2f", totalSales);
		
		
		
	}

}
