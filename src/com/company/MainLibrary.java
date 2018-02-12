package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static com.company.Main.mainMenu;

/*
MAIN LIBRARY
holds all games
 */
public class MainLibrary extends Game {
//    MainMenu mainMenu = new MainMenu();
    private Scanner input = new Scanner(System.in);
    private Scanner choiceInput = new Scanner(System.in);
//    private String choice;

    List<String> mainLibArrayList = new ArrayList();


    public void createMainLibrary() {

//        int position = 1;
        for (int i = 0; i < mainLibArrayList.size(); i++) {
            mainLibArrayList.add(getGameTitle());
        }
        addAnotherGame();


    }

    //method to add game to library
    public void addGame() {
        System.out.println("Enter a game title to add to your main library: ");
        setGameTitle();

        System.out.println("Are you sure you want to add " + getGameTitle() + " to your main library?");
        System.out.println("1. yes\n2. no; return to main menu\n3. close program");

        try {

            switch (input.nextInt()) {

                case 1: //yes
                    System.out.println("You have added " + getGameTitle() + " to your main library.");
                    createMainLibrary();
                    break;

                case 2: //no; main menu
                    MainMenu mainMenu = new MainMenu();
                    mainMenu.startMenu();
                    break;

                case 3: //exit
                    System.out.println("\nThank you for using the video game library.");
                    System.exit(13);
                    break;

                default: //incorrect user input - prompt user for correct number, loop back to MainMenu
                    System.out.println("\n Invalid entry\n");
                    input.nextLine();
                    addGame();
            }

        }catch(InputMismatchException ime){
            System.out.println("\n Invalid entry\n");
            input.nextLine();
            addGame();
        }
    }

    public void addAnotherGame() {

        System.out.println("Would you like to add another game?");
        System.out.println("1. yes\n2. no; return to main menu\n3. close program");

        try {

            switch (input.nextInt()) {

                case 1: //yes
                    addGame();
                    break;

                case 2: //no; main menu
                    MainMenu mainMenu = new MainMenu();
                    mainMenu.startMenu();
                    break;

                case 3: //exit
                    System.out.println("\nThank you for using the video game library.");
                    System.exit(13);
                    break;

                default: //incorrect user input - prompt user for correct number, loop back to MainMenu
                    System.out.println("\n Invalid entry\n");
                    addAnotherGame();
            }

        }catch(InputMismatchException ime){
            System.out.println("\n Invalid entry\n");
            addAnotherGame();
        }
    }

    //method to remove game from main library
    protected void removeGame() {

        //code to remove game from main library
    }

    //method to view main library
    protected void viewMainLibrary() {
        System.out.println("MAIN LIBRARY");

        int position = 1;

            System.out.println(position + ". " + mainLibArrayList);
            position++;

        MainMenu mainMenu = new MainMenu();
        mainMenu.startMenu();
    }


    //code to view main library


    //method to store games in main library
    protected void mainLibraryGames() {

//        mainMenu.startMenu(); //extend MainLibrary from MainMenu class?
    }
}
