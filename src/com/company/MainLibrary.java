package com.company;

import java.util.Scanner;

import static com.company.Main.mainMenu;

/*
MAIN LIBRARY
holds all games
 */
public class MainLibrary extends Game {

    private String mainLibraryStorage[] = new String[20];
    private Scanner input = new Scanner(System.in);

    //method to add game to library
    protected void addGame() {


        for (int g = 0; g <= 25; g++) {
            System.out.println("Enter a game to add to your main library: ");
            setGameTitle() = input.nextLine();
//            mainLibraryStorage[g] = input.nextLine();
            //add verification. if/then.
            System.out.println("You have added " + getGameTitle() + " to your main library."); //confirmation
            viewMainLibrary();
        }

        //code to add game to main library
    }

    //method to remove game from main library
    protected void removeGame() {

        //code to remove game from main library
    }

    //method to view main library
    protected void viewMainLibrary() {

        mainMenu.startMenu();

        //code to view main library
    }

    //method to store games in main library
    protected void mainLibraryGames() {

//        mainMenu.startMenu(); //extend MainLibrary from MainMenu class?
    }
}
