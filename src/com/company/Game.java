package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//method to create game
public abstract class Game {

    protected String gameTitle;
    private String checkoutDate;
    private String dueDate;
    protected Scanner input = new Scanner(System.in);
    private Scanner choiceInput = new Scanner(System.in);
    protected String choice;
    List<String> mainLibArrayList;
    List<String> checkoutLibArrayList;

    public Game() {
        this.gameTitle = getGameTitle(); //this class's version of gameTitle
        checkoutDate = ""; //blank string prevents null return
        dueDate = "";
    }


//    public Game() {
//    }

//    public void createCheckoutLibrary() {
//        List<String> checkoutLibArrayList = new ArrayList();
////        int position = 1;
//        for (int i = 0; i < checkoutLibArrayList.size(); i++) {
//            checkoutLibArrayList.add(getGameTitle());
//        }
//        mainLibrary.checkInAnotherGame();
//
//
//    }


    public List<String> getMainLibArrayList() {
        return mainLibArrayList;
    }

    public void setMainLibArrayList() {

        for (int i = 0; i < mainLibArrayList.size(); i++) {
            this.mainLibArrayList = mainLibArrayList;
        }
    }

    public List<String> getCheckoutLibArrayList() {
        return checkoutLibArrayList;
    }

    public void setCheckoutLibArrayList() {

        for (int i = 0; i < checkoutLibArrayList.size(); i++) {
            this.checkoutLibArrayList = checkoutLibArrayList;
        }
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice() {
//        Scanner choiceInput = new Scanner(System.in);
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
