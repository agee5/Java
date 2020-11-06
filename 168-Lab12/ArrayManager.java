package edu.ilstu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * <insert class description here>
 * @author Mary Elaine Califf and 
 *
 */
public class ArrayManager
{
 // declare instance variables here
    
    public  void fillArray()
    {
    	int arr[] = new int[100];
        int curVal;
        
        Scanner input = null;
        try
        {
            input = new Scanner(new File("data.txt"));
            // set the current number of items in the array to zero
            while (input.hasNextInt())
            {
                curVal = input.nextInt();
                // add code to store curVal into the array and update other information as needed
            }
            input.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Could not find data.txt file");
            System.exit(1);
        }
    }
    
    }

