/*
 *File name: Room.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Mar 3, 2020
 *
 *Class: IT 168
 *Lecture Section: 01
 *Lecture Instructor: Dr. Fang
 *Lab Section: 02
 *Lab Instructor: Allan Buckley
 */
package edu.ilstu;

/**
 * Create room object for available rooms
 *
 *@author Aaron Gee
 *
 */
public class Room
{
	private int roomNumber = 0;
	private int capacity = 0;
	private int noOfBeds = 0;
	private int noOfBathrooms = 0;
	private int roomPrice = 0;
	
	public Room(int room, int cap, int beds, int bathrooms, int price)
	{
		roomNumber = room;
		capacity = cap;
		noOfBeds = beds;
		noOfBathrooms = bathrooms;
		roomPrice = price;
	}
	
	public void setRoomNumber(int room)
	{
		roomNumber = room;
	}
	
	public void setCapacity(int cap)
	{
		capacity = cap;
	}
	
	public void setNoOfBeds(int beds)
	{
		noOfBeds = beds;
	}
	
	public void setNoOfBathrooms(int bathrooms)
	{
		noOfBathrooms = bathrooms;
	}
	
	public void setRoomPrice(int price)
	{
		roomPrice = price;
	}
	
	public int getRoomNumber()
	{
		return roomNumber;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public int getNoOfBeds()
	{
		return noOfBeds;
	}
	
	public int getNoOfBathrooms()
	{
		return noOfBathrooms;
	}
	
	public int getRoomPrice()
	{
		return roomPrice;
	}
	
	public String toString()
	{
		return ""+ getRoomNumber() +", "+ getNoOfBeds() +" beds, $"+ getRoomPrice() +"";
	}
}
