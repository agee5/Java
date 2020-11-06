/*
 *  Filename:  Problem7.java
 *  
 *  Programmer: Cathy Holbrook
 *  ULID:  cjholbr
 *
 *  Date:  
 *
 *  Class: IT 168
 *
 *  Lecture Section:
 *  Lecture Instructor:
 *  Lab Section: 
 *  Lab Instructor: 
 */
package edu.ilstu;

import javax.swing.JOptionPane;


/**
 * Code for pre-lab problem 7
 *
 * @author Cathy Holbrook
 *
 */
public class Problem7 
{
		
	public static void main(String[] args) 
	{				
		String inputString = null;
		boolean enoughMoney = false;
		int amountOwed = 0;
		int amountPaid = 0;
			
		ControlStructures controlStructure = new ControlStructures();
		Change change = new Change();
					
		inputString = JOptionPane.showInputDialog("Problem 7\n\n" +
					"Enter the amount owed: ");
			if (controlStructure.isNumeric(inputString)){
				amountOwed = Integer.parseInt(inputString);
				
				inputString = JOptionPane.showInputDialog("Enter the amount paid: ");		
				if (controlStructure.isNumeric(inputString)){
					amountPaid = Integer.parseInt(inputString);
							
					enoughMoney = controlStructure.calculateChange(change, amountOwed, amountPaid);
					if (enoughMoney)
					{
						JOptionPane.showMessageDialog(null,
							"amountOwed = " + amountOwed + "\n" + 
							"amountPaid = " + amountPaid + "\n" +
							"The answer is: " + change);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Not enough money paid");
					}
				} 
				else 
				{
					JOptionPane.showMessageDialog(null, "Invalid input value - you must enter an integer.");
				}
			} 
			else 
			{
				JOptionPane.showMessageDialog(null, "Invalid input value - you must enter an integer.");
			}
		
			
			System.exit(0);
	}
}


