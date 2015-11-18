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
public abstract class View implements ViewInterface {
    
    Scanner keyboard = new Scanner(System.in);
    protected String displayMessage;
    
    public View(String message) {
            this.displayMessage = message;
    }
    
    @Override
    public void display() {
        String value = "";
        boolean done = false;
        
        do {
            System.out.println(this.displayMessage);  //print message
            value = this.getInput(); //get the input from the user
            done = this.doAction(value); //do action based on selection
        }
        while (!done);
    }
    
    public String getInput() {
        boolean valid = false; 
        String selection = null;
        
        while(!valid) { //while a valid letter has not been retrieved               
            //get the letter from the keyboard and trim the blanks
            selection = keyboard.nextLine();
            selection = selection.trim();
                    
            //if the letter is invalid (out of the menu scope)
            if (selection.length() < 1) { //blanc value entered
                System.out.println("Invalid letter - the letter must be from the menu");
                continue; //and repeat again
            }
            break;
        }
        
        return selection; //return the name
    }
}
