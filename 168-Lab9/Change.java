/*
 *  Filename:  Change.java
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

/**
 * Holds the value of change
 *
 * @author Cathy Holbrook
 *
 */
public class Change {
	private int dollars;
	private int quarters;
	private int dimes;
	private int nickels;
	private int pennies;
	
	/**
	 * @return the dollars
	 */
	public int getDollars() {
		return dollars;
	}
	/**
	 * @param dollars the dollars to set
	 */
	public void setDollars(int dollars) {
		this.dollars = dollars;
	}
	/**
	 * @return the quarters
	 */
	public int getQuarters() {
		return quarters;
	}
	/**
	 * @param quarters the quarters to set
	 */
	public void setQuarters(int quarters) {
		this.quarters = quarters;
	}
	/**
	 * @return the dimes
	 */
	public int getDimes() {
		return dimes;
	}
	/**
	 * @param dimes the dimes to set
	 */
	public void setDimes(int dimes) {
		this.dimes = dimes;
	}
	/**
	 * @return the nickels
	 */
	public int getNickels() {
		return nickels;
	}
	/**
	 * @param nickels the nickels to set
	 */
	public void setNickels(int nickels) {
		this.nickels = nickels;
	}
	/**
	 * @return the pennies
	 */
	public int getPennies() {
		return pennies;
	}
	/**
	 * @param pennies the pennies to set
	 */
	public void setPennies(int pennies) {
		this.pennies = pennies;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "dollars = " + dollars + "\nquarters = " + quarters
				+ "\ndimes = " + dimes + "\nnickels = " + nickels + "\npennies = "
				+ pennies;
	}
	
	
	

}
