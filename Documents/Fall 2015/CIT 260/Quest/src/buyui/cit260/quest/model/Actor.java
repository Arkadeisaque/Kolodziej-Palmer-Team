/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyui.cit260.quest.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Arkadiusz
 */
public enum Actor implements Serializable{
    
    King("King sends you to the quest for the magic orb."),
    Blacksmith("He is hungry and will trade some tools for food."),
    Farmer("He will ask you for help to calculate the amount of grain to plant in his field."),
    Guard("Guard will gives you a riddle so you can go out of the prison."),
    Mystic("This men will gives you a good advice.");
    
    private final String description;
    private final Location location;
    
    Actor(String description) {
        this.description = description;
        location = new Location(1,1);
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
