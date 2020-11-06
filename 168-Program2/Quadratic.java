/*
 *File name: Quadratic.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Feb 1, 2020
 *
 *Class: IT 168
 *Lecture Section: 01
 *Lecture Instructor: Dr. Fang
 *Lab Section: 02
 *Lab Instructor: Allan Buckley
 */
package edu.ilstu;

import java.util.Random;
/**
 * Generate random numbers, and solve quadratic formula with the numbers
 *
 *@author Aaron Gee
 *
 */
public class Quadratic
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//Generate 3 random numbers, and put them into variables
		Random rand = new Random();
		int a = rand.nextInt(50);
		int b = rand.nextInt(50);
		int c = rand.nextInt(50);
		
		//Solve Quadratic Formula using Math.sqrt and Math.pow
		double answer1 = ((double)(-b + Math.sqrt(Math.pow(b,  2) - (4 * a * c))) / (2 * a));
		double answer2 = ((double)(-b - Math.sqrt(Math.pow(b,  2) - (4 * a * c))) / (2 * a));
		
		//Output Results
		System.out.println("The two possible solutions for "+ a +" "+ b +" "+ c +" are");
		System.out.println(answer1 +" and "+ answer2);
	}
}
