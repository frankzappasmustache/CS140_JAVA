/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Exercises
    File Name: QuadraticEquations.java
    Author: Dustin McClure
    Lab: Exercise 8
    Modified Date: 05/08/2021
*/
import java.util.Scanner;

public class QuadraticEquations
{
    public static void main(String[] args)
    {
        int a;
        int b;
        int c;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value 1: ");
        a = input.nextInt();

        System.out.println("Enter value 2: ");
        b = input.nextInt();

        System.out.println("Enter value 3: ");
        c = input.nextInt();

        quadratic(a, b, c);
    }

    public static void quadratic(int a, int b, int c)
    {
        double discriminant = Math.sqrt(b *b - 4 * a * c);
        double xOne = (-b + discriminant) / (2 * a);
        double xTwo = (-b - discriminant) / (2 * a);

        System.out.printf("The first root is: %.2f\n", xOne);
        System.out.printf("The second root is: %.2f\n", xTwo);
    }
}
