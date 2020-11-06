/*
 * Filename:  SwitchErrors.java
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

import java.util.Scanner;

/**
 * <insert class description here> 
 *
 * @author 
 *
 */
public class SwitchErrors
{

	public static void main(String[] args)
	{
		 Scanner keyboard = new Scanner(System.out);
		 
		 System.out.println("Key:  1=blue, 2=red, 3=green");
		 System.out.print("Enter a number and I'll return ");
		 System.out.print(" the corresponding color:  ");
		 
		 number = keyboard.nextInt();
		 
		 switch(number)
		 {
			 case 1:
				 System.out.println("You chose red!");
				 break;
			 case 2:
				 System.out.println("You chose blue!");
				 break;
			 case 3:
				 System.out.println("You chose green!");
		     default:
		    	 System.out.println("Color not available!");
		    	 break;
		 }
	}

}
