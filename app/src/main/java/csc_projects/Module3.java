/*
-------------------------------------------
 Program Name: Critical Thinking Assignment module 3
 Author: Mahmoud Kassab
 Date: March 1, 2026
-------------------------------------------
 Pseudocode: 
    1. Start the program
    2. Declare and initialize variables for coupon, week1,2,3,4 bills, monthly total, weekly average, 
        monthly total with coupon, and weekly average with coupon
    3. prompt the user to enter the coupon amount in decimal (eg 0.10 for 10%)
        a. if user entered <= 0 (eg. negative number) or more than 1, more than 100% will set coupon to .10 or 10%
    4. promt the user to enter the grocery bill for week 1 through  4
    5. calcualte 
        a. monthly total by adding all 4 week grocery bills 
        b. weekly average by dividing monthly total by 4
        c. monthly total with the coupon
        d. weekly average with the coupon 
    6. Display the results of the monthly total and weeekly average with and without coupon
    7. End the program
-------------------------------------------
 Program Inputs: coupon rate, week 1 through 4 grocery bill
 Program Outputs: monthly total, and weekly average with and without the coupon
-------------------------------------------
"""
 */
package csc_projects;

import java.util.Scanner;

public class Module3 {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        // assign scanner object to be easily used to get user input easily
        Scanner user_input  = new Scanner(System.in);

        // initaite variables
        double coupon;
        // double week1, week2, week3, week4;
        double monthly_total = 0;
        double weekly_average;
        double monthly_total_with_coupon;
        double weekly_average_with_coupon;


        // prompt the user to enter discount rate 
        System.out.print("Please Enter the coupon amount as a decimal (example, .10 for 10%): ");
        coupon = user_input.nextDouble();

        // check if coupon <= 0 or > 1.0 more than 100%
        if (coupon <= 0 || coupon > 1.0) {
            System.out.println("invalid coupon rate, will use 10% coupon!");
            coupon = 0.1;
        }

        // using while loop to get 4 weeks grocery bills
        int week = 1;
        while (week <= 4) {
            System.out.print(" Please Enter the grocery bill amount for week " + week + ": $");
            monthly_total += user_input.nextDouble();
            week++;
        }
        // prompt the user to enter weekly grocery bill
        // System.out.print(" Please Enter the grocery bill amount for week 1: $");
        // week1 = user_input.nextDouble();

        // System.out.print(" Please Enter the grocery bill amount for week 2: $");
        // week2 = user_input.nextDouble();

        // System.out.print(" Please Enter the grocery bill amount for week 3: $");
        // week3 = user_input.nextDouble();

        // System.out.print(" Please Enter the grocery bill amount for week 4: $");
        // week4 = user_input.nextDouble();

        // // calculate monthly total and weeklt average
        // monthly_total = week1 + week2 + week3 + week4;
        weekly_average = monthly_total / 4;

        // calculate the coupon discount
        monthly_total_with_coupon = monthly_total  * (1 - coupon);
        weekly_average_with_coupon  = weekly_average * (1 - coupon);

        // display the results to the user, using %.2f to print 0.00 for dollar amount
        System.out.println("\n ============= Grocery Bill Summary =============");
        System.out.println("Coupon rate: " + (int)(coupon * 100) + "%");

        System.out.println("\n Bill Without a coupon");
        System.out.println("    Monthly Total:    $" + String.format("%.2f", monthly_total));
        System.out.println("    Weekly Average:   $" + String.format("%.2f", weekly_average));

        System.out.println("\n Bill With a coupon");
        System.out.println("    Monthly Total:  $" + String.format("%.2f", monthly_total_with_coupon));
        System.out.println("    Weekly Average: $" + String.format("%.2f", weekly_average_with_coupon));
        System.out.println("==========================================");

        // close scanner to free up resources
        user_input.close();

    }
}
 