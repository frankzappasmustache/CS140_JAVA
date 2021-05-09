/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Exercises
    File Name: CircleArea.java
    Author: Dustin McClure
    Lab: Exercise 10
    Modified Date: 05/08/2021
*/
import java.util.Scanner;

public class CircleArea
{
    public static void main(String[] args)
    {
        double a;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle: ");
        a = input.nextDouble();

        area(a);
    }

    public static void area(double radius)
    {
        double circArea = Math.PI * (radius * radius);
        System.out.print("The area of this circle is: " + circArea);
    }
}
