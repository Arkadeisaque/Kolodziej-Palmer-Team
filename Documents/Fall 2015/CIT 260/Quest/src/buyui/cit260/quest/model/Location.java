/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyui.cit260.quest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Arkadiusz
 */
public class Location implements Serializable {
    //class instance variables
    private int row;
    private int column;
    private boolean visited;
    private int amountRemaining;
    private Player newPlayer;
    private Actor actor;
    private List<InventoryItem> items;

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Location() {
        items = new ArrayList<>();
    }
    

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(int amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public Player getNewPlayer() {
        return newPlayer;
    }

    public void setNewPlayer(Player newPlayer) {
        this.newPlayer = newPlayer;
    }

    public List<InventoryItem> getItems() {
        return items;
    }

    public void setItems(List<InventoryItem> items) {
        this.items = items;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.row;
        hash = 67 * hash + this.column;
        hash = 67 * hash + Objects.hashCode(this.visited);
        hash = 67 * hash + this.amountRemaining;
        hash = 67 * hash + Objects.hashCode(this.newPlayer);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (this.amountRemaining != other.amountRemaining) {
            return false;
        }
        if (!Objects.equals(this.newPlayer, other.newPlayer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", amountRemaining=" + amountRemaining + ", newPlayer=" + newPlayer + '}';
    }
  
}
