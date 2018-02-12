package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
//Main menu with all program handling options

public class MainMenu {

    MainLibrary mainLibrary = new MainLibrary();
    CheckoutLibrary checkoutLibrary = new CheckoutLibrary();
    private boolean isValidInput;
    private Scanner input = new Scanner(System.in);

    public void welcomePrompt() {

        System.out.println("WELCOME TO THE VIDEO GAME LIBRARY!");
        startMenu();
    }

    //Menu prompts user for VGLibrary options
    public void startMenu() {

        isValidInput = false;
        while (!isValidInput) {
            //prompt user: instructions.
            System.out.println("\nMAIN MENU: What would you like to do?\n\n" +
                    "Please enter the number corresponding to your choice:\n" +
                    "1. View the games in your main library\n" +
                    "2. Add a game to your main library\n" +
                    "3. Remove a game from your main library\n" +
                    "4. View your checked out games\n" +
                    "5. Check out a from your main library\n" +
                    "6. Check in a game\n" +
                    "7. Exit program");

            switch (input.nextLine()) {

                case "1": //view main library
                    mainLibrary.viewMainLibrary();
                    isValidInput = true;
                    break;

                case "2": //add VG to library
                    mainLibrary.addGame();
                    isValidInput = true;
                    break;

                case "3": //remove VG from library
                    mainLibrary.removeGame();
                    isValidInput = true;
                    break;

                case "4": //view checked out VGs
                    checkoutLibrary.viewCheckoutLibrary();
                    isValidInput = true;
                    break;

                case "5": //check out VG
                    checkoutLibrary.checkOutGame();
                    isValidInput = true;
                    break;

                case "6": //check in game
                    checkoutLibrary.checkInGame();
                    isValidInput = true;
                    break;

                case "7": //close program
                    exitProgram();
                    isValidInput = true;
                    break;

                default: //incorrect user input - prompt user for correct number, loop back to MainMenu
                    invalidEntry();
                    isValidInput = false;
            }
        }
    }

    public void exitProgram(){

        System.out.println("\nThank you for using the video game library.");
        System.exit(13);
    }

        public void invalidEntry () {

            System.out.println("Invalid entry.");
        }

}
