/*
 *File name: RoomDimension.java
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
 * Calculates the area from the given dimensions
 *
 *@author Aaron Gee
 *
 */
public class RoomDimension
{
	private double length = 0;
	private double width = 0;
	private double area = 0;
	
	public RoomDimension (double myLength, double myWidth)
	{
		length = myLength;
		width = myWidth;
	}
	
	public double calculateArea()
	{
		area = length * width;
		return area;
	}
	
	public String toString()
	{
		return "Those dimensions give us "+ area +" sq. ft. of carpet needed";
	}

}
