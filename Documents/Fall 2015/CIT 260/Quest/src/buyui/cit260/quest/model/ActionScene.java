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
public class ActionScene implements Serializable{
    //class instance variables
    private String description;
    private double travelTime;

    public ActionScene() {
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "ActionScene{" + "description=" + description + ", travelTime=" + travelTime + '}';
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ActionScene other = (ActionScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        return true;
    }
    
    
}
