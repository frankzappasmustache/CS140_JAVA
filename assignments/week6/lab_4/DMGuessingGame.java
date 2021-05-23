/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Lab 4
    File Name: DMGuessingGame.java
    Author: Dustin McClure
    Lab: Guessing Game
    Modified Date: 05/21/2021

*/
import java.util.*;

public class DMGuessingGame
{
    public static void main(String[] args)
    {
        instructions();
        String onceMore;
        do {
            int lowestGuess = 9999;
            int sum = 0;
            int guessCount = playGame();
            int gameCount = 1;
            onceMore = playAgain();
            if(onceMore.equalsIgnoreCase("y")) {
                gameCount++;
                sum += guessCount;
                
                continue;
            } else {
                results(sum, gameCount);
                int best = bestGame(sum, lowestGuess);
                System.out.println("Your best game was " + best + " guesses.");
                
                break;
            }
        } while(onceMore.equalsIgnoreCase("y"));
    }

    public static void instructions()
    {
        System.out.println("This program allows you to play a guessing game.");
        System.out.println("I will think of a number between 1 and 100, and I ");
        System.out.println("will allow you to guess until you get it.");
        System.out.println("For each guess, I will tell you whether the right answer");
        System.out.println("is higher or lower than your guess.");
        System.out.println();
    }

    public static int playGame()
    {
        final int MAX_NUMBER = 100;
        Random randNum = new Random();
        int correctAnswer = randNum.nextInt(100) + 1;
        int guesses = 0;
        int guess;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter a number between 1-100: ");
            guess = input.nextInt();
            if(guess > correctAnswer) {
                System.out.println("This number is too high");
                guesses++;
            } else if(guess < correctAnswer) {
                System.out.println("This number is too low");
                guesses++;
            }
        } while(guess != correctAnswer);

        System.out.println("The number " + guess + " is the correct number!!");
        guesses++;
        System.out.println("You got the answer in " + guesses + " attempts");

        return guesses;
    }

    public static String playAgain()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to play this game?");
        String play = input.next();
        return play;
    }

    public static int bestGame(int guessCount, int lowestGuess)
    {
        if(guessCount < lowestGuess) {
            return guessCount;
        } else {
            return lowestGuess;
        }
    }

    public static void results(int guesses, int gameCount)
    {
        int guessAverage = guesses / gameCount;
        
        System.out.println("Total Games: " + gameCount);
        System.out.println("Total Guesses: " + guesses);
        System.out.println("Average Guesses: " + guessAverage);
    }
}
