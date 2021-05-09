/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Exercises
    File Name: TriAngles.java
    Author: Dustin McClure
    Lab: Exercise 4
    Modified Date: 05/07/2021
    

*/
import java.util.Scanner;

public class TriAngles
{
    public static void main(String[] args)
    {
        double a;
        double b;
        double c;
        double e;
        double f;
        double g;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the length of side one as a double(e.g. 2.00): ");
        a = input.nextDouble();

        System.out.print("Please enter the length of side two as a double(e.g. 2.00): ");
        b = input.nextDouble();

        System.out.print("Please enter the length of side three as a double(e.g. 2.00): ");
        c = input.nextDouble();

        e = (b * b) + (c * c) - (a * a) / 2 * b * c;
        f = (a * a) + (c * c) - (b * b) / 2 * a * c;
        g = (a * a) + (b * b) - (c * c) / 2 * a * b;

        System.out.print("The angles of this triangle are as follows: ");
        System.out.println();
        System.out.printf("A: %.2f\n", e);
        System.out.printf("B: %.2f\n", f);
        System.out.printf("C: %.2f\n", g);
    }
}
