package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.company.Main.mainMenu;

/*
MAIN LIBRARY
holds all games
 */
public class MainLibrary extends Game {

    private String mainLibraryStorage[] = new String[20];
    private Scanner input = new Scanner(System.in);
    private Scanner choiceInput = new Scanner(System.in);
    private String choice;
    private List<String> arrayList = new ArrayList();

    public void createMainLibrary() {
        int position = 1;

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(position + ". " + arrayList.get(i));
            position++;
        }
    }

    //method to add game to library
    public void addGame() {
        System.out.println("Enter a game title to add to your main library: ");
        setGameTitle();

        System.out.println("Are you sure you want to add " + getGameTitle() + " to your main library?");
        setChoice();

        while (getChoice().toUpperCase().equals("yes")) {
            createMainLibrary();
            arrayList.add(getGameTitle());

        }
        while (getChoice().toUpperCase().equals("no")) {
            addGame();
        }
        System.out.println("You have added " + getGameTitle() + " to your main library."); //confirmation
addAnotherGame();
choiceInput.close();
    }

    public void addAnotherGame(){

        System.out.println("Would you like to add another game?");
choice = input.nextLine();
while (choice.toUpperCase().equals("yes")) {
            addGame();
        }
        while (choice.toUpperCase().equals("no")) {
            viewMainLibrary();
        }
    }

//            System.out.println("Would you like to add another game?");
//            if (input.nextLine().toUpperCase().equals("yes")) {
//                addGame();
//            } else {
//                viewMainLibrary();
//            }


//        System.out.println("\n");
//    protected void addGame() {
//
//
//
//        for (int g = 0; g <= 25; g++) {
//            System.out.println("Enter a game to add to your main library: ");
//            setGameTitle();
////            mainLibraryStorage[g] = input.nextLine();
//            //add verification. if/then.
//            System.out.println("You have added " + getGameTitle() + " to your main library."); //confirmation
//            viewMainLibrary();
//        }

        //code to add game to main library
//    }

    //method to remove game from main library
    protected void removeGame() {

        //code to remove game from main library
    }

    //method to view main library
    protected void viewMainLibrary() {

        createMainLibrary();
            arrayList.add(getGameTitle());

        }

        //code to view main library


    //method to store games in main library
    protected void mainLibraryGames() {

//        mainMenu.startMenu(); //extend MainLibrary from MainMenu class?
    }
}
