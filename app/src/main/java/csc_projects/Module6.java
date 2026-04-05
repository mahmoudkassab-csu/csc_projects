/*
-------------------------------------------
 Program Name: Portfolio Project Milestone - Automobile Inventory System
 Author: Mahmoud Kassab
 Date: March 21st, 2026
-------------------------------------------
 Pseudocode:

 CLASS: Automobile
    1. Start the class
    2. Declare and initialize private variables for make, model, color, year, and mileage
    3. Declare and initialize an ArrayList to hold all vehicles in inventory

    4. Default Constructor
        a. initialize all private variables to empty strings and 0 for int values

    5. Parameterized Constructor
        a. receive autoMake, autoModel, autoColor, autoYear, and autoMileage as parameters
        b. store values in private variables (make, model, color, year, mileage)
        c. format vehicle information as a single string and add to inventory ArrayList
        d. if an error occurs, display failure message with error details

    6. searchVehicle method
        a. receive search_term as parameter
        b. loop through inventory ArrayList
            if any entry contains the search term (case insensitive)
                return String array with found entry and its index
        c. if no match found, return String array with message indicating no vehicle found
        d. if an error occurs, return String array with failure message and error details

    7. addVehicle method
        a. receive autoMake, autoModel, autoColor, autoYear, and autoMileage as parameters
        b. store values in private variables (make, model, color, year, mileage)
        c. format vehicle information as a single string and add to inventory ArrayList
        d. return success message indicating vehicle was added
        e. if an error occurs, return failure message with error details

    8. removeVehicle method
        a. receive index as parameter
        b. if index is valid and within inventory ArrayList size
            retrieve vehicle entry at given index
            remove vehicle from inventory ArrayList
            return success message indicating vehicle was removed
        c. else
            return message indicating invalid index
        d. if an error occurs, return failure message with error details

    9. updateVehicle method
        a. receive index and new vehicle details as parameters
        b. if index is valid and within inventory ArrayList size
            update private variables with new values
            format new vehicle information as a single string
            replace old entry at given index with new entry in inventory ArrayList
            return success message indicating vehicle was updated
        c. else
            return message indicating invalid index
        d. if an error occurs, return failure message with error details

    10. listInventory method
        a. if inventory ArrayList is empty
            return String array with message indicating inventory is empty
        b. else
            convert inventory ArrayList to String array
            return String array of all vehicles in inventory
        c. if an error occurs, return String array with failure message and error details

    11. End the class

-------------------------------------------

 CLASS: AutomobileInventory (Main Class)
    1. Start the class

    2. getVehicleInput helper method
        a. receive Scanner object as parameter
        b. prompt user to enter make, model, color, year, and mileage
        c. store each value in a local variable
        d. return all values as a String array

    3. printInventory helper method
        a. receive Automobile object as parameter
        b. call listInventory method and store returned String array
        c. loop through String array and print each vehicle entry with its number to the screen

    4. printToFile method
        a. receive Automobile object as parameter
        b. call listInventory method and store returned String array
        c. create a FileWriter object to write to C:\Temp\Autos.txt
        d. loop through String array and write each vehicle entry to the file
        e. close the FileWriter object
        f. display success message indicating file was printed
        g. if an error occurs, display failure message with error details

    5. displayMenu method
        a. display menu options to the user
            1. Add Vehicle
            2. Remove Vehicle
            3. Update Vehicle
            4. List Inventory
            5. Search Vehicle
            6. Print Inventory to File
            7. Exit
        b. prompt user to enter their choice

    6. main method
        a. declare and initialize Scanner object for user input
        b. declare and initialize Automobile object using default constructor
        c. display welcome message to the user
        d. start loop to keep displaying menu until user chooses to exit
            if user enters 1
                prompt user to enter new vehicle information using getVehicleInput method
                call addVehicle method with user input and display return value
                call printInventory method to display updated inventory
            if user enters 2
                prompt user to enter search term to find vehicle to remove
                call searchVehicle method and display result
                if vehicle is found
                    call removeVehicle method with found index and display return value
                    call printInventory method to display updated inventory
                else
                    display message indicating vehicle was not found
            if user enters 3
                prompt user to enter search term to find vehicle to update
                call searchVehicle method and display result
                if vehicle is found
                    prompt user to enter updated vehicle information using getVehicleInput method
                    call updateVehicle method with found index and new data and display return value
                    call printInventory method to display updated inventory
                else
                    display message indicating vehicle was not found
            if user enters 4
                call printInventory method to display current inventory
            if user enters 5
                prompt user to enter search term
                call searchVehicle method and display result
            if user enters 6
                call printToFile method to print inventory to file
            if user enters 7
                display goodbye message and exit the program
            else
                display message indicating invalid choice
        e. close Scanner object

    7. End the class

-------------------------------------------
 Program Inputs: vehicle make, model, color, year, mileage, search term, menu choice, file print preference
 Program Outputs: success or failure messages for all operations, inventory list,
    search results, file output to C:\Temp\Autos.txt, goodbye message when exiting
-------------------------------------------
*/

package csc_projects;

public class Module6 {
    
}
