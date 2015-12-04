/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyui.cit260.quest.model;

import byui.cit260.quest.view.ActorEnum;
import java.io.Serializable;

/**
 *
 * @author Arkadiusz
 */
public class Actor implements Serializable{
    
    //class instance variables
    private final String description;
    private final Location location;
    private ActorEnum actor;
    
    Actor(String description) {
        this.description = description;
        location = new Location();
    }


    public Location getLocation() {
        return location;
    }
    
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + actor + ", location=" + location + '}';
    }

    public void setActor(String King) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
