/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Lab 5
    File Name: DMMadLibs.java
    Author: Dustin McClure
    Lab: Mad Libs
    Modified Date: 06/01/2021


*/
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class DMMadLibs
{
    public static void main(String[] args) throws FileNotFoundException
    {

    }

    // begin method printInstructions
    public static String printMenu(Scanner console)
    {
        // print out instructions, prompting user for input
        System.out.println("Please Type a command:");
        System.out.println("\t\"C\" to create a madlib.");
        System.out.println("\t\"V\" to view a previously created madlib.");
        System.out.println("\t\"Q\" to quit this program");
        String com = console.nextLine(); // capture input as string with scanner
        return com; // return captured input

    } // end method printInstructions

    public static void makeGame() throws FileNotFoundException
    {
        Scanner console = new Scanner(System.in);
        String com1 = printMenu(console);

        if(com1.equalsIgnoreCase("C")) {
            System.out.println("Please enter the madlib file you would like to play:");
            System.out.println("\t\t\"simple.txt\"");
            System.out.println("\t\t\"clothes.txt\"");
            System.out.println("\t\t\"dance.txt\"");
            System.out.println("\t\t\"tarzan.txt\"");
            String fileName = console.nextLine();
            File madLibFile = new File(fileName);
            while(!madLibFile.exists()) {
                System.out.println("This file does not exist");
                System.out.println("Please try to enter the file name again");
                break;
            }
            System.out.println("Please enter the name of the output file");
            System.out.println("that you would like your madlib printed to:");
            String outputName = console.nextLine();
            File madLibOut = new File(outputName);
            PrintStream output = new PrintStream(madLibOut);

            Scanner fileIn = new Scanner(madLibeFile);

            while(fileIn.hasNextLine()) {
                Pattern pattern = Pattern.compile("\<")
            }
        } else if(com1.equalsIgnoreCase("V")) {

        } else {
            return -1;
        }
    }

}
