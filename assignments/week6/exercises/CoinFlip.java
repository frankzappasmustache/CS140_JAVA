/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Exercises
    File Name: CoinFlip.java
    Author: Dustin McClure
    Lab: Chapter 6 - Exercise 15
    Modified Date: 05/22/2021
*/
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

pulic class CoinFlip
{
    public static void main(String[] args)
    {
        coinFlip(new Scanner(new File("flips.txt")));
    }

    public static void coinFlip(Scanner in)
    {
        int heads = 0;
        int tails = 0;
        double win = 100.0 * heads / tails;
        String line = in.next();
        do {
            if(line.equalsIgnoreCase("h")) {
                heads++;
            } else {
                tails++
            } while(in.hasNextLine());
            System.out.printf("%d heads")
        }
    }
}
