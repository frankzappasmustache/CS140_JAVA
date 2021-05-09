/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Exercises
    File Name: VolumeSphere.java
    Author: Dustin McClure
    Lab: Exercise 15
    Modified Date: 05/08/2021
*/
import java.util.Scanner;

public class VolumeSphere
{
    public static void main(String[] args)
    {
        double radius;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle for which you would like to calculate volume: ");
        radius = input.nextDouble();

        sphereVolume(radius);

    }

    public static void sphereVolume(double radius)
    {
        double volume = (4.0 / 3) * Math.PI * radius * radius * radius;
        System.out.printf("The volume of this sphere is : %f", volume);
    }
}
