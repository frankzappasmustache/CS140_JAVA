/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Exercises
    File Name: VerticalString.java
    Author: Dustin McClure
    Lab: Exercise 18
    Modified Date: 05/08/2021
*/
import java.util.Scanner;

public class VerticalString
{
    public static void main(String[] args)
    {
        String a;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a string: ");
        a = input.nextLine();

        vertical(a);

    }

    public static void vertical(String s)
    {
        int i = 0;

        while(i < s.length())
        {
            System.out.println(s.charAt(i));
            i++;
        }
    }
}
