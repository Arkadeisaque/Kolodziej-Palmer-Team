/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.quest.view;

import buyui.cit260.quest.model.Player;
import byui.cit260.quest.control.ProgramControl;
import java.util.Scanner;

/**
 *
 * @author Arkadiusz
 */
public class StartProgramView {
    public StartProgramView() {
        
    }
    
    //subtasks for which separate functions were created:
    public void startProgram() {
        //Display the banner screen
        this.displayBanner();
        //prompt the player to enter their name Retrieve the name of the player
        String name = this.getName();
        //Create and save the player object
        Player player = ProgramControl.createPlayer(name);
        //Display a personalized welcome message
        this.displayWelcomeMessage(player);
        //Display the Main menu.
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
    
    //implemented displayBanner() function:
    public void displayBanner() {
        System.out.println("\n\n*********************************************");
        
        System.out.println("\n This is the game of Quest for Magic Orb      "
                        + "\n In this game you will help the King save the  "
                        + "\n kingdome from certain destruction by going    "
                        + "\n to the quest to bring back the magic orb.     "
                        + "\n");
        
        System.out.println("\n You will explore the land to find the way to "
                        + "\n the place when the magic orb is kept.         "
                        + "\n You will need to collect and trade items that "
                        + "\n will help you succeed in this journey.        "
                        + "\n Don't forget to bring the orb back to the King"
                        + "\n");
        
        System.out.println("\n Good luck and have fun, if you dare!         "
                        + "\n");
        
        System.out.println("************************************************");
    }

    private String getName() {
        boolean valid = false; //indicates if the name has been retrieved
        String name = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            //prompt for the player's name
            System.out.println("Enter the player's name below:");
            
            //get the name from the keyboard and trim the blanks
            name = keyboard.nextLine();
            name = name.trim();
            
            //if the name is invalid (less than two character in length)
            if (name.length() < 3) {
                System.out.println("Invalid name - the name must be at least 3 characters");
                continue; //and repeat again
            }
            break; //out of the (exit) the repetition
        }
        
        return name; //return the name
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n*********************************************");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tGood luck with that!");
        System.out.println("*************************************************");
    }
}
