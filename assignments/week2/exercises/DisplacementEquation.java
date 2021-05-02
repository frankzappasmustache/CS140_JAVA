/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Chapter 2
    File Name: DisplacementEquation.java
    Author: Dustin McClure
    Lab: Excercise 1
    Modified Date: 04/19/2021
    
    Implementation for chapter 2 exercise 1, which
    calculates the displacement of a body in linear
    motion at a given time by declaring variables for
    position, initial velocity, rate of acceleration,
    and time; using those to solve for position.
*/
import java.util.Scanner;

public class DisplacementEquation
{
    // method main begins execution
    public static void main(String[] args)
    {
        double s0 = 0.0;
        double v0 = 0.0;
        double a = 0.0;
        double t = 0.0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter all numbers as doubles with\none decimal after the decimal point\n\n====> EXAMPLE: 5.0\n");
        
        System.out.println("Please enter number for initial position: ");
        
        s0 = input.nextDouble();
        
        System.out.println("Please enter number for number for initial velocity: ");
        
        v0 = input.nextDouble();
        
        System.out.println("Please enter number for rate of acceleration: ");
        
        a = input.nextDouble();
        
        System.out.println("Please enter number for time in hours: ");
        
        t = input.nextDouble();
        double s = s0 + v0 * t + 0.5 * a * t * t;
        System.out.println("The current position of this body is " +  s + ".");
    } // end method main
} // end class DisplacementEquation
