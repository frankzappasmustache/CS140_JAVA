/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Exercises
    File Name: CollapseSpaces.java
    Author: Dustin McClure
    Lab: Chapter 6 - Exercise 5
    Modified Date: 05/22/2021
*/
import java.util.*;

public class CollapseSpaces
{
    public static void main(String[] args)
    {
        String out = "many    spaces   on    this    line!";
        collapseSpaces(new Scanner(out));
    }

    public static void collapseSpaces(Scanner in)
    {
        do {
            String spaces = in.next();
            System.out.print(spaces + " ");
        } while(in.hasNextLine());
    }
}
