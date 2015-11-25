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
import byui.cit260.quest.view.Item;
import quest.Quest;

/**
 *
 * @author Arkadiusz
 */
public class GameController {

    public static void createNewGaame(Player player) {
        
        Game game = new Game(); //create new game
        Quest.setCurrentGame(game); //save the game in Quest
        
        game.setPlayer(game); //save player in game  ???????????????????what is the difference between save in quest and save in game???????????????
         
        //create list of inventory items and save in the game
        InventoryItem[] inventoryList = GameController.createInventoryList();
        game.setInventory(inventoryList);
         
        Map map =  MovementController.createMap(); //create the map 
        game.setMap(map); //save map in the game 
        
        //move actors to starting location 
        MovementController.moveActorsToStartingLocation(map);
    }

    private static InventoryItem[] createInventoryList() {
        // created array(list) of inventory items
        InventoryItem[] inventory = new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryItem orb = new InventoryItem();
        orb.setDescription("Orb");
        inventory[Item.orb.ordinal()] = orb;
        
        InventoryItem enchantedApple = new InventoryItem();
        orb.setDescription("Enchanted Apple");
        inventory[Item.enchantedApple.ordinal()] = enchantedApple;
        
        InventoryItem bucket = new InventoryItem();
        orb.setDescription("Bucket");
        inventory[Item.bucket.ordinal()] = bucket;
        
        InventoryItem bucketWithWater = new InventoryItem();
        orb.setDescription("bucket With Water");
        inventory[Item.bucketWithWater.ordinal()] = bucketWithWater;
        
        InventoryItem gauntlets = new InventoryItem();
        orb.setDescription("Gauntlets");
        inventory[Item.gauntlets.ordinal()] = gauntlets;
        
        InventoryItem torch = new InventoryItem();
        orb.setDescription("Torch");
        inventory[Item.torch.ordinal()] = torch;
        
        InventoryItem meat = new InventoryItem();
        orb.setDescription("Meat");
        inventory[Item.meat.ordinal()] = meat;
        
        InventoryItem knife = new InventoryItem();
        orb.setDescription("Knife");
        inventory[Item.knives.ordinal()] = knife;
          
        InventoryItem map = new InventoryItem();
        orb.setDescription("Map");
        inventory[Item.map.ordinal()] = map;
        
        InventoryItem corn = new InventoryItem();
        orb.setDescription("Corn");
        inventory[Item.corn.ordinal()] = corn;

        return inventory;
    }
}
