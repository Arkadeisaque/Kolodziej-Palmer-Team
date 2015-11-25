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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
