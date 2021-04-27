/*
    Copyright 2021 <Dustin McClure>
    Project Name: CS140_Java
    Sub-project: Lab 2
    File Name: DMPayroll.java
    Author: Dustin McClure
    Lab: Payroll
    Modified Date: 04/26/2021
    
    A program that takes employee's hours, pay rate,
    and position type(salary or hourly), and uses this
    data to calculate gross and net income for a company
    of 3 people.
    
    This calculator also calculates withholding differently
    depending on total income.
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
                    
                    if(payRate >= 75.00)
                    {
                        gross = payRate * hrsWorked;
                        net = (payRate * hrsWorked) * 0.75;
                    } else {
                        gross = payRate * hrsWorked;
                        net = (payRate * hrsWorked) * 0.80;
                    }
                }
                System.out.printf("Your Gross Pay for the week is %5.2f.\n", gross);
                System.out.printf("Your Net Pay for the week is %5.2f.\n", net);
                n++;
        }
    } // end method main
    
} // end DMPayroll class