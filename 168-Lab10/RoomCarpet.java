/*
 *File name: RoomCarpet.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Mar 29, 2020
 *
 *Class: IT 168
 *Lecture Section: 01
 *Lecture Instructor: Dr. Fang
 *Lab Section: 02
 *Lab Instructor: Allan Buckley
 */
package edu.ilstu;

/**
 * Calculates the cost of carpet for given area
 *
 *@author Aaron Gee
 *
 */
public class RoomCarpet
{
	RoomDimension dimensions;
	private double area = 0;
	private double totalCost = 0;
	private double carpetPricePerSqFoot = 0;
	
	public RoomCarpet(RoomDimension dimensions, double carpetPrice)
	{
		carpetPricePerSqFoot = carpetPrice;
		this.dimensions = dimensions;
	}
	
	public double calculateTotalCost()
	{
		area = dimensions.calculateArea();
		totalCost = carpetPricePerSqFoot * area;
		return totalCost;
	}
	
	public String toString()
	{
		return "The total cost of carpet for "+ area +" sq. ft. is $"+ totalCost;
	}

}
