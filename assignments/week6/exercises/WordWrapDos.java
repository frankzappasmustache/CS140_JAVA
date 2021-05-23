/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Exercises
    File Name: WordWrapDos.java
    Author: Dustin McClure
    Lab: Chapter 6 - Exercise 10
    Modified Date: 05/22/2021
*/
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class WordWrapDos
{
    public static void main(String[] args) throws FileNotFoundException
    {
        wordWrapDos(new Scanner(new File("words.txt")), new PrintStream("outputWords.txt"));
    }

    public static void wordWrapDos(Scanner in, PrintStream out)
    {
        final int WORD_WRAP = 60;
        String longLines = in.nextLine();

        do {
            out.println(longLines.substring(0, WORD_WRAP));
            longLines = longLines.substring(WORD_WRAP);
        } while(longLines.length() > WORD_WRAP);

        out.append(longLines);
    }
}
