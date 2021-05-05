/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Assignment 1
    File Name: DMCalendar.java
    Author: Dustin McClure
    Assignment: Calendar
    Modified Date: 05/012021
*/
import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.Calendar;

// Begin DMCalendar class
public class DMCalendar
{
    // Method main begins execution
    public static void main(String[] args)
    {

    }

    public static void drawMonth(int month)
    {
        for(int i = 0; i <= 12; i++) {
            if(month == 02) {
                for(int j = 0; j <= 29; j++) {
                    System.out.print();
                }
            } else if(month == 04 || month == 06 || month == 09 || month == 11) {
                for(int j = 0; j <= 30; j++) {
                    System.out.print();
                }
            } else {
                for(int j = 0; j <=31; j++){
                    System.out.print();
                }
            }
        }
    }

    public static void drawRow(int row)
    {
        for(int a = 0; a <= 5; a++) {
            System.out.print();
        }
    }

    public static void displayDate(int month, int day)
    {

    }

    public static int monthFromDate(String date)
    {

    }

    public static int dayFromDate(String date)
    {

    }
}
