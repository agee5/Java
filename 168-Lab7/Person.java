/*
 *File name: Person.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Feb 27, 2020
 *
 *Class: IT 168
 *Lecture Section: 01
 *Lecture Instructor: Dr. Fang
 *Lab Section: 02
 *Lab Instructor: Allan Buckley
 */
package edu.ilstu;

/**
 * Class created to work with driver class of PersonTester
 *
 *@author Aaron Gee
 *
 */
public class Person
{
	private String title = "";
	private String name = "";
	private String gender = "";
	private String maritalStatus = "";
	
	public Person(String myName, String myGender, String marStatus)
	{
		name = myName;
		gender = myGender.toUpperCase();
		maritalStatus = marStatus.toUpperCase();
	}
	
	public void determineTitle()
	{
		if (gender.equals("M"))
		{
			title = "Mr.";
		}
		else if (gender.equals("F")  && maritalStatus.equals("M"))
		{
			title = "Mrs.";
		}
		else
		{
			title = "Miss";
		}
	}
	
	public boolean isValidGender()
	{
		if (gender.equals("M") || gender.equals("F"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isValidMaritalStatus()
	{
		if(maritalStatus.equals("M") || maritalStatus.equals("S"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String myName)
	{
		name = myName.toUpperCase();
	}
	
	public String getGender()
	{
		return gender;
	}

	public void setGender(String myGender)
	{
		gender = myGender.toUpperCase();
	}
	
	public String getMaritalStatus()
	{
		return maritalStatus;
	}
	
	public void setMaritalStatus(String marStatus)
	{
		maritalStatus = marStatus.toUpperCase();
	}
}
