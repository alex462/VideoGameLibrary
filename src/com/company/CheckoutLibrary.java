package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/*
CHECKOUT LIBRARY
holds all checked out games
 */
public class CheckoutLibrary {

    public final MainMenu mainMenu;
    private boolean isValidInput;
    Scanner input = new Scanner(System.in);

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


    public CheckoutLibrary(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
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




    public void exitProgram() {

        System.out.println("\nThank you for using the video game library.");
        System.exit(13);
    }

    public void invalidEntry() {

        System.out.println("Invalid entry.");
    }
}