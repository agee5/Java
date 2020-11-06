/*
 *File name: Order.java
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
 * Setup order object, calculate total, tax, and service fee
 *
 *@author Aaron Gee
 *
 */
public class Order
{
	private int salmonCount = 0;
	private int chickenCount = 0;
	private int steakCount = 0;
	private int lambCount = 0;
	private int fryCount = 0;
	private int saladCount = 0;
	private final double SALMON_PRICE = 18.00;
	private final double CHICKEN_PRICE = 12.25;
	private final double STEAK_PRICE = 19.89;
	private final double LAMB_PRICE = 15.59;
	private final double FRY_PRICE = 2.99;
	private final double SALAD_PRICE = 4.99;
	private final double TAX_RATE = 0.07;
	private final double SERVICE_CHARGE = 0.10;
	
	public Order(int salmon, int chicken, int steak, int lamb, int fry, int salad)
	{
		salmonCount = salmon;
		chickenCount = chicken;
		steakCount = steak;
		lambCount = lamb;
		fryCount = fry;
		saladCount = salad;
	}
	
	public int getSalmonCount()
	{
		return salmonCount;
	}
	
	public int getChickenCount()
	{
		return chickenCount;
	}
	
	public int getSteakCount()
	{
		return steakCount;
	}
	
	public int getLambCount()
	{
		return lambCount;
	}
	
	public int getFryCount()
	{
		return fryCount;
	}
	
	public int getSaladCount()
	{
		return saladCount;
	}
	
	public double calculateSubTotal()
	{
		double subTotal = (salmonCount * SALMON_PRICE) + (chickenCount * CHICKEN_PRICE) + (steakCount * STEAK_PRICE) + (lambCount * LAMB_PRICE) + (fryCount * FRY_PRICE) + (saladCount * SALAD_PRICE);
		return subTotal;
	}

	public double calculateTax(double subTotal)
	{
		double taxForOrder = subTotal * TAX_RATE;
		return taxForOrder;
	}
	
	public double calculateServiceCharge(double subTotal)
	{
		double serviceChargeForOrder = subTotal * SERVICE_CHARGE;
		return serviceChargeForOrder;
	}
	
	public double calculateTotalCharge(double total, double tax, double serviceCharge)
	{
		double totalSales = total + tax + serviceCharge;
		return totalSales;
	}
}
