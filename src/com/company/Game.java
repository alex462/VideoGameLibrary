package com.company;


import java.util.Scanner;

//method to create game
public abstract class Game {

    protected String gameTitle;
    private String checkoutDate;
    private String dueDate;
    private Scanner input = new Scanner(System.in);
    private Scanner choiceInput = new Scanner(System.in);
    protected String choice;

    public Game() {
        this.gameTitle = getGameTitle(); //this class's version of gameTitle
        checkoutDate = ""; //blank string prevents null return
        dueDate = "";
    }

//    public Game() {
//    }


    public String getChoice() {
        return choice;
    }

    public void setChoice() {
        this.choice = choiceInput.nextLine();
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle() {

        this.gameTitle = input.nextLine();

    }

    public String getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }


}
