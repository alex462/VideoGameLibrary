package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
MAIN LIBRARY
holds all games
 */
public class MainLibrary {

    public final MainMenu mainMenu;//any class can use this; i don't want it to ever be modified. must create a constructor.

//    private List<Game> mainLibrary = new ArrayList<Game>();
//    private List<Game> checkoutLibrary = new ArrayList<Game>(); //using list instead of array because they are flexible
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy HH:mm:ss");

    private Scanner input = new Scanner(System.in);
    private boolean isValidInput;

    private List<Game> mainLibArrayList = new ArrayList<Game>();
    private List<Game> checkoutLibArrayList = new ArrayList<Game>();

//    public List<Game> getMainLibArrayList() {
//        return mainLibArrayList;
//    }
//
//    public void setMainLibArrayList() {
//
//        for (int i = 0; i < mainLibArrayList.size(); i++) {
//            this.mainLibArrayList = mainLibArrayList;
//        }
//    }
//
//    public List<Game> getCheckoutLibArrayList() {
//        return checkoutLibArrayList;
//    }
//
//    public void setCheckoutLibArrayList() {
//
//        for (int i = 0; i < checkoutLibArrayList.size(); i++) {
//            this.checkoutLibArrayList = checkoutLibArrayList;
//        }
//    }


    public MainLibrary(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    //method to add game to library
    public void addGame() {

        isValidInput = false;
        while (!isValidInput) {
            System.out.println("Enter a game title to add to your main library: ");

            Game game = new Game(input.nextLine());
//            game.setGameTitle();

            System.out.println("Are you sure you want to add " + game.getGameTitle() + " to your main library?");
            System.out.println("1. Yes\n2. No; return to main menu\n3. Exit program");

            switch (input.nextLine()) {

                case "1": //yes
                        System.out.println("You have added " + game.getGameTitle() + " to your main library.");
                        mainLibArrayList.add(game);
                        addAnotherGame();
                        isValidInput = true;
                        break;

                case "2": //no; main menu
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

    public void addAnotherGame() {

        isValidInput = false;
        while (!isValidInput) {

        System.out.println("Would you like to add another game?");
            System.out.println("1. Yes\n2. No; return to main menu\n3. Exit program");

            switch (input.nextLine()) {

                case "1": //yes
                    addGame();
                    isValidInput = true;
                    break;

                case "2": //no; main menu
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

    //method to remove game from main library
    protected void removeGame() {

        //code to remove game from main library
    }

    //method to view main library
    protected void viewMainLibrary() {
        System.out.println("MAIN LIBRARY");


        int position = 1;
        for (int i = 0; i < mainLibArrayList.size(); i++) {
            System.out.println(position + ". " + mainLibArrayList.get(i));
            position++;
        }
        mainMenu.startMenu();
    }


    //code to view main library


    //method to store games in main library
    protected void mainLibraryGames() {

//        mainMenu.startMenu(); //extend MainLibrary from MainMenu class?
    }

    //method to add game to library
    public void checkInGame() {

        isValidInput = false;
        while (!isValidInput) {

            System.out.println("Enter a game title to check in to your main library: ");

            Game game = new Game(input.nextLine());
//            game.setGameTitle();

            System.out.println("Are you sure you want to check in " + game.getGameTitle() + "?");
            System.out.println("1. Yes\n2. No; return to main menu\n3. Exit program");

            switch (input.nextLine()) {

                case "1": //yes
                    System.out.println("You have checked in " + game.getGameTitle() + " to your main library.");
                    checkoutLibArrayList.remove(game);
                    mainLibArrayList.add(game);
                    checkInAnotherGame();
                    isValidInput = true;
                    break;

                case "2": //no; main menu
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

            Game game = new Game(input.nextLine());
//            game.setGameTitle();

            System.out.println("Are you sure you want to check out " + game.getGameTitle() + "?");
            System.out.println("1. Yes\n2. No; return to main menu\n3. Exit program");

            switch (input.nextLine()) {

                case "1": //yes
                    System.out.println("You have checked out " + game.getGameTitle() + " from your main library.");
                    mainLibArrayList.remove(game);
                    checkoutLibArrayList.add(game);
                    isValidInput = true;
                    break;

                case "2": //no; main menu
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

    //method to view checkout library
    protected void viewCheckoutLibrary() {

        System.out.println("CHECKED-OUT VIDEO GAMES");

        int position = 1;
        for (int i = 0; i < checkoutLibArrayList.size(); i++) {
            System.out.println(position + ". " + mainLibArrayList.get(i));
            position++;
        }
        mainMenu.startMenu();
        //code to view checkout library
    }


    public void exitProgram(){

        System.out.println("\nThank you for using the video game library.");
        System.exit(13);
    }

    public void invalidEntry () {

        System.out.println("Invalid entry.");
    }
}
