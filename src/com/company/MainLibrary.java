package com.company;

import java.util.Scanner;

/*
MAIN LIBRARY
holds all games
 */
public class MainLibrary {

    Game game = new Game();
    String mainLibraryStorage[] = new String[20];

    //method to add game to library
    protected void addGame() {


        for (int g = 0; g <= 25; g++) {
            System.out.println("Enter a game to add to your main library: ");
            Scanner input = new Scanner(System.in);
            mainLibraryStorage[g] = input.nextLine();
            //add verification. if/then.
            System.out.println("You have added " + game.getGameTitle() + " to your main library."); //confirmation
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

        //code to view main library
    }

    //method to store games in main library
    protected void mainLibraryGames() {

//        mainMenu.startMenu(); //extend MainLibrary from MainMenu class?
    }
}
