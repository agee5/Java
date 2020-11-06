/*
 * File name: CDDriver.java
 * 
 * Programmer: 
 * ULID:
 *
 * Date:  
 *
 * Class: 
 * Lecture Section:
 * Lecture Instructor:
 * Lab Section:
 * Lab Instructor:  
 */
package edu.ilstu;

import java.io.IOException;
import java.util.Scanner;

/**
 * <insert class description here>
 *
 * @author 
 *
 */
public class CDDriver 
{

	public static void main(String[] args) throws IOException 
	{
		Scanner keyboard = new Scanner(System.in);
		final int MAX_ARRAY_SIZE = 50;
		final String FILENAME = "Collection.txt";
		
		int	count = 0;  // Counter to keep track of number of elements in the array
		int choice = 0; // Menu choice
		
		// Create array to hold song collection
		String songCollection[] = new String[100];
		// Create TextMenu object for menu (this may involve writing multiple lines of code)
		String menuItems[] = new String[3];
		menuItems[0] = "Add a new CD";
		menuItems[1] = "Display the list";
		menuItems[2] = "Quit";
		TextMenu menu = new TextMenu(menuItems);
		
		
		// Read the data from the input file into the array
		// Count the elements currently in the array 
		Song song1 = new Song("Ode to Joy", "Bach");
		Song song2 = new Song("The Sleeping Beauty", "Tchaikovsky");
		Song song3 = new Song("Lullaby", "Brahms");
		Song song4 = new Song("Canon", "Bach");
		Song song5 = new Song("Symphony No. 5", "Bethoven");
		Song song6 = new Song("The Blue Danube Walts", "Strauss");
	
		// Get the menu choice
		choice = menu.getChoice(keyboard);
		
		while (choice != 3)
		{
			switch (choice)
			{
				case 1:
					// Read data for new song to add to the collection from the keyboard
					
					// Add the song to the array 
					// Don't forget to increment the count
					System.out.println("Please enter the title of the song:");
					String title = keyboard.nextLine();
					System.out.println(title);
					choice = 3;
					
					
					// Add the song to the file
					
					
					break;
				case 2:
					// Print the list
					System.out.println(song1.toString());
					System.out.println(song2.toString());
					System.out.println(song3.toString());
					System.out.println(song4.toString());
					System.out.println(song5.toString());
					System.out.println(song6.toString());
					choice = 3;
					break;
				default:
					System.out.println("Invalid menu choice.  Please try again.");
			}
			
			
			// Get the menu choice
			choice = menu.getChoice(keyboard);
			
		}
		
		
		
		
	}

}
