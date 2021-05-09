/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Exercises
    File Name: ScientificExponent.java
    Author: Dustin McClure
    Lab: Exercise 12
    Modified Date: 05/08/2021
*/
import java.util.Scanner;

public class ScientificExponent
{
    public static void main(String[] args)
    {
        double a;
        int b;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the base number(e.g 6.77): ");
        a = input.nextDouble();

        System.out.println("Please enter the exponent(e.g. 10): ");
        b = input.nextInt();

        scientific(a, b);

    }

    public static void scientific(double a, int b)
    {
        double c = a * Math.pow(10, b);
        System.out.printf("The base times 10 to the exponent is: %f", c);
    }
}
