/*
 *File name: HotelApp.java
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

import java.util.Scanner;
/**
 * <insert class description here>
 *
 *@author Aaron Gee
 *
 */
public class HotelApp
{

	/**
	 * @param args
	 */
	private static void selectRoom(Room room1, Room room2, Room room3, RoomReservation myReservation)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("*******************************************");
		System.out.println("****Welcome to The Best Bed & Breakfast****");
		System.out.println("*******************************************");
		System.out.println("\nCurrently we have these rooms available:");
		System.out.println(room1.toString());
		System.out.println(room2.toString());
		System.out.println(room3.toString());
		System.out.print("Please type in the room number you would like to reserve: ");
		int roomSelection = keyboard.nextInt();
		
		//Create a reservation in RoomReservation class with selected room
		//from available rooms that were made in the Room class
		myReservation.setRoomNumber(roomSelection);
		
		//To set roomPrice find roomPrice that matches the room object that was chose
		if (roomSelection == room1.getRoomNumber())
		{
			myReservation.setRoomPrice(room1.getRoomPrice());
		}
		else if (roomSelection == room2.getRoomNumber())
		{
			myReservation.setRoomPrice(room2.getRoomPrice());
		}
		else if (roomSelection == room3.getRoomNumber())
		{
			myReservation.setRoomPrice(room3.getRoomPrice());
		}
		System.out.println("\n**************************************");
		System.out.println("You have selected room number "+ roomSelection);
	}
	
	private static void selectExtras(RoomReservation myReservation)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("\nWould you like to add breakfast? (Y/N): ");
		char breakfastSelected = keyboard.next().charAt(0);
		myReservation.setBreakfastSelected(breakfastSelected);
		System.out.print("Would you like to add a crib? (Y/N): ");
		char cribSelected = keyboard.next().charAt(0);
		myReservation.setCribSelected(cribSelected);
		System.out.print("Would you like to add late checkout? (Y/N): ");
		char lateCheckoutSelected = keyboard.next().charAt(0);
		myReservation.setLateCheckoutSelected(lateCheckoutSelected);
		
		keyboard.close();
	}
	
	private static void printReservation(RoomReservation myReservation)
	{
		System.out.println(myReservation.toString());
	}
	public static void main(String[] args)
	{
		//Making room object for available rooms
		Room room1 = new Room(101, 6, 3, 2, 350);
		Room room2 = new Room(103, 4, 2, 1, 200);
		Room room3 = new Room(204, 2, 1, 1, 150);
		
		//Create new reservation in RoomReservation class
		RoomReservation myReservation = new RoomReservation();
		
		//Prompt user on what rooms are available, and to choose a room
		selectRoom(room1, room2, room3, myReservation);
		
		//Ask user if the will need breakfast, crib, or late checkout
		selectExtras(myReservation);
		
		//Calculate The total before tax
		myReservation.setPreTaxTotal();
		
		//Calculate the total cost of reservation
		myReservation.setTotalPrice();
		
		//Print out Receipt
		printReservation(myReservation);
	}

}
