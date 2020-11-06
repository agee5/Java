package edu.ilstu;

public class Car implements CarbonFootprint
{

    private double gallons;
    final private double co = 20;

    public Car(double gallons)
    {
        this.gallons = gallons;
    }
    
    public double getCarbonFootprint() 
    {
        return gallons * co;
    }
    
    public String getName()
	  {
		  return "Car";
	  }
}

