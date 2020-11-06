/*
 *File name: Circle.java
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

/**
 * Circle class for calulating area, diameter
 *
 *@author Aaron Gee
 *
 */
public class Circle
{
	private double radius;
	final private double PI = 3.14159;
	
	public Circle(double r)
	{
		radius = r;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double calculateArea()
	{
		double area = PI * radius * radius;
		return area;

	}
	
	public double calculateDiameter()
	{
		double diameter = radius * 2;
		return diameter;
	}
	
	public double calculateCircumference()
	{
		double circumference = 2 * PI * radius;
		return circumference;
	}

}
