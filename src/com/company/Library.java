package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

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

    protected void addGame(){

        System.out.println("Enter a game title to add to your main library: ");
        game.setTitle(input.nextLine());
        mainLibArrayList.add(game.getTitle());
        System.out.println("You have added " + game.getTitle() + " to your main library.");

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
    }

    protected void viewMainLibrary(){

        System.out.println("MAIN LIBRARY");

        int position = 1;
        for (int i = 0; i < mainLibArrayList.size(); i++) {
            System.out.println(position + ". " + mainLibArrayList.get(i) + " ");
            position++;
        }
    }

    protected void checkOutGame(){

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
    }

    protected void checkInGame(){

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
    }

    protected void viewCheckoutLibrary(){

        System.out.println("CHECKOUT LIBRARY");

        int position = 1;
        for (int i = 0; i < checkoutLibArrayList.size(); i++) {
            System.out.println(position + ". " + checkoutLibArrayList.get(i) + " ");
            position++;
        }
        mainMenu.startMenu();
    }

}
