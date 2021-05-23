/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Exercises
    File Name: LeetSpeak.java
    Author: Dustin McClure
    Lab: Chapter 6 - Exercise 19
    Modified Date: 05/22/2021
*/
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class LeetSpeak
{
    public static void main(String[] args) throws FileNotFoundException
    {
        leetSpeak(new Scanner(new File("regularSpeak.txt")), new PrintStream("leetSpeak.txt"));
    }

    public static void leetSpeak(Scanner in, PrintStream out)
    {
        while(in.hasNextLine()) {
            Scanner input = new Scanner(in.nextLine());
            while (input.hasNext()) {
                String line = input.next();
                int n = line.length();
                line = line.replace("o", "0");
                line = line.replace("l", "1");
                line = line.replace("e", "3");
                line = line.replace("a", "4");
                line = line.replace("t", "7");

                if (line.charAt(n-1) == 's') {
                    line = line.substring(0, n-1) + "Z";
                }
                line = "(" + line + ")";
                out.print(line + " ");
            }
            out.println();
        }
    }
}
