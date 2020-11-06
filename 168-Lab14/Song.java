/*
 *File name: Song.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Apr 27, 2020
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
public class Song
{
	private String title;
	private String artist;
	
	public Song(String title, String artist)
	{
		this.title = title;
		this.artist = artist;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setArtist(String artist)
	{
		this.artist = artist;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getArtist()
	{
		return artist;
	}
	public String toString()
	{
		return title +" by "+ artist;
	}

}
