/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Exercises
    File Name: FirstNameLast.java
    Author: Dustin McClure
    Lab: Exercise 21
    Modified Date: 05/08/2021
*/
import java.util.Scanner;

public class FirstNameLast
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        processName(input);
    }

    public static void processName(Scanner input)
    {
        System.out.println("Please enter your First name and Last Name:");
        String fName = input.next();
        String lName = input.nextLine();
        System.out.println("Your name in reverse order is" + lName + ", " + fName);

    }
}
