package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

//LIBRARY CLASS: holds all methods stemming from main menu. These methods add/remove games, check in/out games, view both libraries.
public class Library {

    public final MainMenu mainMenu;

    Game game = new Game();
    private Scanner input = new Scanner(System.in);
    protected List<String> mainLibArrayList = new ArrayList<>();
    protected List<String> checkoutLibArrayList = new ArrayList<>(); //using list instead of array because they are flexible
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy HH:mm:ss");

    protected Library(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    //method prompts user to add a game to their main library
    protected void addGame() {

        System.out.println("Enter a game title to add to your main library: ");
        game.setTitle(input.nextLine());
        mainLibArrayList.add(game.getTitle());
        System.out.println("You have added " + game.getTitle() + " to your main library.");

        addAnotherGame();
    }

    //method prompts user to add another game or return to main menu for more options
    private void addAnotherGame() {

        boolean isValidInput = false;
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

    protected void removeGame() {

        System.out.println("MAIN LIBRARY:\nEnter the number corresponding to the game you would like to remove from your main library: ");
        int position = 1;
        for (int i = 0; i < mainLibArrayList.size(); i++) {
            System.out.println(position + ". " + mainLibArrayList.get(i) + " ");
            position++;
        }
        String tempGame = mainLibArrayList.get(input.nextInt() - 1);
        System.out.println(tempGame + " has been removed from your main library.");
        mainLibArrayList.remove(tempGame);

        removeAnotherGame();
    }

    //method runs after removeGame(); prompts user to remove another or return to main menu
    private void removeAnotherGame() {

        if (!mainLibArrayList.isEmpty()) { //removeAnotherGame only runs if user still has games in main library after removing game.

input.nextLine();

            boolean isValidInput = false;
            while (!isValidInput) {

                System.out.println("Would you like to remove another game from your main library?");
                System.out.println("1. Yes\n2. No; return to main menu\n3. Exit program");

                switch (input.nextLine()) {

                    case "1": //yes
                        removeGame();
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

        }else{
            mainMenu.startMenu();
        }
    }

    //method to view all games currently in user's main library
    protected void viewMainLibrary() {

        System.out.println("MAIN LIBRARY");

        int position = 1;
        for (int i = 0; i < mainLibArrayList.size(); i++) {
            System.out.println(position + ". " + mainLibArrayList.get(i) + " ");
            position++;
        }
    }

    //method to check out a game. Only runs if they have 1+ game/s in their main library.
    protected void checkOutGame() {

        System.out.println("MAIN LIBRARY:\nEnter the number corresponding to the game you would like to check out from your main library: ");

        int position = 1;
        for (int i = 0; i < mainLibArrayList.size(); i++) {
            System.out.println(position + ". " + mainLibArrayList.get(i) + " ");
            position++;
        }
        String tempGame = mainLibArrayList.get(input.nextInt() - 1);
        Calendar calendar = Calendar.getInstance();
        System.out.println("You have checked out " + tempGame + " from your main library today: " + dateFormat.format(calendar.getTime()));
        System.out.println();

        mainLibArrayList.remove(tempGame);
        checkoutLibArrayList.add(tempGame);

        calendar.add(Calendar.DAY_OF_YEAR, 5);
        System.out.println("It is due back in 5 days' time: " + dateFormat.format(calendar.getTime()));
        game.setDueDate(dateFormat.format(calendar.getTime()));

        checkOutAnotherGame();
    }

    //method runs after checkOutGame(); prompts user to check out another or return to main menu
    private void checkOutAnotherGame() {

        if (!mainLibArrayList.isEmpty()) { //checkOutAnotherGame only runs if user still has games in main library after checking out game.

            input.nextLine();

            boolean isValidInput = false;
            while (!isValidInput) {

                System.out.println("Would you like to check out another game from your main library?");
                System.out.println("1. Yes\n2. No; return to main menu\n3. Exit program");

                switch (input.nextLine()) {

                    case "1": //yes
                        checkOutGame();
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

        }else{
            mainMenu.startMenu();
        }
    }

    //method to check in a game. Only runs if they have 1+ game/s in their checkout library.
    protected void checkInGame() {

        System.out.println("CHECKOUT LIBRARY:\nEnter the number corresponding to the game you would like to check back in to your main library: ");

        int position = 1;
        for (int i = 0; i < checkoutLibArrayList.size(); i++) {
            System.out.println(position + ". " + checkoutLibArrayList.get(i) + " ");
            position++;
        }
        String tempGame = checkoutLibArrayList.get(input.nextInt() - 1);
        System.out.println(tempGame + " has been checked back in to your main library.");

        checkoutLibArrayList.remove(tempGame);
        mainLibArrayList.add(tempGame);

            checkInAnotherGame();
    }

    //method runs after checkInGame(); prompts user to check in another or return to main menu
    private void checkInAnotherGame() {

        if (!checkoutLibArrayList.isEmpty()) { //checkInAnotherGame only runs if user still has games in checkout library after checking in game.

            input.nextLine();

            boolean isValidInput = false;
            while (!isValidInput) {

                System.out.println("Would you like to check in another game to your main library?");
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

        }else{
            mainMenu.startMenu();
        }
    }

    //method to view all games currently checked out by user
    protected void viewCheckoutLibrary() {

        System.out.println("CHECKOUT LIBRARY");

        int position = 1;
        for (int i = 0; i < checkoutLibArrayList.size(); i++) {
            System.out.println(position + ". " + checkoutLibArrayList.get(i) + " ");
            position++;
        }
        mainMenu.startMenu();
    }

    //method to exit program; friendly output to user confirming choice exit.
    private void exitProgram() {

        System.out.println("\nThank you for using the video game library.");
        System.exit(13);
    }

    //method output to user explaining they have entered something incorrectly.
    private void invalidEntry() {

        System.out.println("Invalid entry.");
    }

}
