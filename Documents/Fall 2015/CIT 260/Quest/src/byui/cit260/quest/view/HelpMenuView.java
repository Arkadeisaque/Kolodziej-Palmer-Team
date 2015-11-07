/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.quest.view;

import java.util.Scanner;

/**
 *
 * @author Arkadiusz
 */
class HelpMenuView {
    
    private final String MENU = "\n"
                + "\n------------------------------------------"
                + "\n|Help Menu                               |"
                + "\n------------------------------------------"
                + "\nG - What is the goal of the game?"
                + "\nM - How to move?"
                + "\nL - Find locations"
                + "\nR - Available resources"
                + "\nQ - Quit"
                + "\n------------------------------------------";
                
        public void displayMenu(){
            
            char selection = ' ';
            do {
                System.out.println(MENU); //display the main menu
                
                String input = this.getInput(); //get the user's selection
                selection = input.charAt(0); //get first character of string
                
                this.doAction(selection); //do action based on selection
            } while (selection != 'Q'); //an selection is not "Exit"
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
            if (selection != 'g' && selection != 'G' && selection != 'm' && selection != 'M' && selection != 'l' 
                    && selection != 'L' && selection != 'r' && selection != 'R' && selection != 'q' && selection != 'Q') {
                System.out.println("Invalid letter - the letter must be from the menu");
                continue; //and repeat again
            }
            break; //out of the (exit) the repetition
        }
        
        return selection; //return the name
    }

    private void doAction(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
