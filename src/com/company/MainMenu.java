package com.company;


import java.util.Scanner;

//MAIN MENU CLASS: This class holds the main menu and all its options. It has instructions for the user. Each option invokes a
//correlating method in the Library Class.
public class MainMenu {

    private Library library = new Library(this); //use this context/class to pass in
    private Scanner input = new Scanner(System.in);

    public void welcomePrompt() {

        System.out.println("\nWELCOME TO THE VIDEO GAME LIBRARY!");
        startMenu();
    }

    //Menu prompts user for VGLibrary options
    public void startMenu() {

        boolean isValidInput = false;
        while (!isValidInput) {

            //prompt user: instructions.
            System.out.println("\nMAIN MENU: What would you like to do?\n" +
                    "Please enter the number corresponding to your choice:\n" +
                    "1. Add a game to your main library\n" +
                    "2. Remove a game from your main library\n" +
                    "3. View the games in your main library\n" +
                    "4. Check out a from your main library\n" +
                    "5. Check in a game\n" +
                    "6. View your checked out games\n" +
                    "7. Exit program");

            switch (input.nextLine()) {

                case "1": //add VG to library
                    library.addGame();
                    startMenu();
                    isValidInput = true;
                    break;

                case "2"://remove VG from library
                    if (library.mainLibArrayList.isEmpty()) {
                        System.out.println("There are no games in your main library at this time.\nYou may add games to your main library from the main menu.");
                        startMenu();
                    } else {
                        library.removeGame();
                        startMenu();
                    }
                    isValidInput = true;
                    break;

                case "3": //view main library
                    if (library.mainLibArrayList.isEmpty()) {
                        System.out.println("There are no games in your main library at this time.\nYou may add games to your main library from the main menu.");
                        startMenu();
                    } else {
                        library.viewMainLibrary();
                    }
                    startMenu();
                    isValidInput = true;
                    break;

                case "4": //check out VG
                    if (library.mainLibArrayList.isEmpty()) {
                        System.out.println("There are no games in your main library at this time.\nTo check out games, you must first add games to your main library from the main menu.");
                        startMenu();
                    } else {
                        library.checkOutGame();
                    }
                    startMenu();
                    isValidInput = true;
                    break;

                case "5": //check in game
                    if (library.checkoutLibArrayList.isEmpty()) {
                        System.out.println("You have no games checked out at this time.\nYou may check out games from your main library.");
                        startMenu();
                    } else {
                        library.checkInGame();
                    }
                    startMenu();
                    isValidInput = true;
                    break;

                case "6": //view checked out VGs
                    library.viewCheckoutLibrary();
                    isValidInput = true;
                    break;

                case "7": //close program
                    exitProgram();
                    isValidInput = true;
                    break;

                default: //incorrect user input, loop back to MainMenu
                    invalidEntry();
                    isValidInput = false;
            }
        }
    }

    //  method to exit program; friendly output to user confirming choice exit.
    private void exitProgram() {

        System.out.println("\nThank you for using the video game library.");
        System.exit(13);
    }

    //method output to user explaining they have entered something incorrectly.
    private void invalidEntry() {

        System.out.println("Invalid entry.");
    }

}
