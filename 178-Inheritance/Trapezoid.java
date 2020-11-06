package edu.ilstu;

import java.text.DecimalFormat;

public class Trapezoid extends Quadrilateral
{
	public double height;
	public double width;
	private double side2;
	
	public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
	{
		super(x1,y1,x2,y2,x3,y3,x4,y4);
		
		//Get height of Trapezoid
		height = getP4().getY() - getP1().getY();
		//Get width of Trapezoid
		width = getP2().getX() - getP1().getX();
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public double getSumofTwoSides()
	{
		//Calculate the length of two sides
		side2 = getP3().getX() - getP4().getX();
		return width + side2;
	}
	
	public double getArea()
	{
		return getSumofTwoSides() * height / 2;
	}
	
	public String toString()
	{
		DecimalFormat df = new DecimalFormat(".0#");
		return "\nCoordinates of Trapezoid are: \n" + super.getCoordinatesAsString() + "\nHeight is: " + df.format(height) + "\nArea is: " + df.format(getArea());
	}
}
