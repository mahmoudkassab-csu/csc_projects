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
        double max_temperature = temperatures[0]; // initialize max temperature to the first month's temperature
        double min_temperature = temperatures[0]; // initialize min temperature to the first month's temperature
        String max_temperature_month = months[0]; // initialize max temperature month to the first month
        String min_temperature_month = months[0]; // initialize min temperature month to the first month

        // introduce the program to the user
        System.out.println("\n============= Welcome to the Average Monthly Temperature Calculator! =============\n");
        System.out.println("This program displays the average, maximum, and minimum monthly high temperatures for Fort Wayne, Indiana.");
        System.out.println("The temperatures are based on historical climate data and are displayed in Fahrenheit.\n");
        System.out.println("Enter a month name to see the average high temperature for that month.");
        System.out.println("Enter 'year' to see the temperatures for all months, along with the yearly average");
        System.out.println("and the highest and lowest monthly averages.");
        System.out.println("Type 'exit' to quit the program.\n");

        while (true) {
            System.out.print("Please enter a month name, 'year', or 'exit': ");
            String input = user_input.nextLine().trim(); // read next line of input and trim whitespace

            // if (input.equalsIgnoreCase("exit")) { // check if user wants to exit
            //     System.out.println("Thank you for using the Average Monthly Temperature Calculator. Goodbye!");
            //     break;
            // }

            switch (input) {
                case "exit":  // check if user wants to exit
                    System.out.println("Thank you for using the Average Monthly Temperature Calculator. Goodbye!");
                    user_input.close(); // close scanner to free up resources
                    return; // exit the program
                case "month": // check if user wants to see monthly temperatures
                    System.out.print("Please enter a month name (e.g., January): ");
                    String month_input = user_input.nextLine().trim();
                    boolean month_found = false;
                    for (int i = 0; i < months.length; i++) {
                        if (months[i].equalsIgnoreCase(month_input)) {
                            System.out.println("The average high temperature for " + months[i] + " is: " + temperatures[i] + "°F");
                            month_found = true;
                            break;
                        }
                    }
                    if (!month_found) {
                        System.out.println("Invalid month name. Please try again.");
                    }
                    break;
                case "year": // check if user wants to see yearly temperatures
                    System.out.println("Average Monthly High Temperatures for Fort Wayne, Indiana:");
                    // loop through months, months.length = months array length, which is 12
                    for (int i = 0; i < months.length; i++) {
                        System.out.println(months[i] + ": " + temperatures[i] + "°F"); // display each month and its average temperature
                        temperature_sum += temperatures[i];
                        if (temperatures[i] > max_temperature) { // loop through temperatures to find max temperature and corresponding month
                            max_temperature = temperatures[i];
                            max_temperature_month = months[i];
                        }
                        if (temperatures[i] < min_temperature) { // loop through temperatures to find min temperature and corresponding month
                            min_temperature = temperatures[i];
                            min_temperature_month = months[i];
                        }
                    }
                    // calculate average temperature
                    average_temperature = temperature_sum / months.length;

                    System.out.println("\n============= Yearly Temperature Summary =============");
                    System.out.println("\nYearly Average High Temperature: " + String.format("%.2f", average_temperature) + "°F");
                    System.out.println("Highest Monthly Average: " + String.format("%.2f", max_temperature) + "°F in " + max_temperature_month);
                    System.out.println("Lowest Monthly Average: " + String.format("%.2f", min_temperature) + "°F in " + min_temperature_month);
                    System.out.println("=====================================================");
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid month name, 'year', or 'exit'.");
                    break;
            }

            // Process the input

        }
    }
}
 