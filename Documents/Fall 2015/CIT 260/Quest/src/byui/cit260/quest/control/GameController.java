/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.quest.control;

import buyui.cit260.quest.model.Game;
import buyui.cit260.quest.model.InventoryItem;
import buyui.cit260.quest.model.LocationType;
import buyui.cit260.quest.model.Map;
import buyui.cit260.quest.model.Player;
import byui.cit260.quest.view.ItemEnum;
import java.util.Arrays;
import quest.Quest;

/**
 *
 * @author Arkadiusz
 */
public class GameController {

    public static final int NUMBER_OF_INVENTORY_ITEMS = 10;

    public static void createNewGaame(Player player) {

        Game game = Game.getInstance(); //create new game
        Quest.setCurrentGame(game); //save the game in Quest

        game.setPlayer(player); //save player in game  ???????????????????what is the difference between save in quest and save in game???????????????

        Map map = MovementController.createMap(); //create the map 
        map.init();////new as of 12/8
        Game.getInstance().setMap(map);////new as of 12/8
        
        game.setMap(map); //save map in the game 

        //create list of inventory items and save in the game
        InventoryItem[] inventoryList = GameController.createInventoryList();
        game.setInventory(inventoryList);

        //move actors to starting location 
        MovementController.moveActorsToStartingLocation(map);
        
    }

    private static InventoryItem[] createInventoryList() {

        Map map = Game.getInstance().getMap();

        // created array(list) of inventory items
        InventoryItem[] inventory = new InventoryItem[NUMBER_OF_INVENTORY_ITEMS];

        InventoryItem corn = new InventoryItem();
        corn.setName("Corn");
        inventory[ItemEnum.corn.ordinal()] = corn;
        map.getLocations()[3][6].addItem(corn);

        InventoryItem orb = new InventoryItem();
        orb.setName("Orb");
        inventory[ItemEnum.orb.ordinal()] = orb;
        map.getLocations()[1][4].addItem(orb); //TODO more of this

        InventoryItem bucket = new InventoryItem();
        bucket.setName("Bucket");
        inventory[ItemEnum.bucket.ordinal()] = bucket;
        map.getLocations()[2][8].addItem(bucket);
        map.getLocations()[1][8].addItem(bucket);

        InventoryItem water = new InventoryItem();
        water.setName("Water");
        inventory[ItemEnum.water.ordinal()] = water;
        map.getLocations()[2][2].addItem(water);
        map.getLocations()[3][3].addItem(water);
        water.setPrerequisite(bucket);

        InventoryItem enchantedApple = new InventoryItem();
        enchantedApple.setName("Enchanted Apple");
        inventory[ItemEnum.enchantedApple.ordinal()] = enchantedApple;
        map.getLocations()[4][5].addItem(enchantedApple);
        enchantedApple.setPrerequisite(water);

        InventoryItem gauntlets = new InventoryItem();
        gauntlets.setName("Gauntlets");
        map.getLocations()[1][6].addItem(gauntlets);
        gauntlets.setPrerequisite(corn);
        inventory[ItemEnum.gauntlets.ordinal()] = gauntlets;

        InventoryItem knife = new InventoryItem();
        knife.setName("Knife");
        inventory[ItemEnum.knives.ordinal()] = knife;
        map.getLocations()[1][8].addItem(knife);
        //Game.getInstance().getPlayer().getItems().add(knife); //TODO REMOVE THIS

        InventoryItem torch = new InventoryItem();
        torch.setName("Torch");
        map.getLocations()[1][7].addItem(torch); //TODO more of this
        torch.setPrerequisite(knife);
        inventory[ItemEnum.torch.ordinal()] = torch;

        InventoryItem meat = new InventoryItem();
        meat.setName("Meat");
        inventory[ItemEnum.meat.ordinal()] = meat;
        map.getLocations()[1][8].addItem(meat);

        InventoryItem mapItem = new InventoryItem();
        mapItem.setName("Map Item");
        inventory[ItemEnum.mapItem.ordinal()] = mapItem;
        map.getLocations()[2][9].addItem(mapItem);

        return inventory;
    }

    public static InventoryItem[] getSortedInventorylist() {

        // get the inventory list for the current game
        InventoryItem[] originalInventoryList = Game.getInstance().getPlayer().getItems().toArray(new InventoryItem[Game.getInstance().getPlayer().getItems().size()]);

        
        //clone (make a copy) original list
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
        Arrays.sort(inventoryList);
        //using a BubbleSort to sort the list of inventoryList by name
//        InventoryItem tempInventoryItem;
//        for (int i = 0; i < inventoryList.length - 1; i++) {
//            for (int j = 0; j < inventoryList.length - 1 - i; j++) {
//            }
//            int j = 0; //why this variable is created?????????????????????????????
//            if (inventoryList[j].getInventoryType().compareToIgnoreCase(inventoryList[j + 1].getInventoryType()) > 0) {
//                tempInventoryItem = inventoryList[j];
//                inventoryList[j] = inventoryList[j + 1];
//                inventoryList[j + 1] = tempInventoryItem;
//
//            }
//        }
        return inventoryList;
    }
}
