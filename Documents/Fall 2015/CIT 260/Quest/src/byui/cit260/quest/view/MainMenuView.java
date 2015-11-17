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
public class MainMenuView {

        private final String MENU = "\n"
                + "\n------------------------------------------"
                + "\n|Main Menu                               |"
                + "\n------------------------------------------"
                + "\nG - Start the Game"
                + "\nH - Get Help on How to Play the Game"
                + "\nS - Save the Game"
                + "\nO - Open the Game"
                + "\nE - Exit"
                + "\n------------------------------------------";
                
        public void displayMenu(){
            
            char selection = ' '; //??????????????why assigned value is never used? Why I need it then? ?????????????????
            do {
                System.out.println(MENU); //display the main menu
                
                String input = this.getInput(); //get the user's selection
                selection = input.toUpperCase().charAt(0); //get first character of string
                
                this.doAction(selection); //do action based on selection
            } while (selection != 'E'); //an selection is not "Exit"
        }

    private String getInput() {

        boolean valid = false; //indicates if the letter has been retrieved
        String selection = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid letter has not been retrieved
            
            //prompt for the correct value
            System.out.println("Enter one of the menu's letter below:");
            
            //get the letter from the keyboard and trim the blanks
            selection = keyboard.nextLine();
            selection = selection.trim();
                    
            //if the letter is invalid (out of the menu scope)
            if (selection.equalsIgnoreCase("G") && selection != "M" 
                    && selection != "L" && selection != "R" && selection != "Q") {
                System.out.println("Invalid letter - the letter must be from the menu");
                continue; //and repeat again
            }
            break; //out of the (exit) the repetition
        }
        
        return selection; //return the name
    }
    

    private void doAction(char selection) {
         switch (selection) {

            case 'G':
                this.startNewGame(); //??????????????????????in an example there was 'this.' in front of each function here; do I need it? ??????????????????????????????
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
                return;

            default:
                System.out.println("Invalid selection - Try again");
        }
         
    }

    private void startNewGame() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //create a new game
        GameController.createNewGaame(Quest.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
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
        helpMenu.displayHelpMenu();
        displayMenu();
    }

    private void exitGame() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Thanks for playing!");
    }
    
}
