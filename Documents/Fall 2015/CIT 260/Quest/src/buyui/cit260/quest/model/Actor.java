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
    private Location location;
    private ActorEnum actor;
    
    public Actor(String description) {
        this.description = description;
        location = new Location();
    }


    public Location getLocation() {
        return location;
    }
    
    public void setLocation(Location l) {
        this.location = l;
        l.setActor(this);
    }
    
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + actor + ", location=" + location + '}';
    }

    public void setActor(ActorEnum actorEnum) {
        this.actor = actorEnum;
    }
    
    public String getName() {
        return actor.toString();
    }
    
    public String getEnumDescription() {
        return actor.getDescription();
    }
    
}
