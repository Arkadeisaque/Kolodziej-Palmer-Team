/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest;

import buyui.cit260.quest.model.ActionScene;
import buyui.cit260.quest.model.Artifacts;
import buyui.cit260.quest.model.Food;
import buyui.cit260.quest.model.Game;
import buyui.cit260.quest.model.InventoryItem;
import buyui.cit260.quest.model.Location;
import buyui.cit260.quest.model.Map;
import buyui.cit260.quest.model.Player;
import buyui.cit260.quest.model.RegularScene;
import buyui.cit260.quest.model.ResourceActionScene;
import buyui.cit260.quest.model.Tools;

/**
 *
 * @author Arkadiusz
 */
public class Quest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game totalTime = new Game();
        
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
        
        ResourceActionScene resourceSceneOne = new ResourceActionScene();
        resourceSceneOne.setDescription(" The Ord is inside of a locked box.");
        resourceSceneOne.setQuantity(1);
        resourceSceneOne.setValue(100000);
        resourceSceneOne.setTravelTime((int) 1.30);
        
        String resourceSceneInfo = resourceSceneOne.toString();
        System.out.println(resourceSceneInfo);
        
        RegularScene regularSceneOne = new RegularScene();
        regularSceneOne.setDescription("There are no items here.");
        regularSceneOne.setTravelTime(0.15);
        
        String regularSceneInfo = regularSceneOne.toString();
        System.out.println(regularSceneInfo);
        
        ActionScene actionSceneOne = new ActionScene();
        actionSceneOne.setDescription(" The player can take a stroll and build a sand castle.");
        actionSceneOne.setTravelTime(0.45);
        
        String actionSceneInfo = actionSceneOne.toString();
        System.out.println(actionSceneInfo);
        
        InventoryItem newInventory = new InventoryItem();
        newInventory.setInventoryType("knife");
        newInventory.setQuantityInStock(3);
        newInventory.setRequiredAmount(2);
        
        String inventoryInfo = newInventory.toString();
        System.out.println(inventoryInfo);
        
        Artifacts newArtifact = new Artifacts();
        newArtifact.setType("ord-critical to win the game");
        newArtifact.setQuantity(1);
        newArtifact.setValue(10000);
        
        String artifactInfo = newArtifact.toString();
        System.out.println(artifactInfo);
        
        Tools newTool = new Tools();
        newTool.setType("knife-cutting tool and weapon");
        newTool.setQuantity(10);
        newTool.setValue(250);
        
        String toolInfo = newTool.toString();
        System.out.println(toolInfo);
        
        Food newFood = new Food();
        newFood.setType("zombie meat-turn you into a zombie");
        newFood.setValue(25);
        newFood.setQuantity(3);
        
        String foodInfo = newFood.toString();
        System.out.println(foodInfo);
        
    }    
}
