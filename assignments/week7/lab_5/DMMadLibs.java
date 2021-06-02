/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Lab 5
    File Name: DMMadLibs.java
    Author: Dustin McClure
    Lab: Mad Libs
    Modified Date: 06/01/2021

    A program that plays a game of madlibs, prints the played game out
    to a file, and lets users choose to view previously played games.
*/
import java.util.regex.*;
import java.io.*;
import java.util.*;

// Begin class DMMadLibs
public class DMMadLibs
{
    // begin method main
    public static void main(String[] args) throws FileNotFoundException
    {
        makeGame(); // invoke playgame
    }

    // begin method printMenu
    public static String printMenu(Scanner console)
    {
        // prompt user for input
        System.out.println("Please Type a command:");
        System.out.println("\t\"C\" to create a madlib.");
        System.out.println("\t\"V\" to view a previously created madlib.");
        System.out.println("\t\"Q\" to quit this program");
        String com = console.nextLine(); // capture input as string with scanner
        return com; // return captured input

    } // end method printMenu

    // begin method makeGame
    public static void makeGame() throws FileNotFoundException
    {
        Scanner console = new Scanner(System.in); // create scanner object
        String com1 = printMenu(console); // create string that stores returned input from printMenu
        
        // while loop that loops while returned menu input does not equal q
        while(!com1.equalsIgnoreCase("q")) {

            // if/else if statement that Creates a new game of madlibs that is written
            // to a file via printstream(C), or prints out a previously played game
            // given a file name as input(V)
            if(com1.equalsIgnoreCase("C")) {
                Scanner console2 = new Scanner(System.in); // scanner to capture user input
                System.out.println("Please enter the madlib file you would like to play:");
                System.out.println("\t\t\"simple.txt\"");
                System.out.println("\t\t\"clothes.txt\"");
                System.out.println("\t\t\"dance.txt\"");
                System.out.println("\t\t\"tarzan.txt\"");
                String fName = console2.next(); // store file name in string
                File madLibFile = new File(fName); // create new file object for game file
                // while loop that prompts user to try again when an incorrect file is entered
                // and resets the fName and madLibFile variables
                while(!madLibFile.exists()) {
                    System.out.println("This file does not exist");
                    System.out.println("Please try to enter the file name again");
                    fName = console.next();
                    madLibFile = new File(fName);
                }

                Scanner fileIn = new Scanner(madLibFile); // scanner for game file

                System.out.println("Please enter the name of the output file");
                System.out.println("that you would like your madlib printed to:");
                String outputName = console2.next(); // capture name of output file

                File madLibOut = new File(outputName); // create output file
                PrintStream output = new PrintStream(madLibOut); // create print stream that prints to output file

                // while loop that goes through the tokens in the game file
                while(fileIn.hasNext()) {
                    String placeholder = fileIn.next(); // string that holds each token as it is processed

                    // if/else if statements that check for placeholders starting with < and ending with >
                    if(placeholder.startsWith("<") && placeholder.endsWith(">")) {
                        char p = placeholder.charAt(1); // store second char of token as p
                        String prompt = String.valueOf(p); // create string variable from char

                        // switch case that takes prompt, has a case for each of the vowels in upper or
                        // lower case, and sets the resulting prompt to an for vowels or a for the default
                        // case where it is not a vowel
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
                    
                        placeholder = placeholder.replace('<', ' '); // replace < with space
                        placeholder = placeholder.replace('>', ' '); // replace > with space
                        placeholder = placeholder.replace('-', ' '); // replace - with space

                        Scanner con = new Scanner(System.in); // new scanner to capture input
                        System.out.println("Please enter " + prompt + placeholder); // prompt user to enter value for blank placeholder
                        String placeFiller = con.next(); // capture entered value
                        output.print(" " + placeFiller + " "); // print captured value to output file
                    } else if(placeholder.endsWith(".")) {
                        // handles ends of sentences, starting a new line for new sentences
                        output.print(placeholder);
                        output.println();
                    } else {
                        // prints out regular, non-blank placeholder words, adding appropriate spacing
                        output.print(" " + placeholder + " ");
                    }
                }
            } else if(com1.equalsIgnoreCase("V")) {
                Scanner con2 = new Scanner(System.in); // new scanner to capture input
                System.out.println("Please enter the name of the previously");
                System.out.println("created madlib you would like to view: ");
                String in2 = con2.next(); // capture name of file user wants to view
                Scanner fileReader = new Scanner(new File(in2)); // create new scanner to read file
                // while loop to print file out to console while there are additional lines available to print
                while(fileReader.hasNextLine()) {
                    String nextLn = fileReader.nextLine();
                    System.out.println(nextLn);
                }
            }
            com1 = printMenu(console); // invoke menu again
        }
    }
}
