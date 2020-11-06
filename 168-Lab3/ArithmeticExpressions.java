/*
 * Filename:
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

/**
 * Write and test arithmetic expressions
 *
 * @author 
 *
 */
public class ArithmeticExpressions {

	public static void main(String[] args) {
		// Constant declaration
		final int FREEZING = 32;
		final int FACTOR = 703;
		
		
		// Variable declarations and initializations
		double height = 64.5;
		double weight = 125.0;
		int fahrenheit = 78;
		double expected = 89;
		double observed = 78;
		double bmiCalc;
		double celCalc;
		double percOfDif;
		
		
		
		
		// Problem 17
		bmiCalc = weight/(height*height)*FACTOR;
		System.out.println("Your BMI is "+ bmiCalc +".");
		
		// Problem 18
		celCalc = (fahrenheit-FREEZING)*(5.0/9.0);
		System.out.println("The temperature is Fharenheit is "+ fahrenheit +", That converts to "+ celCalc +" in Celcius.");
		
		// Problem 19
		percOfDif = ((expected-observed)/expected)*100.0;
		System.out.println("The percentage of difference is "+ percOfDif +".");
		
		
		
		
	
		
		
	}

}
