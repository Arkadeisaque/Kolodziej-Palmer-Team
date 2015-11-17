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
                
        public void displayHelpMenu(){
            
            char selection = ' ';
            do {
                System.out.println(MENU); //display the help menu
                
                String input = this.getInput(); //get the user's selection
                selection = input.charAt(0); //get first character of string
                
                this.doAction(selection); //do action based on selection
            } while (selection != 'Q'); //an selection is not "Quit"
        }

    private char getInput() {
        
        Scanner in = new Scanner(System.in);
        
        String input = "";
        char selection = 0;
        
        while(input.length() < 1) {
            displayHelpMenu();
            input = in.nextLine();
            
            if(input.length() < 1) {
                System.out.println("Please select the option form the menu.");
                displayHelpMenu();
            } else {
                
                selection = input.toUpperCase().charAt(0);
                
                if(selection != 'G' && != 'M' && != 'L' && != 'R' && != 'Q') {
                    System.out.println("Please select a valid input");
                    input = "";
                }
            }
            return selection;
        }

//       boolean valid = false; //indicates if the letter has been retrieved
//        String selection = null;
//          Scanner keyboard = new Scanner(System.in); //keyboard input stream
//        
//        while(!valid) { //while a valid letter has not been retrieved
            
            //prompt for the correct value
//            System.out.println("Enter one of the menu's letter below:");
            
            //get the letter from the keyboard and trim the blanks
//            selection = keyboard.nextLine();
//            selection = selection.trim();
            
            
            //if the letter is invalid (out of the menu scope)
           
//                continue; //and repeat again
//            }
//            break; //out of the (exit) the repetition
//        }
        
//        return selection; //return the name

        private void doAction(char input) {
            switch (input) {

            case 'G':
                System.out.println("The goal of the game is to find orb");
                break;
            case 'M':
                System.out.println("Move S, N, E, W.");
                break;
            case 'L':
                System.out.println("List of available locations.");
                break;
            case 'R':
                System.out.println("List of available resources");
                break;
            case 'Q':
                displayHelpMenu();
                return;

            default:
                System.out.println("Invalid selection - Try again");
        }
        }

}
