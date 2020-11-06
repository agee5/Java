package edu.ilstu;

import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Student class maintains information about a particular student
 *
 * @author Mary Elaine Califf
 */
public class Student
{
    private String name;
    private String major;
    private double gpa;
    private int hoursCompleted;

    /**Default constructor
     *
     */
    public Student()
    {
		super();
    	this.name = "";
    	this.major = "";
    	this.gpa = 0.0;
    	this.hoursCompleted = 0;
    }


    /**Constructor
     * @param name
     *  The student's name
     * @param major
     *  The student's major
     */
    public Student(String name, String major)
    {
		super();
        this.name = name;
        this.major = major;
        this.gpa = 0.0;
        this.hoursCompleted = 0;
    }

    /**Constructor
     * @param name
     *  The student's name
     * @param major
     *  The student's major
     * @param gpa
     *  The student's cumulative gpa
     * @param hoursCompleted
     *  Number of credit hours the student has completed
     */
    public Student(String name, String major, double gpa, int hoursCompleted)
    {
		super();
        this.name = name;
        this.major = major;
        this.gpa = gpa;
        this.hoursCompleted = hoursCompleted;
    }

    /**
     * @return The student's major.
     */
    public String getMajor()
    {
        return this.major;
    }
    /**
     * @param major The major to set.
     */
    public void setMajor(String major)
    {
        this.major = major;
    }
    /**
     * @return The student's name.
     */
    public String getName()
    {
        return this.name;
    }
    /**
     * @param name The name to set.
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * @return The student's gpa.
     */
    public double getGpa()
    {
        return this.gpa;
    }
    /**
     * @return The number of credit hours the student has completed.
     */
    public int getHoursCompleted()
    {
        return this.hoursCompleted;
    }

    /**
     * @return The student's class (Freshman, Sophomore, Junior, Senior)
     */
    public String getClassLevel()
    {
        String classLevel;
        if (this.hoursCompleted < 30)
        {
            classLevel = "Freshman";
        }
        else if (this.hoursCompleted < 60)
        {
            classLevel = "Sophomore";
        }
        else if (this.hoursCompleted < 90)
        {
            classLevel = "Junior";
        }
        else
        {
            classLevel = "Senior";
        }
        return classLevel;
    }

    /**Update student's information to reflect completion of a semester's work
     * @param semHours
     * Number of credit hours the student has just completed
     * @param semGPA
     * GPA for the semester just completed
     */
    public void updateStudent(int semHours, double semGPA)
    {
        int oldHours = this.hoursCompleted;
        this.hoursCompleted = oldHours + semHours;
        this.gpa = (oldHours * this.gpa + semHours * semGPA) / this.hoursCompleted;
    }

    /**Produces a string with information about a student in a nice format with
     *  appropriate labeling
     */
    public String toString()
    {
        DecimalFormat fmt = new DecimalFormat("0.000");
        String myString = this.name + " is a " + getClassLevel() + " "
        	+ this.major + "\n"
        	+ "who has completed " + this.hoursCompleted + " hours " +
        	"with a " + fmt.format(this.gpa) + " gpa.\n";
        return myString;
    }

    /** Reads student data in file format with name on first line, hours and gpa
     * on second line, and major on third line.
     * @param input
     *   Scanner connected to input source for student information
     */
    public void read(Scanner input)
    {
    	this.name = input.nextLine();
    	this.hoursCompleted = input.nextInt();
    	this.gpa = input.nextDouble();
    	input.nextLine();
    	this.major = input.nextLine();
    }


    /**
     * Prints student information in file format
     * @param output
     *   PrintWriter connected to open output stream
     */
    public void write(PrintWriter output)
    {
    	output.println(this.name);
    	output.println(this.hoursCompleted + " " + this.gpa);
    	output.println(this.major);
    }
}
