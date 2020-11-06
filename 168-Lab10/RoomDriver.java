/*
 *File name: RoomDriver.java
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

import java.util.Scanner;

/**
 * Uses the RoomDimensions and RoomCarpet classes to calculate how much carpet will cost
 *
 *@author Aaron Gee
 *
 */
public class RoomDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double width = 0;
		double length = 0;
		double carpetPrice = 0;
		
		
		System.out.println("This program will calculate how much carpet you will need and how much it will cost");
		System.out.print("Please enter the width of the area: ");
		width = keyboard.nextDouble();
		System.out.print("Please enter the length of the area: ");
		length = keyboard.nextDouble();
		System.out.print("Please enter the price per sq. ft. the carpet will be: ");
		carpetPrice = keyboard.nextDouble();
		
		RoomDimension room1 = new RoomDimension(length, width);
		room1.calculateArea();
		System.out.println(room1.toString());
		
		RoomCarpet room1Cost = new RoomCarpet(room1, carpetPrice);
		room1Cost.calculateTotalCost();
		System.out.println(room1Cost.toString());
		
		keyboard.close();
		
		
	}

}
