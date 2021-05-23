/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Exercises
    File Name: NegativeSum.java
    Author: Dustin McClure
    Lab: Chapter 6 - Exercise 3
    Modified Date: 05/22/2021
*/
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NegativeSum 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        negativeSum(new Scanner(new File("negatives_1.txt")));
        negativeSum(new Scanner(new File("negatives_2.txt")));
    }

    public static boolean negativeSum(Scanner ui) 
    {
        int total = 0;
        for (int movement = 1; ui.hasNextInt(); movement++) {
            total += ui.nextInt();
            if (total < 0) {
                System.out.printf("sum of %d after %d steps\n", total, movement);
                return true;
            }
        }
        System.out.println("no negative sum");
        return false;
    }
}
