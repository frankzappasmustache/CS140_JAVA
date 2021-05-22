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
        playGame();

    }

    public static void instructions()
    {
        System.out.println("This program allows you to play a guessing game.");
        System.out.println("I will think of a number between 1 and 100, and I ");
        System.out.println("will allow you to guess until you get it.");
        System.out.println("For each guess, I will tell you whether the right answer");
        System.out.println("is higher or lower than your guess.");
    }

    public static int playGame()
    {
        final int MAX_NUMBER = 100;
        Random randNum = new Random();
        int correctAnswer = rand.nextInt(100) + 1;
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

    public static int playAgain()
    {
        Scanner input = new Scanner(System.in);
        String play = input.next();
        int games = 1;
        System.out.println("Would you like to play again?");
        play;
        if(play.equals("y")) {
            playGame();
        } else {
            System.out.println("Please come again soon!");
        }
        return play;
    }

    public static void results(int guesses, int gameCount)
    {
        int games = gameCount;
        int guesses = guesses;
        int guessAverage = guesses / gameCount;
        int bestGame = 
    }
}
