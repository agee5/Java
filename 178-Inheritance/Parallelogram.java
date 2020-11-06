package edu.ilstu;

public class Parallelogram extends Trapezoid 
{
	public Parallelogram (final double x1, final double y1, final double x2, final double y2, final double x3, final double y3, final double x4, final double y4)
	{
		super (x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	public double getWidth ()
	{
		return width;
	}
	
	public double area ()
	{
		return width * height;
	}
	
	public String toString ()
	{
		//Output coordinates of Parallelogram
		return "\nCoordinates of Parallelogram are: \n" + super.getCoordinatesAsString() + "\nWidth is: " + width + "\nHeight is: " + height + "\nArea is: " + area();
	}
}
