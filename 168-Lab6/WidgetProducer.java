package edu.ilstu;

public class WidgetProducer
{
	private double widgetsPerHour = 0;
	public static final double PRODUCTION_HOURS_PER_DAY = 16;
	
	public WidgetProducer(double widgets)
	{
		widgetsPerHour = widgets;
	}
	
	public double getWidgetsPerHour()
	{
		return widgetsPerHour;
	}
	
	public double calculateDaysToProduce(double widgets)
	{
		//Divide number of widget by how many can be produced per hour, and then by 16 because there are 16 work hours
		double daysToProduce = (widgets / widgetsPerHour) / PRODUCTION_HOURS_PER_DAY;
		return daysToProduce;
	}

}
