package edu.ilstu;

public class Driver 
{
	public static void main (final String[] args)
	{
		//Creating coordinates for Quadrilateral
		final Quadrilateral quad = new Quadrilateral(1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4);
		
		//Creating coordinates for Trapezoid
		final Trapezoid trap = new Trapezoid(0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0);
		
		//Creating coordinates for Parallelogram
		final Parallelogram para = new Parallelogram(5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0);
		
		//Creating coordinates for Rectangle
		final Rectangle rect = new Rectangle(17.0, 14.0, 30.0, 14.0, 30.0, 28.0, 17.0, 28.0);
		
		//Creating coordinates for Square
		final Square squ = new Square(4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0);
		
		//Output results
		System.out.println("Inheritance Program");
		System.out.println("IT 178");
		System.out.println("Created by: Aaron Gee");
		System.out.println("September 28th 2020");
		System.out.println(quad.toString());
		System.out.println(trap.toString());
		System.out.println(para.toString());
		System.out.println(rect.toString());
		System.out.println(squ.toString());
	}
}
