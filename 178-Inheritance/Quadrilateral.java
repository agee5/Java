package edu.ilstu;

public class Quadrilateral 
{
	private Point p1, p2, p3, p4;
	
	public Quadrilateral (final double x1, final double y1, final double x2, final double y2, final double x3, final double y3, final double x4, final double y4)
	{
		this.p1 = new Point (x1, y1);
		this.p2 = new Point (x2, y2);
		this.p3 = new Point (x3, y3);
		this.p4 = new Point (x4, y4);
	}
	
	//Setters and Getters
	public void setP1 (final Point p1)
	{
		this.p1 = p1;
	}
	
	public void setP2 (final Point p2)
	{
		this.p2 = p2;
	}
	
	public void setP3 (final Point p3)
	{
		this.p3 = p3;
	}
	
	public void setP4 (final Point p4)
	{
		this.p4 = p4;
	}
	
	public Point getP1 ()
	{
		return p1;
	}
	
	public Point getP2 ()
	{
		return p2;
	}
	
	public Point getP3 ()
	{
		return p3;
	}
	
	public Point getP4 ()
	{
		return p4;
	}
	
	public String getCoordinatesAsString ()
	{
		return p1 + ", " + p2 + ", " + p3 + ", " + p4;
	}
	
	public String toString ()
	{
		return "\nCoordinates of Quadrilateral are: \n" + getCoordinatesAsString();
	}
	
	
}
