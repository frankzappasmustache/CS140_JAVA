/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Assignment 1
    File Name: DMCalendarP2.java
    Author: Dustin McClure
    Assignment: Calendar
    Modified Date: 05/21/2021
*/
import java.io.*;
import java.lang.*;
import java.util.*;
import java.text.*;

// Begin DMCalendar class
public class DMCalendarP2
{
    // Method main begins execution
    public static void main(String[] args)
    {
        int month = 0; // declare int for month and initialize to 0
        int day = 0; // declare int for day and initialize to 0
        Scanner instruct = new Scanner(System.in); // create scanner to capture input
        String input = printInstructions(instruct); // pass scanner into printInstructions as param

        // while loop that checks user input from printInstructions, and proceeds accordingly;
        // exiting the program if q is selected
        while(!input.equals("q")) {
            if(input.equalsIgnoreCase("e")) {
                String date = userInput(); // get date as string from userInput
                month = monthFromDate(date); // pass date to monthFromDate and return it as int
                day = dayFromDate(date); // pass date to dateFrom date and return it as int
                System.out.println(month); // print month at top of calendar
                drawMonth(month); // print calendar
                displayDate(month, day); // print month and day at bottom of calendar
            } else if(input.equalsIgnoreCase("t")) {
                System.out.println();
                drawCurrentMonth(); // call drawCurrentMonth method to print current month
            } else if(input.equalsIgnoreCase("n")) {
                // if/else if that ensure user has entered date, handles the case where
                // the calendar needs to loop around to JAN from DEC, or increments current month by 1
                // and then prints next month
                if(month == 0) {
                    System.out.println("Please press the letter \"e\" to enter a date");
                } else if(month == 12) {
                    month = 1;
                    System.out.println(month);
                    drawMonth(month);
                    displayDate(month, day);
                } else {
                    month++;
                    System.out.println(month);
                    drawMonth(month);
                    displayDate(month, day);
                }
            } else if( input.equalsIgnoreCase("p")) {
                // if/else if that ensure user has entered date, handles the case where
                // the calendar needs to loop around to DEC from JAN, or decrements current month by 1
                // and then prints next month
                if(month == 0) {
                    System.out.println("Please press the letter \"e\" to enter a date");
                } else if(month == 1) {
                    month = 12;
                    System.out.println(month);
                    drawMonth(month);
                    displayDate(month, day);
                } else {
                    month--;
                    System.out.println(month);
                    drawMonth(month);
                    displayDate(month, day);
                }
            }
            input = printInstructions(instruct); // transfer execution back to printInstructions
        }
    }

    // begin method printInstructions
    public static String printInstructions(Scanner console)
    {
        // print out instructions, prompting user for input
        System.out.println("Please Type a command:");
        System.out.println("\t\"e\" to enter a date and display the corresponding calendar");
        System.out.println("\t\"t\" to get todays date and display today's calendar");
        System.out.println("\t\"n\" to display the next month");
        System.out.println("\t\"p\" to display the previous month");
        System.out.println("\t\"q\" to quit the program");
        String com = console.nextLine(); // capture input as string with scanner
        return com; // return captured input

    } // end method printInstructions

    // begin method drawCurrentMonth
    public static void drawCurrentMonth()
    {
        Calendar cal = Calendar.getInstance(); // create new calendar object

        // declare two int for current Month and current Day, and initialize them to the current
        // month and current day by grabbing them from the calendar object and formatting them
        // with SimpleDateFormat class(MM for 2 digit month and dd for 2 digit day)
        int currentMonth = Integer.parseInt(new SimpleDateFormat("MM").format(cal.getTime()));
        int currentDay = Integer.parseInt(new SimpleDateFormat("dd").format(cal.getTime()));
        
        System.out.println("This Month: " + currentMonth); // print current month
        drawMonth(currentMonth); // pass current month to drawMonth method
        System.out.println("Month: " + currentMonth); // print current month
        System.out.println("Day: " + currentDay); // print current day
        System.out.println();
    } // end method drawCurrentMonth

    // begin method drawMonth, which takes the month as a param
    public static void drawMonth(int month)
    {
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"}; // array of strings for weekdays
        System.out.print(" "); // initial space so that SUN lines up with first date on calendar

        // for loop that prints out all 7 weekdays at the top of the calendar by
        // looping through the array indicies
        for(int i = 0; i < 7; i++) {
            System.out.print(days[i] + "     ");
        }

        System.out.println(); // print line so that actual calendar starts on it's own line

        // if/else if loop with nested for loops that calls the drawRow method to draw
        // rows for proper number of days in each month
        if(month == 2) {
                for(int k = 1; k <= 1; k++) {
                    drawRow(1, 7);
                }
                    for(int l = 1; l <= 1; l++) {
                        drawRow(8, 14);
                    }
                        for(int m = 1; m <= 1; m++) {
                            drawRow(15, 21);
                        }
                            for(int n = 1; n <= 1; n++) {
                                drawRow(22, 28);
                            }
                                for(int o = 1; o <= 1; o++) {
                                    System.out.print("================================================");
                                    drawRow(29, 29);
                                    System.out.println("========");
                                }
            } else if(month == 4 || month == 6 || month == 9 || month == 11) {
                for(int k = 1; k <= 1; k++) {
                    drawRow(1, 7);
                }
                    for(int l = 1; l <= 1; l++) {
                        drawRow(8, 14);
                    }
                        for(int m = 1; m <= 1; m++) {
                            drawRow(15, 21);
                        }
                            for(int n = 1; n <= 1; n++) {
                                drawRow(22, 28);
                            }
                                for(int o = 1; o <= 1; o++) {
                                    System.out.print("========================================");
                                    drawRow(29, 30);
                                    System.out.println("================");
                                }
            } else {
                for(int k = 1; k <= 1; k++) {
                    drawRow(1, 7);
                }
                    for(int l = 1; l <= 1; l++) {
                        drawRow(8, 14);
                    }
                        for(int m = 1; m <= 1; m++) {
                            drawRow(15, 21);
                        }
                            for(int n = 1; n <= 1; n++) {
                                drawRow(22, 28);
                            }
                                for(int o = 1; o <= 1; o++) {
                                    System.out.print("================================");
                                    drawRow(29, 31);
                                    System.out.println("========================");
                                }
            }
    } // end method drawMonth

    // begin method drawRow, which takes start and end as params
    public static void drawRow(int start, int end)
    {
        // nested for loops that draw each row based on the start and end date of
        // each week passed in from the drawMonth method
        for(int a = 1; a <= 1; a++) {
            for(int c = start; c <= end; c++) {
                System.out.print("========");
            }
            System.out.println();
            
            for(int d = start; d <= end; d++) {
                if(d <= 9) {
                System.out.print("|" + d + "      ");
                } else {
                System.out.print("|" + d + "     ");
                }
            }
            System.out.println("|");
            
            for(int b = start; b <= end; b++) {
                System.out.print("|       ");
            }
            System.out.println("|");
            
            for(int e = start; e <= end; e++) {
                System.out.print("|       ");
            }
            System.out.println("|");
        }
    } // end drawRow method

    // begin method userInput, which returns a string
    public static String userInput()
    {
        Scanner read = new Scanner(System.in); // initialize scanner to read user input

        System.out.println("Please enter the month and date(mm/dd):"); // prompt user for date
        String date = read.next(); // capture date input as string

        return date; // return date string
    } // end method userInput

    // begin method displayDate, which accepts month and day as params
    public static void displayDate(int month, int day)
    {
        // print month and day with ints passed into method
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    } // end method displayDate

    // begin method monthFromDate, which accepts a string, date, as a param
    public static int monthFromDate(String date)
    {
        int month = Integer.parseInt(date.substring(0,2)); // convert month portion from userInput to integer and store as int month
        return month; // return month as an int
    } // end method monthFromDate

    // begin method dayFromDate, which accepts a string, date, as a param
    public static int dayFromDate(String date)
    {
        int day = Integer.parseInt(date.substring(3,5)); // convert day portion from userInput to integer and store as int month
        return day; // return day as an int
    } // end method dayFromDate
} // end class DMCalendarP2
