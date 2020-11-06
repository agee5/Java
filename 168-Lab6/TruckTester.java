/*
 * Filename:
 *
 * Programmer:
 * ULID: 
 *
 * Date:  
 *
 * Class:  
 * Lecture Section:
 * Lecture Instructor:
 * Lab Section:
 * Lab Instructor:  
 */
package edu.ilstu;

/**
 * Tests the Truck class
 *
 * @author Cathy Holbrook and Mary Elaine Califf
 *
 */
public class TruckTester
{
	public static void main(String[] args)
	{
		//Call the default constructor
		Truck truck1 = new Truck();
		System.out.println(truck1.toString());
		
		//Call constructor with 1 argument
		Truck truck2 = new Truck(6);
		System.out.println(truck2.toString());
		
		//Call constructor with 2 arguments
		Truck truck3 = new Truck(6, "Ford");
		System.out.println(truck3.toString());
		
		//Call constructor with 3 arguments
		Truck truck4 = new Truck(6, "Ford", 1000);
		System.out.println(truck4.toString());
		
		//Call constructor with 4 arguments
		Truck truck5 = new Truck(6, "Ford", 1000, 13000);
		System.out.println(truck5.toString());
	}

}
