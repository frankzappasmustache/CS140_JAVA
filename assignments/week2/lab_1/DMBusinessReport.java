/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Lab 1
    File Name: DMBusinessReport.java
    Author: Dustin McClure
    Lab: Business Report
    Modified Date: 04/20/2021
    
    A program that obtains the month and current
    Monday from the user, asks them about three
    tasks they would like to complete on that
    Monday, asks how much time they would like
    to allot for each task, and then prints 
    out an agenda for them.
*/
import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class DMBusinessReport
{
    // method main begins execution
    public static void main(String[] args)
    {
        int weekStartingDay; // declare int
        double allottedTime1; // declare double
        double allottedTime2; // declare double
        double allottedTime3; // declare double
        String month = ""; // declare string month
        String taskOne = ""; // declare string taskOne
        String taskTwo = ""; // declare string taskTwo
        String taskThree = ""; // declare string taskThree
        
        System.out.println("Monday's Agenda");
        System.out.print("=============\n");
        
        Scanner input = new Scanner(System.in); // create new scanner object, instantiate, and initialize
        
        // Ask for month and day, use newly created scanner object to 
        // store the input in it's corresponding variable, and use
        // these to print a header for the agenda program
        System.out.println("Please enter the month(e.g January) for which you wish to create an agenda:\n");
        
        month = input.next();
        
        System.out.println("Please enter the starting Monday (e.g. 19) for the week you wish to create an agenda:\n");
        
        weekStartingDay = input.nextInt();
        
        System.out.printf("Monday's Agenda for: %s %d%n", month, weekStartingDay);
        
        // Ask user for three tasks and the time they would like to allot to each task;
        // storing the input in its corresponding variable with scanner object methods
        // next and nextDouble
        System.out.printf("Please enter task one for Monday the %dth: \n", weekStartingDay);
        
        taskOne = input.next();
        
        System.out.println("Please enter the amount of time you would like to alot in hours(e.g. 4.0 or 4.2): ");
        
        allottedTime1 = input.nextDouble();
        
        System.out.printf("Please enter task two for Monday the %dth: \n", weekStartingDay);
        
        taskTwo = input.next();
        
        System.out.println("Please enter the amount of time you would like to alot in hours(e.g. 4.0 or 4.2): ");
        
        allottedTime2 = input.nextDouble();
        
        System.out.printf("Please enter task three for Monday the %dth: \n", weekStartingDay);
        
        taskThree = input.next();
        
        System.out.println("Please enter the amount of time you would like to alot in hours(e.g. 4.0 or 4.2): ");
        
        allottedTime3 = input.nextDouble();
        
        // Print a formatted table using the information collected above
        System.out.println("\t\t\tMonday's Agenda will look like this for you:\n");
        
        System.out.println("||=================================================================||");
        
        System.out.printf("||\t\t\t\tHours allotted for %s: %.1f%n", taskOne, allottedTime1);
        
        System.out.println("||=================================================================||");
        
        System.out.printf("||\t\t\t\tHours allotted for %s: %.1f%n", taskTwo, allottedTime2);
        
        System.out.println("||=================================================================||");
        
        System.out.printf("||\t\t\t\tHours allotted for %s: %.1f%n", taskThree, allottedTime3);
        
        System.out.println("||=================================================================||");
        
    } // end method main
    
} // end class DMBusinessReport