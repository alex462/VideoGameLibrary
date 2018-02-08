package com.company;

public class Instructions {
}

/*
Video game library
        Main menu choices
        Add a video game to library.
        Remove game from .
        View library of games.
        Check out game.
        View checked out games
        Check in game.
        Close program

    Add a game:
        Scanner, input, output to prompt which game from user, store the game
        Prompts to user: what game? Know that it was successfully added (w/ name). Loop back to menu. Can prompt verification for adding game title.

    Remove a game:
        Prompt: which game? Give list of options. If none, output (and go to main menu). Prompt verification w/ title. Remove game from view library. Confirm removal by title. Show library at current status. (can prompt user if they want to remove another.) loop back to menu.

    Checking out game:
        Prompt: which game? Give list of options. If none, output (and go to main menu). Prompt verification w/ title. Remove game from view library. Store in separate library - check out library. Confirm check out by title. Show library at current status. (can prompt user if they want to remove another.) loop back to menu.

    View library of games:
        Output list, alphabetical order? Library must store all games, unless checked out or removed. Loop back to main menu.

    View checked out games:
        Output list, alphabetical order? Include checkout and due dates. Library must store all checked out games. Loop back to main menu.

    Check in game:
        Prompt: which game? Give list of options, pulled from check out library. If none, output (and go to main menu). Prompt verification w/ title. If game is late, output. Remove game from view check out library. Store in separate library - main (view) library. Confirm check in by title. Show check out library and main library at current status. (can prompt user if they want to check in another.) loop back to menu.

    Close program:
        System.exit();


    Other things to consider:
        Menu should be handled by switch statement.
        Throw exception if incorrect user input.


*/
