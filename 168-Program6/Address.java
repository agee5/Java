/*
 *File name: Address.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Apr 14, 2020
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
public class Address
{
	private int streetNumber;
	private String streetName;
	private String city;
	private String state;
	private int zipCode;
	
	public Address(int streetNumber, String streetName, String city, String state, int zipCode)
	{
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	public void setStreetNumber(int streetNumber)
	{
		this.streetNumber = streetNumber;
	}
	
	public void setStreetName(String streetName)
	{
		this.streetName = streetName;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	public void setZipCode(int zipCode)
	{
		this.zipCode = zipCode;
	}
	
	public int getStreetNumber()
	{
		return streetNumber;
	}
	
	public String getStreetName()
	{
		return streetName;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getState()
	{
		return state;
	}
	
	public int getZipCode()
	{
		return zipCode;
	}
	
	public String toString()
	{
		return streetNumber +" "+ streetName +"\n\n"+ city +", "+ state +" "+ zipCode;
	}

}

