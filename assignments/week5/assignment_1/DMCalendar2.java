/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Assignment 1
    File Name: DMCalendar.java
    Author: Dustin McClure
    Assignment: Calendar
    Modified Date: 05/11/2021
*/
import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.Calendar;

// Begin DMCalendar class
public class DMCalendar2
{
    // Method main begins execution
    public static void main(String[] args)
    {
        String date = userInput();
        int month = monthFromDate(date);
        int day = dayFromDate(date);

        System.out.println(month);
        drawMonth(month);
        displayDate(month, day);
    }

    public static void drawMonth(int month)
    {
        if(month == 2) {
                drawRow(29);
            } else if(month == 4 || month == 6 || month == 9 || month == 11) {
                drawRow(30);
            } else {
                drawRow(31);
            }
    }

    public static void drawRow(int daysInMonth)
    {
        int days = 7;
        for(int row = 1; row <= 5; row++) {
            for(int c = 1; c <= days; c++) {
                System.out.print("=======");
            }
            System.out.println();

            for(int d = start; d <= end; d++) {
                System.out.print("|" + d + "    |");
            }
            System.out.println();

            for(int b = start; b <= end; b++) {
                System.out.print("|     |");
                System.out.println();
                System.out.print("|     |");
            }
            System.out.print("|");
            System.out.print("|");
    }
    System.out.println();
}

    public static String userInput()
    {
        Scanner read = new Scanner(System.in);

        System.out.println("Please enter the month and date(mm/dd):");
        String date = read.next();

        return date;
    }

    public static void displayDate(int month, int day)
    {
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }

    public static int monthFromDate(String date)
    {
        int month = Integer.parseInt(date.substring(0,2));
        return month;
    }

    public static int dayFromDate(String date)
    {
        int day = Integer.parseInt(date.substring(3,5));
        return day;
    }
}
