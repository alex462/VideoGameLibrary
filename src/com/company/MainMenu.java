package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
//Main menu with all program handling options

public class MainMenu {

    private Scanner input = new Scanner(System.in);

    //Menu prompts user for VGLibrary options
    public void startMenu() {

        //prompt user: instructions.
        System.out.println("Welcome to your video game library! What would you like to do?\n" +
                "1. View the games in your main library\n" +
                "2. Add a game to your main library\n" +
                "3. Remove a game from your main library\n" +
                "4. View your checked out games\n" +
                "5. Check out a from your main library\n" +
                "6. Check in a game\n" +
                "7. Close program\n" +
                "Enter a number corresponding to your choice: \n");

        try {

            switch (input.nextInt()) {

                case 1: //view main library
                    break;

                case 2: //add VG to library
                    break;

                case 3: //remove VG from library
                    break;

                case 4: //view checked out VGs
                    break;

                case 5: //check out VG
                    break;

                case 6: //check in game
                    break;

                case 7: //close program
                    System.exit(13);
                    break;

                default: //incorrect user input - prompt user for correct number, loop back to MainMenu
                    input.nextLine();
                    if((input.nextInt() > 7) || input.nextInt() < 1) {
                        System.out.println("Enter a number from 1 to 7: ");
                        startMenu();
                    }
            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Enter a number from 1 to 7: ");
            startMenu();
        }
    }
}
