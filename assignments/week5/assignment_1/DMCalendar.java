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
import java.util.*;
import java.text.*;

// Begin DMCalendar class
public class DMCalendar
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
        System.out.println();
        drawCurrentMonth();
    }

    public static void drawCurrentMonth()
    {
        Calendar cal = Calendar.getInstance();
        int currentMonth = Integer.parseInt(new SimpleDateFormat("MM").format(cal.getTime()));
        int currentDay = Integer.parseInt(new SimpleDateFormat("dd").format(cal.getTime()));
        
        System.out.println("This Month: " + currentMonth);
        drawMonth(currentMonth);
        System.out.println("Month: " + currentMonth);
        System.out.println("Day: " + currentDay);
    }

    public static void drawMonth(int month)
    {
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
    }

    public static void drawRow(int start, int end)
    {
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
