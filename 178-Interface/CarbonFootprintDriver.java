package edu.ilstu;

import java.util.ArrayList;

public class CarbonFootprintDriver 
{

    public static void main(String[] args) 
    {
        ArrayList<CarbonFootprint> array = new ArrayList<>();
        
        Bicycle bc = new Bicycle();
        array.add(bc);
        
        Building b1 = new Building(2500, true, false, true, true);
        array.add(b1);
        
        Car c1 = new Car(10);
        array.add(c1);
        
        Building b2 = new Building(1000, false, true, false, false);
        array.add(b2);
        
        Car c2 = new Car(40.60);
        array.add(c2);
        
        System.out.println("Interface Program");
		System.out.println("IT 178");
		System.out.println("Created by: Aaron Gee");
		System.out.println("October 5th 2020\n");
		
		
        for (CarbonFootprint carbonFootprint : array) 
        {
            System.out.println( "Carbon Footprint of " + carbonFootprint.getName() + " is  " +  carbonFootprint.getCarbonFootprint());
            System.out.println("");
        }   
        
    }
    
}

