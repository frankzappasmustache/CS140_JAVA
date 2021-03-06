/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Assignment 3
    File Name: DMCalendarP3.java
    Author: Dustin McClure
    Assignment: Calendar - Part 3
    Modified Date: 06/07/2021

    Java program that prints out an ASCII Calendar to the console
    based on user input.
*/
import java.io.*;
import java.lang.*;
import java.util.*;
import java.text.*;

// Begin DMCalendar class
public class DMCalendarP3
{
    // Method main begins execution
    public static void main(String[] args) throws FileNotFoundException
    {
        int month = 0; // declare int for month and initialize to 0
        int day = 0; // declare int for day and initialize to 0
        Scanner instruct = new Scanner(System.in); // create scanner to capture input
        String input = printInstructions(instruct); // pass scanner into printInstructions as param

        // while loop that checks user input from printInstructions, and proceeds accordingly;
        // exiting the program if q is selected
        while(!input.equals("q")) {
            switch(input.toUpperCase())
            {
                case "T":
                    System.out.println();
                    drawCurrentMonth(); // call drawCurrentMonth method to print current month
                    input = printInstructions(instruct); // transfer execution back to printInstructions
                    continue;
                case "N":
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
                    input = printInstructions(instruct); // transfer execution back to printInstructions
                    continue;
                case "P":
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
                    input = printInstructions(instruct); // transfer execution back to printInstructions
                    continue;
                case "EV":
                    input = printInstructions(instruct); // transfer execution back to printInstructions
                    continue;
                case "FP":
                    String date2 = userInput(); // get date as string from userInput
                    Scanner con2 = new Scanner(System.in);
                    month = monthFromDate(date2); // pass date to monthFromDate and return it as int
                    day = dayFromDate(date2); // pass date to dateFrom date and return it as int
                    System.out.println("Please Enter the name of the file you would like your calendar");
                    System.out.println("printed to: "); // prompt for file
                    String fName = con2.next(); // capture file name string
                    File calFile = new File(fName); // create new file from string                 
                    PrintStream stream = new PrintStream(calFile); // set printstream to new file
                    PrintStream orig = System.out; // set printstream var to switch back to system.out
                    System.setOut(stream); // set printstream to file
                    System.out.println(month); // print month at top of calendar
                    drawMonth(month); // print calendar
                    displayDate(month, day); // print month and day at bottom of calendar
                    System.setOut(orig); // set output back to console so instructions print to console
                    input = printInstructions(instruct); // transfer execution back to printInstructions
                    continue;
                default:
                    String date = userInput(); // get date as string from userInput
                    month = monthFromDate(date); // pass date to monthFromDate and return it as int
                    day = dayFromDate(date); // pass date to dateFrom date and return it as int
                    System.out.println(month); // print month at top of calendar
                    drawMonth(month); // print calendar
                    displayDate(month, day); // print month and day at bottom of calendar
                    input = printInstructions(instruct); // transfer execution back to printInstructions
                    continue;
            }
        }
    }

    // begin method printInstructions
    public static String printInstructions(Scanner console)
    {
        // print out instructions, prompting user for input
        System.out.println("Please Type a command:");
        System.out.println("\t\"EV\" to add an event to the calendar");
        System.out.println("\t\"FP\" to print a calendar for the month of your choosing");
        System.out.println("\t\"E\" to enter a date and display the corresponding calendar");
        System.out.println("\t\"T\" to get todays date and display today's calendar");
        System.out.println("\t\"N\" to display the next month");
        System.out.println("\t\"P\" to display the previous month");
        System.out.println("\t\"Q\" to quit the program");
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
            drawRow(1, 7);
            drawRow(8, 14);
            drawRow(15, 21);
            drawRow(22, 28);
            System.out.print("================================================");
            drawRow(29, 29);
            System.out.println("========");
        } else if(month == 4 || month == 6 || month == 9 || month == 11) {
            drawRow(1, 7);
            drawRow(8, 14);
            drawRow(15, 21);
            drawRow(22, 28);
            System.out.print("========================================");
            drawRow(29, 30);
            System.out.println("================");
        } else {
            drawRow(1, 7);
            drawRow(8, 14);
            drawRow(15, 21);
            drawRow(22, 28);
            System.out.print("================================");
            drawRow(29, 31);
            System.out.println("========================");
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

    public static int daysInMonth(int month)
    {
        if(month == 2) {
            return 29;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public static void storeEvent(Scanner console) throws FileNotFoundException
    {
        final String[][] EVENT_ARRAY = new String[12][31];
        for(int i = 0; i < 12; i++) {
            EVENT_ARRAY[i] = new String[daysInMonth(i)];
        }

        System.out.println("Please enter an event (FORMAT: MM/DD event_title)");
        String eventText = console.nextLine();
        PrintStream console2 = new PrintStream(new File("calendarEvents.txt"));
        while(console.hasNext()) {
            int day = dayFromDate(eventText);
            int month = monthFromDate(eventText);
            String event = eventText.substring(5);
            String eventNew = EVENT_ARRAY[month - 1][day -1] + event;

        }
    }
} // end class DMCalendarP2
