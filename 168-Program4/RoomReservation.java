/*
 *File name: RoomReservation.java
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

/**
 * Create reservation for HotelApp class
 *
 *@author Aaron Gee
 *
 */
public class RoomReservation
{
	public static final double BREAKFAST_COST = 9.99;
	public static final double CRIB_COST = 14.50;
	public static final double LATE_CHECKOUT_COST = 29.99;
	public static final double SALES_TAX = 0.06;
	public static final double SERVICE_FEE = 0.08;
	
	private String customerName;
	private String reservationDate;
	private double preTaxTotal = 0;
	private double finalTotal = 0;
	private double noOfVisitors = 0;
	private double roomNumber = 0;
	private char breakfastSelected = 'Y';
	private char cribSelected = 'Y';
	private char lateCheckoutSelected = 'Y';
	private double extrasCost = 0;
	private double roomPrice = 0;
	private double reserSalesTax = 0;
	private double reserServiceFee = 0;
	
	public RoomReservation()
	{
		
	}
	
	public RoomReservation(String name, double room, double price)
	{
		customerName = name;
		roomNumber = room;
		roomPrice = price;
	}
	
	public void setNoOfVisitors (double visitors)
	{
		noOfVisitors = visitors;
	}
	
	public void setCustomerName(String name)
	{
		customerName = name;
	}
	
	public void setRoomNumber(double room)
	{
		roomNumber = room;
	}
	
	public void setRoomPrice(double price)
	{
		roomPrice = price;
	}
	
	public void setBreakfastSelected(char breakfast)
	{
		breakfastSelected = breakfast;
	}
	
	public void setCribSelected(char crib)
	{
		cribSelected = crib;
	}
	
	public void setLateCheckoutSelected(char lateCheckout)
	{
		lateCheckoutSelected = lateCheckout;
	}
	
	public void setExtrasCost(double extras)
	{
		extrasCost = extras;
	}
	
	public double getNoOfVisitors()
	{
		return noOfVisitors;
	}
	
	public String getCustomerName()
	{
		return customerName;
	}
	
	public double getRoomNumber()
	{
		return roomNumber;
	}
	
	public double getRoomPrice()
	{
		return roomPrice;
	}
	
	public char getBreakfastSelected()
	{
		return breakfastSelected;
	}
	
	public char getCribSelected()
	{
		return cribSelected;
	}
	
	public char getLateCheckoutSelected()
	{
		return lateCheckoutSelected;
	}
	
	public double getExtrasCost()
	{
		return extrasCost;
	}
	
	public void setPreTaxTotal()
	{
		double breakfastPrice = 0;
		double cribPrice = 0;
		double lateCheckoutPrice = 0;
		
		//See if user input a y for yes, or a n no
		if (breakfastSelected == 'y' || breakfastSelected == 'Y')
		{
			breakfastPrice = BREAKFAST_COST;
		}
		if (cribSelected == 'y' || cribSelected == 'Y')
		{
			cribPrice = CRIB_COST;
		}
		if (lateCheckoutSelected == 'y' || lateCheckoutSelected == 'Y')
		{
			lateCheckoutPrice = LATE_CHECKOUT_COST;
		}
		
		//add cost of any extras that were chose
		extrasCost = breakfastPrice + cribPrice + lateCheckoutPrice;
		//add cost of extras to the room price that was selected
		preTaxTotal = roomPrice + extrasCost;
	}
	
	public void setTotalPrice()
	{	
		//Calculate sales tax for selected room
		reserSalesTax = preTaxTotal * SALES_TAX;
		//Calculate service fee for selected room
		reserServiceFee = preTaxTotal * SERVICE_FEE;
		//Add the sales tax and service fee to cost of room to get final cost of room
		finalTotal = preTaxTotal + reserSalesTax + reserServiceFee;
	}
	
	public String toString()
	{
		return "\n******************************************\n"
			   + "*****Room "+ roomNumber +" successfully reserved*****\n"
			   + "****************************************\n"
			   + "Room: $"+ roomPrice +""
			   + "\nExtras: $"+ extrasCost +""
			   + "\nTotal Before Tax: $"+ preTaxTotal +""
			   + "\nSales Tax: $"+ reserSalesTax
			   + "\nService Fee: $"+ reserServiceFee +""
			   + "\nTotal after tax: $"+ finalTotal +""
			   + "\n****************************************\n"
			   + "*****Thank You for your reservation*****\n"
			   + "****************************************\n";
	}  

}
