/*
 *File name: Person.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Mar 28, 2020
 *
 *Class: IT 168
 *Lecture Section: 01
 *Lecture Instructor: Dr. Fang
 *Lab Section: 02
 *Lab Instructor: Allan Buckley
 */
package edu.ilstu;

/**
 * <insert class description here>
 *
 *@author Aaron Gee
 *
 */
public class Person
{
	private String firstName;
	private String lastName;
	private int age = 0;
	
	public Person(String fName, String lName, int myAge)
	{
		firstName = fName;
		lastName = lName;
		age = myAge;
	}
	
	public void setFirstName(String fName)
	{
		firstName = fName;
	}
	
	public void setLastName(String lName)
	{
		lastName = lName;
	}
	
	public void setAge(int myAge)
	{
		age = myAge;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}

	public int getAge()
	{
		return age;
	}
	
	public String toString()
	{
		return firstName +" "+ lastName +", "+ age +" years old";
	}
	
	public String equals(String fName1, String fName2, String lName1, String lName2)
	{
		if (fName1.equals(fName2) && lName1.equals(lName2))
		{
			return "have the same name";
		}
		else
		{
			return "have different names";
		}
	}
}
