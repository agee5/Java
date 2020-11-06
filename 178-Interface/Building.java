package edu.ilstu;

public class Building implements CarbonFootprint
{

	public double sf = 0;
	final public int wood = 50;
	final public int basement = 20;
	final public int concrete = 47;
	final public int steel = 17;
	
	  public boolean woody = false, basementy = false, concretey = false,
	                 steely = false;

	  public Building(final double sf, boolean woody, boolean basementy, boolean concretey, boolean steely) 
	  {
		  this.sf = sf;
		  this.woody = woody;
		  this.basementy = basementy;
		  this.concretey = concretey;
		  this.steely = steely;
	  }

	  public double getCarbonFootprint() 
	  { 
		  double finalCarbon = 0;
		  
		  if (woody == true)
		  {
			  finalCarbon += wood;
		  }
		  
		  if (basementy == true)
		  {
			  finalCarbon += basement;
		  }
		  
		  if (concretey == true)
		  {
			  finalCarbon += concrete;
		  }
		  
		  if (steely == true)
		  {
			  finalCarbon += steel;
		  }
		  
		  return sf * finalCarbon;
	  }
	  
	  public String getName()
	  {
		  return "Building";
	  }
    
}