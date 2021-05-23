/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Exercises
    File Name: WordWrap.java
    Author: Dustin McClure
    Lab: Chapter 6 - Exercise 9
    Modified Date: 05/22/2021
*/
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class WordWrap
{
    public static void main(String[] args) throws FileNotFoundException
    {
        wordWrap(new Scanner(new File("words.txt")));
    }

    public static void wordWrap(Scanner in)
    {
        final int WORD_WRAP = 60;
        String longLines = in.nextLine();
        
        do {
            System.out.println(longLines.substring(0, WORD_WRAP));
            longLines = longLines.substring(WORD_WRAP);
        } while(longLines.length() > WORD_WRAP);
        
        System.out.print(longLines);
    }
}
