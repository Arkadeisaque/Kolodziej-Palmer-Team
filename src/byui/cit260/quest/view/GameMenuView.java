/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.quest.view;

import buyui.cit260.quest.model.Game;
import buyui.cit260.quest.model.InventoryItem;
import byui.cit260.quest.control.GameController;
import byui.cit260.quest.control.ItemController;

/**
 *
 * @author Arkadiusz
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n------------------------------------------"
                + "\nS - look items"
                + "\nV - Travel to the new location"
                + "\nI - View list of items in inventory"
                + "\nA - View list of actors"
                + "\nL - View current location"
                + "\n------------------------------------------");
    }

    @Override
    public boolean doAction(String stringSelection) {
        char selection = stringSelection.charAt(0);
        switch (selection) {

            case 'S':
                this.lookForItems();
                break;
            case 'V':
                this.displayMap();
                break;
            case 'I':
                this.viewInventory();
                break;
            case 'A':
                this.viewActors();
                break;
            case 'L':
                this.showLocation();
                break;
            case 'Q' :
                return true;
            default:
                System.out.println("Invalid selection - Try again");
        }
        return false;
    }

    private void lookForItems() {
        ItemController ic = new ItemController();
        
        System.out.println(ic.lookForItems(Game.getInstance().getPlayer().getLocation(), Game.getInstance().getPlayer()));
    }
    
    private void showLocation() {
        System.out.println("You are at " + Game.getInstance().getPlayer().getLocation().getDescription());
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
        System.out.println("You're standing by the " + Game.getInstance().getPlayer().getLocation().getActor().getName());
        System.out.println("He says " + Game.getInstance().getPlayer().getLocation().getActor().getEnumDescription());
    }

}
