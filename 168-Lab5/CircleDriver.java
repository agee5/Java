/*
 *File name: CircleDriver.java
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

public class CircleDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle:");
		double radius = input.nextInt();
		
		Circle c1 = new Circle(radius);
		double a = c1.calculateArea();
		System.out.println("Area = "+ a);
		double d = c1.calculateDiameter();
		System.out.println("Diameter = "+ d);
		double c = c1.calculateCircumference();
		System.out.println("Circumference = "+ c);
		
	}

}
