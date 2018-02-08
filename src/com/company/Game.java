package com.company;


//method to create game
public class Game {

    private String gameTitle;
    private String checkoutDate;
    private String dueDate;

    public Game(String gameTitle) {
        this.gameTitle = gameTitle; //this class's version of gameTitle
        checkoutDate = ""; //blank string prevents null return
        dueDate = "";
    }

    public Game() {
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
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
