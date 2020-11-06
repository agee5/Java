/*
 *File name: Country.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Apr 29, 2020
 *
 *Class: IT 168
 *Lecture Section: 01
 *Lecture Instructor: Dr. Fang
 *Lab Section: 02
 *Lab Instructor: Allan Buckley
 */
package edu.ilstu;

/**
 * Creates a Country object for all countries listed is .csv file
 *
 *@author Aaron Gee
 *
 */
public class Country
{
	private String name;
	private int employmentRate = 0;
	private double jobSecurity = 0;
	private double lifeExpectancy = 0;
	private int personalEarnings = 0;
	
	public Country(String name, int employmentRate, double jobSecurity, double lifeExpectancy, int personalEarnings)
	{
		this.name = name;
		this.employmentRate = employmentRate;
		this.jobSecurity = jobSecurity;
		this.lifeExpectancy = lifeExpectancy;
		this.personalEarnings = personalEarnings;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getEmploymentRate()
	{
		return employmentRate;
	}
	
	public double getJobSecurity()
	{
		return jobSecurity;
	}
	
	public double getLifeExpectancy()
	{
		return lifeExpectancy;
	}
	
	public int getPersonalEarnings()
	{
		return personalEarnings;
	}
	
	public String toString()
	{
		//return name + "\t\t"+ employmentRate +"\t"+ jobSecurity +"\t"+ lifeExpectancy +"\t"+ personalEarnings;
		return String.format("%-33s%-16s%-22s%-21s%-20s", name, employmentRate, jobSecurity, lifeExpectancy, personalEarnings);
	}

}
