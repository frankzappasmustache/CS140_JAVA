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

public class CoinFlip
{
    public static void main(String[] args) throws FileNotFoundException
    {
        coinFlip(new Scanner(new File("flips.txt")));
    }

    public static void coinFlip(Scanner in)
    {
        while(in.hasNextLine()) {
            int flips = 0;
            int heads = 0;
            Scanner line = new Scanner(in.nextLine());
            
            while (line.hasNext()) {
                if(line.next().equalsIgnoreCase("h"))
                    heads++;
                flips++;
            }
            double win = 100.0 * heads / flips;
            System.out.printf("%d heads %.1f", heads, win);
            System.out.println();
            if(win > 50.0) {
                System.out.println("You win!");
            }
        }
    }
}
