/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.quest.control;

import buyui.cit260.quest.model.Game;
import buyui.cit260.quest.model.InventoryItem;
import buyui.cit260.quest.model.Map;
import buyui.cit260.quest.model.Player;
import byui.cit260.quest.view.ItemEnum;
import quest.Quest;

/**
 *
 * @author Arkadiusz
 */
public class GameController {
    
    public static final int NUMBER_OF_INVENTORY_ITEMS = 20;
    
    public static void createNewGaame(Player player) {

        Game game = new Game(); //create new game
        Quest.setCurrentGame(game); //save the game in Quest

        game.setPlayer(game); //save player in game  ???????????????????what is the difference between save in quest and save in game???????????????

        //create list of inventory items and save in the game
        InventoryItem[] inventoryList = GameController.createInventoryList();
        game.setInventory(inventoryList);

        Map map = MovementController.createMap(); //create the map 
        game.setMap(map); //save map in the game 

        //move actors to starting location 
        MovementController.moveActorsToStartingLocation(map);
    }

    private static InventoryItem[] createInventoryList() {
        
        // created array(list) of inventory items
        InventoryItem[] inventory = new InventoryItem[NUMBER_OF_INVENTORY_ITEMS];

        InventoryItem orb = new InventoryItem();
        orb.setName("Orb");
        inventory[ItemEnum.orb.ordinal()] = orb;

        InventoryItem enchantedApple = new InventoryItem();
        orb.setName("Enchanted Apple");
        inventory[ItemEnum.enchantedApple.ordinal()] = enchantedApple;

        InventoryItem bucket = new InventoryItem();
        orb.setName("Bucket");
        inventory[ItemEnum.bucket.ordinal()] = bucket;

        InventoryItem bucketWithWater = new InventoryItem();
        orb.setName("bucket With Water");
        inventory[ItemEnum.bucketWithWater.ordinal()] = bucketWithWater;

        InventoryItem gauntlets = new InventoryItem();
        orb.setName("Gauntlets");
        inventory[ItemEnum.gauntlets.ordinal()] = gauntlets;

        InventoryItem torch = new InventoryItem();
        orb.setName("Torch");
        inventory[ItemEnum.torch.ordinal()] = torch;

        InventoryItem meat = new InventoryItem();
        orb.setName("Meat");
        inventory[ItemEnum.meat.ordinal()] = meat;

        InventoryItem knife = new InventoryItem();
        orb.setName("Knife");
        inventory[ItemEnum.knives.ordinal()] = knife;

        InventoryItem map = new InventoryItem();
        orb.setName("Map");
        inventory[ItemEnum.map.ordinal()] = map;

        InventoryItem corn = new InventoryItem();
        orb.setName("Corn");
        inventory[ItemEnum.corn.ordinal()] = corn;

        return inventory;
    }

    public static InventoryItem[] getSortedInventorylist() {

        // get the inventory list for the current game
        InventoryItem[] originalInventoryList = Quest.getCurrentGame().getInventory();

        //clone (make a copy) original list
        InventoryItem[] inventoryList = originalInventoryList.clone();

        //using a BubbleSort to sort the list of inventoryList by name
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length - 1; i++) {
            for (int j = 0; j < inventoryList.length - 1 - i; j++) {
            }
            int j = 0; //why this variable is created?????????????????????????????
            if (inventoryList[j].getInventoryType().compareToIgnoreCase(inventoryList[j + 1].getInventoryType()) > 0) {
                tempInventoryItem = inventoryList[j];
                inventoryList[j] = inventoryList[j + 1];
                inventoryList[j + 1] = tempInventoryItem;
            
        }
    }
    return inventoryList;    
}  
}
