/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.quest.control;

import buyui.cit260.quest.model.Actor;
import buyui.cit260.quest.model.Game;
import buyui.cit260.quest.model.Map;
import byui.cit260.quest.view.ActorEnum;

/**
 *
 * @author Arkadiusz
 */
public class MovementController {

    public static Map createMap() { //another method createMap() is in LocationController class?????
        //create the map
        Map map = new Map();
        map.init();

        //create a list of the different scenes in the game ??????????????????
        //assign the different scenes to locations in the map ????????????????
        return map;
    }

    public static void moveActorsToStartingLocation(Map map) {
        
        //SETUP the player first
        Game.getInstance().getPlayer().setLocation(map.getLocations()[2][8]);
        
        //SETUP everyone else
        Actor king = new Actor("I'm the king");
        king.setActor(ActorEnum.King);
        king.setLocation(map.getLocations()[2][8]); //Assign the king to the castle
        
        
        //TODO SETUP EVERYONE
    }
    
    
    //TODO move the player

}
