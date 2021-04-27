/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Lab 2
    File Name: DMPayroll.java
    Author: Dustin McClure
    Lab: Payroll
    Modified Date: 04/26/2021
    
    A program that obtains the month and current
    Monday from the user, asks them about three
    tasks they would like to complete on that
    Monday, asks how much time they would like
    to allot for each task, and then prints 
    out an agenda for them.
    
    For extra credit I used printf and Scanner
    with Scanner methods we have not yet gone
    over.
*/
import java.io.*;
import java.lang.*;
import java.util.Scanner;

// Begin DMPayroll class
public class DMPayroll
{
    // Method main begins execution
    public static void main(String[] args)
    {
        final int COMPANY_SIZE = 3;
        int n = 0;
        double hrsWorked;
        double payRate;
        double gross;
        double net;
        String hourlyOrSalary = "";
        
        while(n != COMPANY_SIZE)
        {
                Scanner input = new Scanner(System.in);
                
                System.out.println("Please enter the number of hours you worked this week(e.g. 38.25): ");
                hrsWorked = input.nextDouble();
                
                System.out.println("Please enter \"salary\" if you are salaried or \"hourly\" if you are hourly: ");
                hourlyOrSalary = input.next();
                
                if(hourlyOrSalary.equalsIgnoreCase("salary"))
                {
                    System.out.println("Please enter your weekly salary(e.g. 2000.00): ");
                    payRate = input.nextDouble();
                    
                    if(payRate >= 3000.00)
                    {
                        gross = payRate;
                        net = payRate * 0.75;
                    } else {
                        gross = payRate;
                        net = payRate * 0.80;
                    }
                } else {
                    System.out.println("Please enter your hourly pay(e.g. 20.00): ");
                    payRate = input.nextDouble();
                    
                    gross = payRate * hrsWorked;
                    net = (payRate * hrsWorked) * 0.85;
                }
                System.out.printf("Your Gross Pay for the week is %5.2f.\n", gross);
                System.out.printf("Your Net Pay for the week is %5.2f.\n", net);
                n++;
        }
    } // end method main
    
} // end DMPayroll class