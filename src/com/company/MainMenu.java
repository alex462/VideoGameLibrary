package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
//Main menu with all program handling options

public class MainMenu {

    MainLibrary mainLibrary = new MainLibrary();
    CheckoutLibrary checkoutLibrary = new CheckoutLibrary();

    private Scanner input = new Scanner(System.in);

    //Menu prompts user for VGLibrary options
    public void startMenu() {


        //prompt user: instructions.
        System.out.println("WELCOME TO THE VIDEO GAME LIBRARY! What would you like to do?\n\n" +
                "1. View the games in your main library\n" +
                "2. Add a game to your main library\n" +
                "3. Remove a game from your main library\n" +
                "4. View your checked out games\n" +
                "5. Check out a from your main library\n" +
                "6. Check in a game\n" +
                "7. Close program\n" +
                "Enter the number corresponding to your choice:");

        try {

            switch (input.nextInt()) {

                case 1: //view main library
                    mainLibrary.viewMainLibrary();
                    break;

                case 2: //add VG to library
                    mainLibrary.addGame();
                    break;

                case 3: //remove VG from library
                    mainLibrary.removeGame();
                    break;

                case 4: //view checked out VGs
                    checkoutLibrary.viewCheckoutLibrary();
                    break;

                case 5: //check out VG
                    checkoutLibrary.checkOutGame();
                    break;

                case 6: //check in game
                    checkoutLibrary.checkInGame();
                    break;

                case 7: //close program
                    System.out.println("\nThank you for using the video game library.");
                    System.exit(13);
                    break;

                default: //incorrect user input - prompt user for correct number, loop back to MainMenu
                    System.out.println("\n Please enter a number from 1 to 7.\n");
                    startMenu();
            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("\n Please enter a number from 1 to 7.\n");
            startMenu();
        }
    }
}
