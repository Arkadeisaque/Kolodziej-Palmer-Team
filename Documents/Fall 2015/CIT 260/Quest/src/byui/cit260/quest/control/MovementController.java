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
        
        Actor blacksmith = new Actor("He is hungry and will trade some tools for food.");
        blacksmith.setActor(ActorEnum.Blacksmith);
        blacksmith.setLocation(map.getLocations()[1][6]); //assign the blacksmith to the blacksmith location
        
        Actor farmer = new Actor("He will ask you for help to calculate the amount of grain to plant in his field.");
        farmer.setActor(ActorEnum.Farmer);
        farmer.setLocation(map.getLocations()[3][6]); //assign farmer to farm
        
        Actor guard = new Actor("Guard will gives you a riddle so you can go out of the prison.");
        guard.setActor(ActorEnum.Guard);
        guard.setLocation(map.getLocations()[3][8]); //Assign the guard to dungeon
        
        Actor mistic = new Actor("This men will gives you a good advice.");
        mistic.setActor(ActorEnum.Mystic);
        mistic.setLocation(map.getLocations()[2][4]); //Assign the mistic to the mystic location
        
        //TODO SETUP EVERYONE - done
    }
    
    
    //TODO move the player !!!!!!!!!!!

}
