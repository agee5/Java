/*
 *File name: PrismCalculator.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Jan 21, 2020
 *
 *Class: IT 168
 *Lecture Section: 01
 *Lecture Instructor: Dr. Fang
 *Lab Section: 02
 *Lab Instructor: Allan Buckley
 */
package edu.ilstu;

import java.util.Scanner;

public class PrismCalculator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		final double GALLONSCONVERSION = 231;
		final double LINERCOST = 0.36;
		final double CONCRETECOST = 0.40;
		final double HOURSCALCULATOR = 30000;
		final double LABORCOST = 250.0;
		
		//Prompt and accept height,base, length, width1, and width2
		System.out.print("Enter the height of the prism in inches: ");
		double prismHeight = input.nextDouble();
		System.out.print("Enter the base of the prism in inches: ");
		double basePrism = input.nextDouble();
		System.out.print("Enter the length of the prism in inches: ");
		double lengthPrism = input.nextDouble();
		System.out.print("Enter the width of side 1 of the prism: ");
		double side1Prism = input.nextDouble();
		System.out.print("Enter the width of side 2 of the prism: ");
		double side2Prism = input.nextDouble();
		
		//Calculate the surface area of the prism
		double surfaceArea = 2*(prismHeight*basePrism/2)+lengthPrism*side1Prism+lengthPrism*side2Prism+lengthPrism*basePrism;
		System.out.println("\nThe Surface Area is: "+ surfaceArea +" square inches");
		
		//Calculate the volume of the prism
		double volumePrism = (prismHeight * basePrism * lengthPrism) / 2;
		System.out.println("The Volume is: "+ volumePrism +" cubic inches");
		
		//Determine how many gallons of water will be used
		double gallonsOfWater = volumePrism / GALLONSCONVERSION * 0.5;
		System.out.println("The number of gallons of water needed is: "+ gallonsOfWater);
		
		//Determine the cost of the liner that will be needed
		System.out.println("\nThe total cost of the job:");
		double linerCost = LINERCOST * surfaceArea;
		System.out.println("Liner cost:\t\t$"+ linerCost);
		
		//Determine the cost of concrete that will be needed
		double concreteCost = CONCRETECOST * volumePrism;
		System.out.println("Concrete cost:\t\t$"+ concreteCost);
		
		//Determine the total hours to complete job and cost of labor
		double hoursTotal = volumePrism / HOURSCALCULATOR;
		double costOfLabor = LABORCOST * hoursTotal;
		System.out.println("Labor cost:\t\t$"+ costOfLabor);
		
		//Determine the total cost of the job and output the results
		System.out.println("__________________________________");
		double projectCost = linerCost + concreteCost + costOfLabor;
		System.out.println("Total project cost:\t$"+ projectCost);
	}

}
