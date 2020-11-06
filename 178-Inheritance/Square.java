package edu.ilstu;

import java.text.DecimalFormat;

public class Square extends Parallelogram 
{
	public Square (final double x1, final double y1, final double x2, final double y2, final double x3, final double y3, final double x4, final double y4)
	{
		super (x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	public double area ()
	{
		//Calculate area of square
		return 4 * width;
	}
	
	public String toString ()
	{
		final DecimalFormat df = new DecimalFormat(".0");
		return "\nCoordinates of Square are: \n" + super.getCoordinatesAsString() + "\nSide is: " + df.format(width) + "\nArea is: " + df.format(area());
	}
}
