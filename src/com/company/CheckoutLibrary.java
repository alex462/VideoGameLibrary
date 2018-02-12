package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static com.company.Main.mainMenu;

/*
CHECKOUT LIBRARY
holds all checked out games
 */
public class CheckoutLibrary extends Game {

    private boolean isValidInput;

//    List<String> checkoutLibArrayList = new ArrayList();


//    public void createCheckoutLibrary() {
//        List<String> checkoutLibArrayList = new ArrayList();
////        int position = 1;
//        for (int i = 0; i < checkoutLibArrayList.size(); i++) {
//            checkoutLibArrayList.add(getGameTitle());
//        }
//        checkInAnotherGame();
//
//
//    }

    //method to add game to library
    public void checkInGame() {

        isValidInput = false;
        while (!isValidInput) {

            setCheckoutLibArrayList();

            checkInAnotherGame();
            System.out.println("Enter a game title to check in to your main library: ");
            setGameTitle();

            System.out.println("Are you sure you want to check in " + getGameTitle() + "?");
            System.out.println("1. Yes\n2. No; return to main menu\n3. Exit program");

            switch (input.nextLine()) {

                case "1": //yes
                    System.out.println("You have checked in " + getGameTitle() + " to your main library.");
                    checkoutLibArrayList.remove(getGameTitle());
                    mainLibArrayList.add(getGameTitle());
                    checkInAnotherGame();
                    isValidInput = true;
                    break;

                case "2": //no; main menu
                    MainMenu mainMenu = new MainMenu();
                    mainMenu.startMenu();
                    isValidInput = true;
                    break;

                case "3": //exit
                    exitProgram();
                    isValidInput = true;
                    break;

                default: //incorrect user input - prompt user for correct number, loop back to MainMenu
                    invalidEntry();
                    isValidInput = false;
            }
        }
    }

    public void checkInAnotherGame() {

        isValidInput = false;
        while (!isValidInput) {

            System.out.println("Would you like to check in another game?");
            System.out.println("1. Yes\n2. No; return to main menu\n3. Exit program");

            switch (input.nextLine()) {

                case "1": //yes
                    checkInGame();
                    isValidInput = true;
                    break;

                case "2": //no; main menu
                    MainMenu mainMenu = new MainMenu();
                    mainMenu.startMenu();
                    isValidInput = true;
                    break;

                case "3": //exit
                    exitProgram();
                    isValidInput = true;
                    break;

                default: //incorrect user input - prompt user for correct number, loop back to MainMenu
                    invalidEntry();
                    isValidInput = false;
            }
        }
    }

    //method to remove game from checkout library
    protected void checkOutGame() {

        isValidInput = false;
        while (!isValidInput) {

            System.out.println("Enter a game title to check out of your main library: ");
            setGameTitle();

            System.out.println("Are you sure you want to check out " + getGameTitle() + "?");
            System.out.println("1. Yes\n2. No; return to main menu\n3. Exit program");

            switch (input.nextLine()) {

                case "1": //yes
                    System.out.println("You have checked out " + getGameTitle() + " from your main library.");
                    mainLibArrayList.remove(getGameTitle());
                    checkoutLibArrayList.add(getGameTitle());
                    isValidInput = true;
                    break;

                case "2": //no; main menu
                    MainMenu mainMenu = new MainMenu();
                    mainMenu.startMenu();
                    isValidInput = true;
                    break;

                case "3": //exit
                    exitProgram();
                    isValidInput = true;
                    break;

                default: //incorrect user input - prompt user for correct number, loop back to MainMenu
                    invalidEntry();
                    isValidInput = false;
            }

        }
    }
//        for (int g = 0; g <= 25; g++) {
//            System.out.println(" to add to your main library: ");
//            Scanner input = new Scanner(System.in);
//            System.out.println("Are you sure you want to add " + getGameTitle() + " to your main library?"); //verification
//            try {
//                if (gameTitle.toUpperCase().equals("yes")) {
//                    checkoutLibraryStorage[g] = input.nextLine();
//                } else if (gameTitle.toUpperCase().equals("no")) {
//                    try {
//                        System.out.println("Enter 'another game' to add a different game to your main library or 'main menu' to return to the main menu: ");
//                        if (input.nextLine().toUpperCase().equals("another game")) {
//                            checkOutGame();
//                        } else if (input.nextLine().toUpperCase().equals("main menu")) {
//                            mainMenu.startMenu();
//                        }
//                    } catch (InputMismatchException e) {
//                        System.out.println("Invalid entry");
//                    }
//                }
//            } catch (InputMismatchException ime) {
//                System.out.println("Invalid entry");
//            }
//        }
//
//        //add verification. if/then.
//        mainMenu.startMenu();



    //code to remove game from checkout library


    //method to view checkout library
    protected void viewCheckoutLibrary() {

        System.out.println("CHECKED-OUT VIDEO GAMES");

        int position = 1;

        System.out.println(position + ". " + checkoutLibArrayList);
        position++;

        MainMenu mainMenu = new MainMenu();
        mainMenu.startMenu();
        //code to view checkout library
    }

    public void exitProgram() {

        System.out.println("\nThank you for using the video game library.");
        System.exit(13);
    }

    public void invalidEntry() {

        System.out.println("Invalid entry.");
    }
}