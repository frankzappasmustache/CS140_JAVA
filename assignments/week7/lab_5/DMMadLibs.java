/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Lab 5
    File Name: DMMadLibs.java
    Author: Dustin McClure
    Lab: Mad Libs
    Modified Date: 06/01/2021
    
    A program that plays out a game of madlibs, prints the results to a file,
    and allows the user to view previously played games if they would like.
*/
import java.util.regex.*;
import java.io.*;
import java.util.*;

public class DMMadLibs
{
    public static void main(String[] args) throws FileNotFoundException
    {
        makeGame();
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
        String com = printMenu(console);
        
        if(com1.equalsIgnoreCase("C")) {
            Scanner console2 = new Scanner(System.in);
            System.out.println("Please enter the madlib file you would like to play:");
            System.out.println("\t\t\"simple.txt\"");
            System.out.println("\t\t\"clothes.txt\"");
            System.out.println("\t\t\"dance.txt\"");
            System.out.println("\t\t\"tarzan.txt\"");
            String fName = console2.next();
            File madLibFile = new File(fName);
            while(!madLibFile.exists()) {
                System.out.println("This file does not exist");
                System.out.println("Please try to enter the file name again");
                fName = console.next();
                madLibFile = new File(fName);
            }

            Scanner fileIn = new Scanner(madLibFile);

            System.out.println("Please enter the name of the output file");
            System.out.println("that you would like your madlib printed to:");
            String outputName = console2.next();

            File madLibOut = new File(outputName);
            PrintStream output = new PrintStream(madLibOut);

            while(fileIn.hasNext()) {
                String placeholder = fileIn.next();

                if(placeholder.startsWith("<") && placeholder.endsWith(">")) {
                    char p = placeholder.charAt(1);
                    String prompt = String.valueOf(p);
                    switch(prompt)
                    {
                        case "a":
                        prompt = "an";
                        break;
                        case "A":
                        prompt = "an";
                        break;
                        case "e":
                        prompt = "an";
                        break;
                        case "E":
                        prompt = "an";
                        break;
                        case "i":
                        prompt = "an";
                        break;
                        case "I":
                        prompt = "an";
                        break;
                        case "o":
                        prompt = "an";
                        break;
                        case "O":
                        prompt = "an";
                        break;
                        case "u":
                        prompt = "an";
                        break;
                        case "U":
                        prompt = "an";
                        break;
                        default:
                        prompt = "a";
                        break;
                    }
                    
                    placeholder = placeholder.replace('<', ' ');
                    placeholder = placeholder.replace('>', ' ');
                    placeholder = placeholder.replace('-', ' ');

                    Scanner con = new Scanner(System.in);
                    System.out.println("Please enter " + prompt + placeholder);
                    String placeFiller = con.next();
                    output.print(" " + placeFiller + " ");
                } else if(placeholder.endsWith(".")) {
                    output.print(placeholder);
                } else {
                    output.print(" " + placeholder + " ");
                }
                com = printMenu(console);
            }
            } else if(com1.equalsIgnoreCase("V")) {
                System.out.println("Please enter the name of the previously");
                System.out.println("created madlib you would like to view: ");
                String in2 = console.next();
                Scanner fileReader = new Scanner(new File(in2));
                while(fileReader.hasNextLine()) {
                    String nextLn = fileReader.nextLine();
                    System.out.println(nextLn);
                }
                com = printMenu(console);
            } else {
                return 0;
            }
    }

}
