package edu.ilstu;

public class Ship {
	
	private String shipName;
	private int noOfBalcRooms = 0;
	private int noOfOVRooms = 0;
	private int noOfSuites = 0;
	private int noOfIntRooms = 0;
	boolean inService;
	
	public Ship (String shipName, int noOfBalcRooms, int noOfOVRooms, int noOfSuites, int noOfIntRooms, boolean inService)
	{
		this.shipName = shipName;
		this.noOfBalcRooms = noOfBalcRooms;
		this.noOfOVRooms = noOfOVRooms;
		this.noOfSuites = noOfSuites;
		this.noOfIntRooms = noOfIntRooms;
		this.inService = inService;
	}
	
	public void setShipName (String shipName)
	{
		this.shipName = shipName;
	}
	
	public void setNoOfBalcRooms (int noOfBalcRooms)
	{
		this.noOfBalcRooms = noOfBalcRooms;
	}
	
	public void setNoOfOVRooms (int noOfOVRooms)
	{
		this.noOfOVRooms = noOfOVRooms;
	}
	
	public void setNoOfSuites (int noOfSuites)
	{
		this.noOfSuites = noOfSuites;
	}
	
	public void setNoOfIntRooms (int noOfIntRooms)
	{
		this.noOfIntRooms = noOfIntRooms;
	}
	
	public void setInService (boolean inService)
	{
		this.inService = inService;
	}
	
	public String getShipName ()
	{
		return shipName;
	}
	
	public int getNoOfBalcRooms ()
	{
		return noOfBalcRooms;
	}
	
	public int getNoOfOVRooms ()
	{
		return noOfOVRooms;
	}
	
	public int getNoOfSuites ()
	{
		return noOfSuites;
	}
	
	public int getNoOfIntRooms ()
	{
		return noOfIntRooms;
	}
	
	public boolean getInService ()
	{
		return inService;
	}
	
	public String printShipData ()
	{
		return String.format("%-16s%-5s%-5s%-5s%-9s%-5b", shipName, noOfBalcRooms, noOfOVRooms, noOfSuites, noOfIntRooms, inService);
	}
	
	public String toString ()
	{
		return shipName;
	}
}
