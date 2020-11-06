/*
 *File name: Student.java
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

import java.util.Scanner;

/**
 * Student class to be used in Student Management System
 *
 *@author Aaron Gee
 *
 */
public class Student
{
	public static final double NUMBER_OF_ASSIGNEMENTS = 5;
	public static final double NUMBER_OF_EXAMS = 2;
	
	private int studentID = 0;
	private String firstName;
	private String lastName;
	private String address;
	private double assignmentTotal = 0;
	private double examAverage = 0;
	private double totalGrade = 0;
	private int assignGrades[] = new int[5];
	private int examGrades[] = new int[2];
	
	
	public Student(int studentID, String firstName, String lastName, String address)
	{
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public void setAssignmentGrades()
	{
		Scanner keyboard = new Scanner(System.in);
		
		//Loop to input all 5 assignment grades for student object
		for(int i = 0; i <= 4; i++)
		{
			System.out.print("\nPlease enter the grade for assignment number "+ (i + 1) +": ");
			int assignGrade = keyboard.nextInt();
			//Assigns what the user input as a part of an array to keep track of assignment grades
			assignGrades[i] = assignGrade;
		}
		
	}
	
	public void setExamGrades()
	{
		Scanner keyboard = new Scanner(System.in);
		
		for(int i = 0; i <= 1; i++)
		{
			System.out.print("\nPlease enter the grade for Exam number "+ (i + 1) +": ");
			int examGrade = keyboard.nextInt();
			examGrades[i] = examGrade;
		}
	}
	
	public int getStudentID()
	{
		return studentID;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void getAssignmentGrades()
	{
		//Loop to output all assignment grades to user
		for(int i = 0; i <= 4; i++)
		{
			System.out.println("Grade for assignment "+ (i + 1) +" was: "+ assignGrades[i]);
		}
	}
	
	public void getExamGrades()
	{
		//Loop to output all exam grades to user
		for(int i = 0; i <= 1; i++)
		{
			System.out.println("Grade for Exam "+ (i + 1) +" was: "+ examGrades[i]);
		}
	}
	
	public double calculateAssignmentTotal()
	{	
		//Loop used to calculate to total of all assignments
		for(int i = 0; i < assignGrades.length; i++)
		{
			assignmentTotal = assignmentTotal + assignGrades[i];
		}
		
		return assignmentTotal;
	}
	
	public double examAverage()
	{
		//Loop to calculate the average of the 2 Exam grades
		for(int i = 0; i < examGrades.length; i++)
		{
			examAverage = examAverage + examGrades[i];
		}
		
		examAverage = examAverage / examGrades.length;
		
		return examAverage;
	}
	
	public double totalGrade()
	{
		//Calculates the total grade
		totalGrade = assignmentTotal + examAverage;
		
		return totalGrade;
	}
	
	public String toString()
	{
		return "\nStudent ID: "+ studentID +"\n\nStudent Name: "+ firstName +" "+ lastName +"\n\nAssignments Total: "+ assignmentTotal +"\n\nExam Average: "+ examAverage +"\n\nTotal Grade: "+ totalGrade;
	}

}
