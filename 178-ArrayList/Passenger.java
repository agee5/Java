package edu.ilstu;

public class Passenger {

	private String name;
	private String cruiseName;
	private String roomType;
	
	public Passenger ()
	{
		
	}
	
	public Passenger (String name, String cruiseName, String roomType)
	{
		this.name = name;
		this.cruiseName = cruiseName;
		this.roomType = roomType;
	}
	
	public void setName (String name)
	{
		this.name = name;
	}
	
	public void setCruiseName (String cruiseName)
	{
		this.cruiseName = cruiseName;
	}
	
	public void setRoomType (String RoomType)
	{
		this.roomType = roomType;
	}
	
	public String getName ()
	{
		return name;
	}
	
	public String getCruiseName ()
	{
		return cruiseName;
	}
	
	public String getRoomType ()
	{
		return roomType;
	}
	
	public String printPassenger ()
	{
		return String.format("%-24s%-18s%-5s", name, cruiseName, roomType);
	}
	
	public String toString ()
	{
		return name;
	}
}
