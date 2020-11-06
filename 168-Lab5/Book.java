/*
 *File name: Book.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Feb 11, 2020
 *
 *Class: IT 168
 *Lecture Section: 01
 *Lecture Instructor: Dr. Fang
 *Lab Section: 02
 *Lab Instructor: Allan Buckley
 */
package edu.ilstu;

/**
 * Book
 *
 *@author Aaron Gee
 *
 */
public class Book {

	final private double SALES_TAX;
	private String bookTitle;
	private double bookPrice;
	private double totalSales;
	
	public Book(double st, String title, double price)
	{
		SALES_TAX = st;
		bookTitle = title;
		bookPrice = price;
	}
	
	public double getSalesTax()
	{
		return SALES_TAX;
	}
	
	public String getTitle()
	{
		return bookTitle;
	}
	
	public double getPrice()
	{
		return bookPrice;
	}
	
	public double calculateSales(double numOfBooks)
	{
		double saleBeforeTax = bookPrice * numOfBooks;
		totalSales = (saleBeforeTax * SALES_TAX) + saleBeforeTax;
		return totalSales;
		
	}
	
	public void increasePrice(double p)
	{
		bookPrice = (bookPrice * p) + bookPrice;
	}
}
