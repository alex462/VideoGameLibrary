package com.company;

import java.text.SimpleDateFormat;
import java.util.*;

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
        mainLibArrayList.sort(String::compareToIgnoreCase); //arranges games in ArrayList in alphabetical order; not case-sensitive

        System.out.println("You have added " + game.getTitle() + " to your main library.");

        mainMenu.startMenu();
    }

    //method prompts user to add another game or return to main menu for more options

    protected void removeGame() {

        System.out.println("MAIN LIBRARY:\nEnter the number corresponding to the game you would like to remove from your main library: ");

        int position = 1;
        int i;
        for (i = 0; i < mainLibArrayList.size(); i++) {
            System.out.println(position + ". " + mainLibArrayList.get(i) + " ");
            position++;
        }

        String tempGame = mainLibArrayList.get(input.nextInt() - 1);
        System.out.println(tempGame + " has been removed from your main library.");
        mainLibArrayList.remove(tempGame);

        mainMenu.startMenu();
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
        checkoutLibArrayList.sort(String::compareToIgnoreCase); //arranges games in ArrayList in alphabetical order; not case-sensitive

        calendar.add(Calendar.DAY_OF_YEAR, 5);
        System.out.println("It is due back in 5 days' time: " + dateFormat.format(calendar.getTime()));
        game.setDueDate(dateFormat.format(calendar.getTime()));

        mainMenu.startMenu();
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
        mainLibArrayList.sort(String::compareToIgnoreCase); //arranges games in ArrayList in alphabetical order; not case-sensitive

        mainMenu.startMenu();
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

}
