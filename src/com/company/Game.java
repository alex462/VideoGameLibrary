package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//method to create game
public class Game {

    protected String gameTitle;
    private String checkoutDate;
    private String dueDate;
    protected Scanner input = new Scanner(System.in);
//    protected String choice;


    public Game() {
        this.gameTitle = gameTitle; //this class's version of gameTitle
        checkoutDate = ""; //blank string prevents null return
        dueDate = "";
    }

//    public Game(){
//        this.gameTitle = gameTitle; //this class's version of gameTitle
//        checkoutDate = ""; //blank string prevents null return
//        dueDate = "";
//    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {

        this.gameTitle = input.nextLine();

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
