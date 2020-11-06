/*
 *  Filename:  Problem3.java
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
 * Use to test pre-lab 3, problem 3
 *
 * @author Cathy Holbrook
 *
 */
public class Problem3 {
	
	public static void main(String[] args) {				
		String inputString = null;
		String answer = null;
		int variable1 = 0;
		int variable2 = 0;
			
		ControlStructures controlStructure = new ControlStructures();
			
		inputString = JOptionPane.showInputDialog("Problem 3\n\n" +
				"IF variable1 <= variable2 THEN\n" +
				"     PRINT \"true\"\n" + 
				"ELSE\n" +
				"     PRINT \"false\"\n" +
				"ENDIF\n\n" +
				"Enter variable1 value: ");
		if (controlStructure.isNumeric(inputString)){
			variable1 = Integer.parseInt(inputString);
			
			inputString = JOptionPane.showInputDialog("Problem 3\n\n" +
					"IF variable1 <= variable2 THEN\n" +
					"     PRINT \"true\"\n" + 
					"ELSE\n" +
					"     PRINT \"false\"\n" +
					"ENDIF\n\n" +
					"variable1 = " + variable1 + "\n\n" +
					"Enter variable2 value: ");		
			if (controlStructure.isNumeric(inputString)){
				variable2 = Integer.parseInt(inputString);
						
				answer = controlStructure.preLab3(variable1, variable2);
				JOptionPane.showMessageDialog(null,"Problem 3\n\n" +
						"IF variable1 <= variable2 THEN\n" +
						"     PRINT \"true\"\n" + 
						"ELSE\n" +
						"     PRINT \"false\"\n" +
						"ENDIF\n\n" +
						"variable1 = " + variable1 + "\n" + 
						"variable2 = " + variable2 + "\n" +
						"The answer is: " + answer);
					
			} else {
					JOptionPane.showMessageDialog(null, "Invalid input value - you must enter an integer.");
				}
		} else {
			JOptionPane.showMessageDialog(null, "Invalid input value - you must enter an integer.");
		}
	
		
		System.exit(0);
	}

}
