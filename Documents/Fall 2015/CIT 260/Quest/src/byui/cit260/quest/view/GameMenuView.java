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
import buyui.cit260.quest.model.Map;
import byui.cit260.quest.control.MovementController;

/**
 *
 * @author Arkadiusz
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n------------------------------------------"
                + "\nH - look items"
                + "\nV - View Map"
                + "\nI - View list of items in inventory"
                + "\nA - View list of actors"
                + "\nL - View current location"
                + "\nN - Move North"
                + "\nE - Move East"
                + "\nS - Move South"
                + "\nW - Move West"
                + "\n------------------------------------------");
    }

    @Override
    public boolean doAction(String stringSelection) {
        char selection = stringSelection.charAt(0);
        switch (selection) {

            case 'H':
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
            case 'N':
                this.moveNorth();
                break;
            case 'E':
                this.moveEast();
                break;
            case 'S':
                this.moveSouth();
                break;
            case 'W':
                this.moveWest();
                break;
            case 'Q'://Do we need this
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
        //Added a Grid Location to go with the description
        int row = Game.getInstance().getPlayer().getLocation().getRow();
        int column = Game.getInstance().getPlayer().getLocation().getColumn();
        System.out.println("Player is at: " + row + ", " + column);
        System.out.println("You are at " + Game.getInstance().getPlayer().getLocation().getDescription());
    }

    private void displayMap() {
        System.out.println(Game.getInstance().getMap().getMapDisplay());
    }

    private void viewInventory() {
        InventoryItem[] inventory = GameController.getSortedInventorylist();

        System.out.println("\nList of Inventory Items");
        System.out.println("Description");

        //for each inventory item
        for (InventoryItem inventoryItem : inventory) {
            System.out.println(inventoryItem.getName());
        }
    }

    private void viewActors() {
        System.out.println("You're standing by the " + Game.getInstance().getPlayer().getLocation().getActor().getName());
        System.out.println("He says " + Game.getInstance().getPlayer().getLocation().getActor().getEnumDescription());
    }
     private void moveNorth() {
        MovementController mc = new MovementController();
        mc.moveNorth(Game.getInstance().getPlayer());
    }

    private void moveEast() {
        MovementController mc = new MovementController();
        mc.moveEast(Game.getInstance().getPlayer());
    }

    private void moveSouth() {
        MovementController mc = new MovementController();
        mc.moveSouth(Game.getInstance().getPlayer());
    }

    private void moveWest() {
        MovementController mc = new MovementController();
        mc.moveWest(Game.getInstance().getPlayer());
    }
}
