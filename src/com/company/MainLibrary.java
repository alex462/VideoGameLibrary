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
    /**
     * instantiating main menu here causes a billion errors. WHY??
     */

    private Scanner input = new Scanner(System.in);
    private Scanner choiceInput = new Scanner(System.in);
    private boolean isValidInput;
//    private String choice;

//    private List<String> mainLibArrayList = new ArrayList();
//
//
//    public void createMainLibrary() {
//
////        int position = 1;
//        for (int i = 0; i < mainLibArrayList.size(); i++) {
//            mainLibArrayList.add(getGameTitle());
//        }
//        addAnotherGame();
//
//
//    }
//    public void add(){
//        List<String> mainLibArrayList = new ArrayList();
//        while(true){
//
//        }
//    }

    //method to add game to library
    public void addGame() {

        isValidInput = false;
        while (!isValidInput) {
            System.out.println("Enter a game title to add to your main library: ");
            setGameTitle();

            System.out.println("Are you sure you want to add " + getGameTitle() + " to your main library?");
            System.out.println("1. Yes\n2. No; return to main menu\n3. Exit program");

            switch (input.nextLine()) {

                case "1": //yes


                    do{
                        System.out.println("You have added " + getGameTitle() + " to your main library.");
                        List<String> mainLibArrayList = new ArrayList();
                        mainLibArrayList.add(getGameTitle());
                        addAnotherGame();
                        isValidInput = true;
                        break;
                    }while(input.nextLine().equals("1"));


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

    //method to remove game from main library
    protected void removeGame() {

        //code to remove game from main library
    }

    //method to view main library
    protected void viewMainLibrary() {
        System.out.println("MAIN LIBRARY");
        getMainLibArrayList();
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

    public void exitProgram(){

        System.out.println("\nThank you for using the video game library.");
        System.exit(13);
    }

    public void invalidEntry () {

        System.out.println("Invalid entry.");
    }
}
