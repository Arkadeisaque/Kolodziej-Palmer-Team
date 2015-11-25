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
public class HelpMenuView extends View {

    public displayHelpMenu() {
        super("\n"
            + "\n------------------------------------------"
            + "\n|Help Menu                               |"
            + "\n------------------------------------------"
            + "\nG - What is the goal of the game?"
            + "\nM - How to move?"
            + "\nL - Find locations"
            + "\nR - Available resources"
            + "\nQ - Quit"
            + "\n------------------------------------------");
    }
    
    @Override
    public boolean doAction(String stringSelection) {
        char selection = stringSelection.charAt(0);
        switch (selection) {

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
                return false;

            default:
                System.out.println("Invalid selection - Try again");
        }
        return true;
    }

}
