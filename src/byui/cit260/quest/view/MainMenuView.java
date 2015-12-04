/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.quest.view;

import byui.cit260.quest.control.GameController;
import java.util.Scanner;
import quest.Quest;

/**
 *
 * @author Arkadiusz
 */
public class MainMenuView extends View {

   
    
    public MainMenuView() {
        super("\n"
            + "\n------------------------------------------"
            + "\n|Main Menu                               |"
            + "\n------------------------------------------"
            + "\nG - Start the Game"
            + "\nH - Get Help on How to Play the Game"
            + "\nS - Save the Game"
            + "\nO - Open the Game"
            + "\nE - Exit"
            + "\n------------------------------------------");
    }

    @Override
    public boolean doAction(String stringSelection) {
        char selection = stringSelection.charAt(0);
        switch (selection) {

            case 'G':
                this.startNewGame();
                break;
            case 'S':
                saveGame();
                break;
            case 'O':
                openGame();
                break;
            case 'H':
                showHelpMenu();
                break;
            case 'E':
                exitGame();
                return true;

            default:
                System.out.println("Invalid selection - Try again");
        }
        return false;
    }

    private void startNewGame() {
        //create a new game
        GameController.createNewGaame(Quest.getPlayer());

        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void saveGame() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("saveGame function called");
    }

    private void openGame() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("openGame function called");
    }

    private void showHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void exitGame() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Thanks for playing!");
    }

}
