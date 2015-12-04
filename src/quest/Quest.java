/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest;


import buyui.cit260.quest.model.Actor;
import buyui.cit260.quest.model.Game;
import buyui.cit260.quest.model.InventoryItem;
import buyui.cit260.quest.model.Location;
import buyui.cit260.quest.model.Map;
import buyui.cit260.quest.model.Player;
import byui.cit260.quest.view.StartProgramView;

/**
 *
 * @author Arkadiusz
 */
public class Quest {
    
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Quest.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Quest.player = player;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create the start program view and start the program
        StartProgramView startProgramView = new StartProgramView(); //this creates a new object instance of the class folloewed by a call to the default constructor function
        startProgramView.startProgram(); //this statement calls the startProgram() function
        
        
        /*Game totalTime = new Game();
        
        totalTime.setTotalTime(12);
        
        String gameInfo = totalTime.toString();
        System.out.println(gameInfo);
        
        Player playerOne = new Player();
        
        playerOne.setName("Marcus Orelius");
        playerOne.setStrenght(70);
        playerOne.setHealth(100);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Map rowColumnCount = new Map();
        
        rowColumnCount.setRowCount(10);
        rowColumnCount.setColumnCount(4);
        
        String mapInfo = rowColumnCount.toString();
        System.out.println(mapInfo);
        
        Location mapOne = new Location();
        
        mapOne.setRow(5);
        mapOne.setColumn(2);
        mapOne.setVisited("Crossroads");
        mapOne.setAmountRemaining(2);
        
        String locationInfo = mapOne.toString();
        System.out.println(locationInfo);
        
        InventoryItem newInventory = new InventoryItem();
        newInventory.setInventoryType("knife");
        newInventory.setQuantityInStock(3);
        newInventory.setRequiredAmount(2);
        
        String inventoryInfo = newInventory.toString();
        System.out.println(inventoryInfo);
        
        Actor actorOne = new Actor();
        
        actorOne.setActorName("King");
        Location[][] location = null;
        actorOne.setLocation(location[2][8]);
        
        String actorInfo = actorOne.toString();
        System.out.println(actorOne);*/
    }    

    /*public static void setPlayer(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/ //probably created by accident???
}