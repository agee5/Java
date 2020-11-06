package edu.ilstu;

import java.util.Scanner;

public class Maze 
{
	static Scanner keyboard = new Scanner(System.in);
	static boolean run = false;
	static int r = 0;
	static int c = 0;
	static char x = 'X';
	static char[][] maze = new char[][] {
	      {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
	      {'#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
	      {' ', ' ', '#', ' ', '#', ' ', '#', '#', '#', '#', ' ', '#'},
	      {'#', '#', '#', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', '#'},
	      {'#', ' ', ' ', ' ', ' ', '#', '#', '#', ' ', '#', ' ', ' '},
	      {'#', '#', '#', '#', ' ', '#', ' ', '#', ' ', '#', ' ', '#'},
	      {'#', ' ', ' ', '#', ' ', '#', ' ', '#', ' ', '#', ' ', '#'},
	      {'#', '#', ' ', '#', ' ', '#', ' ', '#', ' ', '#', ' ', '#'},
	      {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#'},
	      {'#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', ' ', '#'},
	      {'#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', '#'},
	      {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}};

	public static void print()
	{
		for (int i = 0; i < maze.length; i++)
		{
			for (int j = 0; j < maze[i].length; j++)
			{
				System.out.printf(" " + maze[i][j]);
			}
			
			System.out.println();
		}
	}
	
	public static boolean trav (int r, int c)
	{
		if ((r >= 0 && r <= 11 && c >= 0 && c <= 11) && maze[r][c] == ' ') 
		{
		      return true;
		} 
		else if ((r == 0 || r == 11 || c == 0 || c == 11) && maze[r][c] == x) 
		{
		      System.out.println("\nMaze successfully exited!\n");
		      return run = true;
		} 
		else
		{
			return false;
		}
	}
	
	public static void back (int count, int r, int c) 
	{
	    while (count >= 2) 
	    {
	      if (maze[r][c] == x)
	      {
	        maze[r][c] = ' ';
	      }
	      back(count - 1, r, c);
	    }
	}
	
	public static void mTrav(int r, int c) 
	{
	    char yn;
	    int count = 0;

	    do 
	    {
	      maze[r][c] = x;
	      print();
	      
	      System.out.print("\nEnter 'y' to continue, 'n' to exit: ");
	      
	      yn = keyboard.nextLine().toLowerCase().charAt(0);
	      if (yn == 'y') {
	        if (trav(r + 1, c)) 
	        {
	          mTrav(r + 1, c);
	          count++;
	        } 
	        else if (trav(r - 1, c)) 
	        {
	          mTrav(r - 1, c);
	          count++;
	        } 
	        else if (trav(r, c + 1)) 
	        {
	          mTrav(r, c + 1);
	          count++;
	        } 
	        else if (trav(r, c - 1)) 
	        {
	          mTrav(r, c - 1);
	          count++;
	        } 
	        else if (!trav(r, c)) 
	        {
	          back(count, r, c);
	        }
	      } 
	      else if (yn == 'n') 
	      {
	        run = true;
	        System.out.println("\nWhy you say no :(");
	      } 
	      else 
	      {
	        System.out.println("\nPlease try again!!!");
	        keyboard.nextLine();
	      }
	    } 
	    while (!run);
	  }
	
	public static void main(String[] args) 
	{
		System.out.println("Recursion Program");
		System.out.println("IT 178");
		System.out.println("Created by: Aaron Gee");
		System.out.println("October 13th 2020\n");
	    mTrav(2, 0);
	}
}
