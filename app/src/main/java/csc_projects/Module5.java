/*
-------------------------------------------
 Program Name: Critical Thinking Assignment module 5
 Author: Mahmoud Kassab
 Date: March 15th, 2026
-------------------------------------------
 Pseudocode: 
    1. Start the program
    
    7. End the program
-------------------------------------------
 Program Inputs: 
 Program Outputs: 
-------------------------------------------
 */
package csc_projects;

import java.util.Scanner;

public class Module5 {

    public static void main(String[] args) {
        // assign scanner object to be easily used to get user input easily
        Scanner user_input  = new Scanner(System.in);

        // initaite variables
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        // Average monthly high temperatures for Fort Wayne, Indiana (°F) my city
        // Source: https://www.usclimatedata.com/climate/fort-wayne/indiana/united-states/usin0211
        double[] temperatures = {
            33, 37, 48, 61, 72, 81,
            84, 82, 76, 64, 49, 38
        };
        
        double temperature_sum = 0;
        double average_temperature;
        double max_temperature = 0.0;
        double min_temperature = 0.0;
        String max_temperature_month = "";
        String min_temperature_month = "";

        // introduce the program to the user
        System.out.println("\n============= Welcome to the Average Monthly Temperature Calculator! =============\n");
        System.out.println("This program displays the average, maximum, and minimum monthly high temperatures for Fort Wayne, Indiana.");
        System.out.println("The temperatures are based on historical climate data and are displayed in Fahrenheit.\n");
        System.out.println("Enter a month name to see the average high temperature for that month.");
        System.out.println("Enter 'year' to see the temperatures for all months, along with the yearly average");
        System.out.println("and the highest and lowest monthly averages.");
        System.out.println("Type 'exit' to quit the program.\n");

        while (true) {
            System.out.println("Please enter a month name, 'year', or 'exit': ");
            String input = user_input.nextLine().trim(); // read next line of input and trim whitespace

            if (input.equalsIgnoreCase("exit")) { // check if user wants to exit
                System.out.println("Thank you for using the Average Monthly Temperature Calculator. Goodbye!");
                break;
            }

            // Process the input
        }

        // close scanner to free up resources
        user_input.close();

    }
}
 