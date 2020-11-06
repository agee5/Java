/*
 *File name: RestaurantBillCalculator.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Jan 28, 2020
 *
 *Class: IT 168
 *Lecture Section: 01
 *Lecture Instructor: Dr. Fang
 *Lab Section: 02
 *Lab Instructor: Allan Buckley
 */
package edu.ilstu;

/**
 * Calculate bill at restaurant
 *
 *@author Aaron Gee
 *
 */
public class RestaurantBillCalculator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		final double TIPPERCT = 0.15;
		final double TAXRATE = 0.075;
		double mealCost = 45.75;
		double tax = 0;
		double tipAmount = 0;
		double totalAmount = 0;
		
		tax = mealCost * TAXRATE;
		tipAmount = mealCost * TIPPERCT;
		totalAmount = mealCost + tax + tipAmount;
		
		System.out.println("Meal Cost:\t$"+ mealCost);
		System.out.println("Tax:\t$"+ tax);
		System.out.println("Tip:\t$"+ tipAmount);
		System.out.println("Total Amount:\t$"+ totalAmount);
	}

}
