/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.quest.control;

import buyui.cit260.quest.model.Location;

/**
 *
 * @author Arkadiusz
 */
public class TalkController {
    public boolean talkToActor(Location location, String name){
        if (location.getActor() != null) //if location has a actor, playe talks with him
            return true;
        else {
            return false;
        }
        
    }
}
