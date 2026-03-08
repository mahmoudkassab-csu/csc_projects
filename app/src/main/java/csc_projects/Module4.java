/*
-------------------------------------------
 Program Name: Critical Thinking Assignment module 4
 Author: Mahmoud Kassab
 Date: March 8th, 2026
-------------------------------------------
 Pseudocode: 
    1. Start the program
    2. Declare and initialize variables for grade, average, max_grade, min_grade, sum, 
        max_grade_student, and min_grade_student
    3. Introduce the program to the user and explain what it does
    4. prompt the user to enter the grade for 10 students
        a. validate the grade is between 0 and 100, if not prompt the user to enter a valid grade 
            and repeat the iteration for the same student
        b. update sum, max_grade, and min_grade based on the user input
    5. calculate average by dividing sum by 10
    6. display the results to the user, including average grade, maximum grade with the student number, 
        and minimum grade with the student number
    7. End the program
-------------------------------------------
 Program Inputs: grade for 10 students
 Program Outputs: average grade, maximum grade with the student number, and minimum grade with the student number
-------------------------------------------
 */
package csc_projects;

import java.util.Scanner;

public class Module4 {

    public static void main(String[] args) {
        // assign scanner object to be easily used to get user input easily
        Scanner user_input  = new Scanner(System.in);

        // initaite variables
        double grade;
        double average;
        double max_grade = 0;
        double min_grade = 0;
        double sum = 0;
        
        int max_grade_student = 0;
        int min_grade_student = 0;

        // introduce the program to the user
        System.out.println("\n ============= Welcome to the Grade Calculator! ============= \n");
        System.out.println("This program will calculate the average, maximum, and minimum grade for 10 students.");
        System.out.println("Please enter the grades for each student when prompted. Grades should be between 0 and 100.\n");


        // prompt the user to enter grade for 10 students, prevent endless loop by using for loop to iterate 10 times
        for (int i = 1; i <= 10; i++) {
            System.out.print("Please Enter the grade for student " + i + ": ");
            grade = user_input.nextDouble();

            // validate the grade is between 0 and 100
            if (grade < 0 || grade > 100) { // no negative grades or grades above 100
                System.out.println("Invalid grade, please enter a grade between 0 and 100");
                i--; // decrement i to repeat the iteration for the same student
                continue; // skip the rest of the loop and prompt again
            }

            // update sum, max_grade, and min_grade
            sum += grade;
            if (grade > max_grade) {
                max_grade = grade;
                max_grade_student = i; // store the student number with the max grade
            }
            if (grade < min_grade || min_grade == 0) {
                min_grade = grade;
                min_grade_student = i; // store the student number with the min grade
            }
        }

        // calculate average
        average = sum / 10;

        // display the results to the user, using %.2f to print 0.00 for average grade
        System.out.println("\n ============= Grade Summary =============");
        System.out.println("Thanks for using the grade calculator!");
        System.out.println("Average Grade: " + String.format("%.2f", average) ); // print average grade with 2 decimal places
        System.out.println("Maximum Grade: " + String.format("%.2f", max_grade) + ", Student " + max_grade_student);
        System.out.println("Minimum Grade: " + String.format("%.2f", min_grade) + ", Student " + min_grade_student);
        System.out.println("==========================================");

        // close scanner to free up resources
        user_input.close();

    }
}
 