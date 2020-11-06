/*
 *File name: Truck.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Feb 21, 2020
 *
 *Class: IT 168
 *Lecture Section: 01
 *Lecture Instructor: Dr. Fang
 *Lab Section: 02
 *Lab Instructor: Allan Buckley
 */
package edu.ilstu;

/**
 * Class that works with provided TruckTester class
 *
 *@author Aaron Gee
 *
 */
public class Truck
{
	private int cylinders = 0;
	private String manufacturer = "Not Provided";
	private double load = 0;
	private double tow = 0;
	
	public Truck()
	{
		
		
	}
	
	public Truck(int noOfCyl)
	{
		cylinders = noOfCyl;
	}
	
	public Truck(int noOfCyl, String manu)
	{
		cylinders = noOfCyl;
		manufacturer = manu;
	}
	
	public Truck(int noOfCyl, String manu, double load1)
	{
		cylinders = noOfCyl;
		manufacturer = manu;
		load = load1;
	}
	
	public Truck(int noOfCyl, String manu, double load1, double tow1)
	{
		cylinders = noOfCyl;
		manufacturer = manu;
		load = load1;
		tow = tow1;
	}
	
	public int getCylinders()
	{
		return cylinders;
	}
	
	public String getManufacturer()
	{
		return manufacturer;
	}
	
	public double getLoad()
	{
		return load;
	}
	
	public double getTow()
	{
		return tow;
	}
	
	public String toString()
	{
		return "\n\ncylinders = "+ cylinders
				+"\nmanufacturer = "+ manufacturer
				+"\nload = "+ load
				+"\ntow = "+tow;
	}

}
