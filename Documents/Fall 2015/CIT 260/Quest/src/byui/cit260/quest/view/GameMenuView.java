/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.quest.view;

import buyui.cit260.quest.model.InventoryItem;
import byui.cit260.quest.control.GameController;

/**
 *
 * @author Arkadiusz
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n------------------------------------------"
                + "\nV - Travel to the new location"
                + "\nI - View list of items in inventory"
                + "\nA - View list of actors"
                + "\n------------------------------------------");
    }

    @Override
    public boolean doAction(String stringSelection) {
        char selection = stringSelection.charAt(0);
        switch (selection) {

            case 'V':
                this.displayMap();
                break;
            case 'I':
                this.viewInventory();
                break;
            case 'A':
                this.viewActors();

                return false;

            default:
                System.out.println("Invalid selection - Try again");
        }
        return true;
    }

    private void displayMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewInventory() {
        InventoryItem[] inventory = GameController.getSortedInventorylist();

        System.out.println("\nList of Inventory Items");
        System.out.println("Description");

        //for each inventory item
        for (InventoryItem inventoryItem : inventory) {
            System.out.println(inventoryItem.getInventoryType());
        }
    }    

    

    private void viewActors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
