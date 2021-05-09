/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Exercises
    File Name: SquarePrinter.java
    Author: Dustin McClure
    Lab: Exercise 4
    Modified Date: 05/08/2021
*/
import java.util.Scanner;

public class SquarePrinter
{
    public static void main(String[] args)
    {
        int min;
        int max;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a minimum number: ");
        min = input.nextInt();

        System.out.println("Please enter a maximum number: ");
        max = input.nextInt();

        printSquare(min, max);
    }
    public static void printSquare(int min, int max)
    {
        for(int i = min; i <= max; i++)
        {
            for(int k = i; k <= max; k++)
            {
                System.out.print(k);
            }
            for(int k = min; k < i; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
