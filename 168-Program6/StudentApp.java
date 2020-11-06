/*
 *File name: StudentApp.java
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
 * Student management system
 *
 *@author Aaron Gee
 *
 */
public class StudentApp
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//Create Address and Student objects
		Address addr1 = new Address(1136, "Pomona Drive", "Champaign", "Illinois", 61822);
		Student stu1 = new Student(1, "Aaron", "Gee", addr1.toString());
		Address addr2 = new Address(550, "West State Street", "Lovington", "Illinois", 61937);
		Student stu2 = new Student(2, "AJ", "Gee", addr2.toString());
		Address addr3 = new Address(100, "North University Street", "Normal", "Illinois", 61761);
		Student stu3 = new Student(3, "Billy Bob", "Joe", addr3.toString());
		
		System.out.println("Welcome to our Student Management System");
		
		//Run the menu method
		menu(stu1, stu2, stu3, addr1, addr2, addr3);

	}
	
	public static void menu (Student stu1, Student stu2, Student stu3, Address addr1, Address addr2, Address addr3)
	{
		Scanner keyboard = new Scanner(System.in);
		boolean enterValue = true;
		
		//Loop until user inputs proper value, or until the user types 5
		while (enterValue)
		{
			System.out.println("\n****************************************");
			System.out.println("\n****************************************");
			System.out.println("Please select from the options below:");
			System.out.println("\n1. Display a list of all students");
			System.out.println("\n2. Enter the grades for a student");
			System.out.println("\n3. Display the report card for a student");
			System.out.println("\n4. Display the address of a student");
			System.out.println("\n5. Exit the system");
			System.out.print("\nYour selection: ");
			int selection = keyboard.nextInt();
			
			//Checks what user input to decide which method will run
			if(selection == 1)
			{
				//Selection 1 is to display all students
				displayAllStudents(stu1, stu2, stu3);
			}
			else if (selection == 2)
			{
				//Selection 2 is to add grades to a student for assignments and exams
				addGrades(stu1, stu2, stu3);
			}
			else if(selection == 3)
			{
				//Selection 3 displays report card for student, with Assignments total, average exam grade, and total grade
				reportCard(stu1, stu2, stu3);
			}
			else if(selection == 4)
			{
				//Selection 4 displays the address of a student
				displayAddress(stu1, stu2, stu3);
			}
			else if(selection == 5)
			{
				//Selection 5 will exit out of the program
				System.out.println("\nGoodbye!");
				break;
			}
			else
			{
				System.out.println("Please enter a valid number between 1 and 5");
			}
		}
		
	}
	
	public static void displayAllStudents(Student stu1, Student stu2, Student stu3)
	{
		//Displays all students by ID number and name
		System.out.println("\n"+ stu1.getStudentID() +". "+ stu1.getFirstName() +" "+ stu1.getLastName());
		System.out.println("\n"+stu2.getStudentID() +". "+ stu2.getFirstName() +" "+ stu2.getLastName());
		System.out.println("\n"+stu3.getStudentID() +". "+ stu3.getFirstName() +" "+ stu3.getLastName());
	}
	
	public static void addGrades(Student stu1, Student stu2, Student stu3)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("\nPlease enter the ID of the student: ");
		int studentID = keyboard.nextInt();
		
		//Checks to see which student the user would like to add grades for
		if(studentID == stu1.getStudentID())
		{
			//Sets grades for student 1 assignments
			stu1.setAssignmentGrades();
			//Sets grades for student 1 exams
			stu1.setExamGrades();
		}
		else if(studentID == stu2.getStudentID())
		{
			//Sets grades for student 2 assignments
			stu2.setAssignmentGrades();
			//Sets grades for students 2 exams
			stu2.setExamGrades();
		}
		else if(studentID == stu3.getStudentID())
		{
			//Sets grades for student 3 assignments
			stu3.setAssignmentGrades();
			//Sets grades for student 3 exams
			stu3.setExamGrades();
		}
		
	}
	
	public static void reportCard(Student stu1, Student stu2, Student stu3)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("\nPlease enter the ID of the student: ");
		int studentID = keyboard.nextInt();
		
		//Checks which student the user would like to show report card for
		if(studentID == stu1.getStudentID())
		{
			//Calculate total for student 1 assignments
			stu1.calculateAssignmentTotal();
			//Calculate Exam average for student 1
			stu1.examAverage();
			//Calculate total grade for student 1
			stu1.totalGrade();
			//Output to display the report card to user
			System.out.println(stu1.toString());
		}
		else if(studentID == stu2.getStudentID())
		{
			//Calculate total for student 2 assignments
			stu2.calculateAssignmentTotal();
			//Calculate Exam average for student 2
			stu2.examAverage();
			//Calculate total grade for student 2
			stu2.totalGrade();
			//Output to display the report card to user
			System.out.println(stu2.toString());
		}
		else if(studentID == stu3.getStudentID())
		{
			//Calculate total for student 3 assignments
			stu3.calculateAssignmentTotal();
			//Calculate Exam average for student 3
			stu3.examAverage();
			//Calculate total grade for student 3
			stu3.totalGrade();
			//Output to display the report card to user
			System.out.println(stu3.toString());
		}
	}
	
	public static void displayAddress(Student stu1, Student stu2, Student stu3)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("\nPlease enter the ID of the student: ");
		int studentID = keyboard.nextInt();
		
		//Checks which student the user would like to display address of
		if(studentID == stu1.getStudentID())
		{
			//Output student 1 address
			System.out.println("\n"+ stu1.getAddress());
		}
		else if(studentID == stu2.getStudentID())
		{
			//Output student 2 address
			System.out.println("\n"+ stu2.getAddress());
		}
		else if(studentID == stu3.getStudentID())
		{
			//Output student 3 address
			System.out.println("\n"+ stu3.getAddress());
		}
		
	}

}
