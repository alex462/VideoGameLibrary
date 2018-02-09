package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.company.Main.mainMenu;

/*
CHECKOUT LIBRARY
holds all checked out games
 */
public class CheckoutLibrary extends Game {

    String checkoutLibraryStorage[] = new String[20];

    //method to add game to checkout library
    protected void checkInGame(){

        //code to add game to checkout library
    }

    //method to remove game from checkout library
    protected void checkOutGame(){

        for (int g = 0; g <= 25; g++) {
            System.out.println(" to add to your main library: ");
            Scanner input = new Scanner(System.in);
            System.out.println("Are you sure you want to add " + getGameTitle() + " to your main library?"); //verification
            try {
                if (gameTitle.toUpperCase().equals("yes")) {
                    checkoutLibraryStorage[g] = input.nextLine();
                } else if (gameTitle.toUpperCase().equals("no")) {
                    try {
                        System.out.println("Enter 'another game' to add a different game to your main library or 'main menu' to return to the main menu: ");
                        if (input.nextLine().toUpperCase().equals("another game")) {
                            checkOutGame();
                        } else if (input.nextLine().toUpperCase().equals("main menu")) {
                            mainMenu.startMenu();
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid entry");
                    }
                }
            } catch (InputMismatchException ime) {
                System.out.println("Invalid entry");
            }
        }

            //add verification. if/then.
            mainMenu.startMenu();

        }

        //code to remove game from checkout library


    //method to view checkout library
    protected void viewCheckoutLibrary(){

        //code to view checkout library
    }
}