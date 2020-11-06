/*
 *File name: WidgetTester.java
 *
 *Programmer: Aaron Gee
 *ULID: agee1
 *
 *Date: Feb 18, 2020
 *
 *Class: IT 168
 *Lecture Section: 01
 *Lecture Instructor: Dr. Fang
 *Lab Section: 02
 *Lab Instructor: Allan Buckley
 */
package edu.ilstu;

/**
 * Used to test WidgetProducer Class
 *
 *@author Aaron Gee
 *
 */
public class WidgetTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		double numOfWidgets = 0;
		double widgetProduction = 0;
		double widgetsPerHour = 0;
		
		//Create first Object with number of widgets = 100, and widgets per hour at 10. Then displaying the calculated results
		numOfWidgets = 100;
		widgetsPerHour = 10;
		WidgetProducer widg1 = new WidgetProducer(widgetsPerHour);
		widgetProduction = widg1.calculateDaysToProduce(numOfWidgets);
		//System.out.println(numOfWidgets +" widgets produced at "+ widgetsPerHour +" per hour will take ", widgetProduction);
		System.out.print(numOfWidgets +" widgets produced at "+ widgetsPerHour +" per hour will take ");
		//Show only 1 decimal place for widget production
		System.out.printf("%.1f", widgetProduction);
		System.out.print(" days");
		
		//Create second Object with number of widgets = 125, and widgets per hour at 5. Then displaying the calculated results
		numOfWidgets = 125;
		widgetsPerHour = 5;
		WidgetProducer widg2 = new WidgetProducer(widgetsPerHour);
		widgetProduction = widg2.calculateDaysToProduce(numOfWidgets);
		System.out.print("\n"+ numOfWidgets +" widgets produced at "+ widgetsPerHour +" per hour will take ");
		System.out.printf("%.1f", widgetProduction);
		//Show only 1 decimal place for widget production
		System.out.print(" days");
		
		//Create third Object with number of widgets = 1000, and widgets per hour at 5. Then displaying the calculated results
		numOfWidgets = 1000;
		widgetsPerHour = 5;
		WidgetProducer widg3 = new WidgetProducer(widgetsPerHour);
		widgetProduction = widg3.calculateDaysToProduce(numOfWidgets);
		System.out.print("\n"+ numOfWidgets +" widgets produced at "+ widgetsPerHour +" per hour will take ");
		System.out.printf("%.1f", widgetProduction);
		//Show only 1 decimal place for widget production
		System.out.print(" days");
	}

}
