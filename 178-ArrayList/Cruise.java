package edu.ilstu;

public class Cruise {

	private String cruiseName;
	private String shipName;
	private String departPort;
	private String destination;
	private String returnPort;
	
	public Cruise ()
	{
		
	}
	
	public Cruise (String cruiseName, String shipName, String departPort, String destination, String returnPort)
	{
		this.cruiseName = cruiseName;
		this.shipName = shipName;
		this.departPort = departPort;
		this.destination = destination;
		this.returnPort = returnPort;
	}
	
	public void setCruiseName (String cruiseName)
	{
		this.cruiseName = cruiseName;
	}
	
	public void setShipName (String shipName)
	{
		this.shipName = shipName;
	}
	
	public void setDepartPort (String departPort)
	{
		this.departPort = departPort;
	}
	
	public void setDestination (String destination)
	{
		this.destination = destination;
	}
	
	public void setReturnPort ( String returnPort)
	{
		this.returnPort = returnPort;
	}
	
	public String getCruiseName ()
	{
		return cruiseName;
	}
	
	public String getShipName ()
	{
		return shipName;
	}
	
	public String getDepartPort ()
	{
		return departPort;
	}
	
	public String getDestination ()
	{
		return destination;
	}
	
	public String getReturnPort ()
	{
		return returnPort;
	}
	
	public String printCruiseDetails ()
	{
		return String.format("%-16s%-16s%-16s%-16s%-20s", cruiseName, shipName, departPort, destination, returnPort);
	}
	
	public String toString ()
	{
		return cruiseName;
	}
}
