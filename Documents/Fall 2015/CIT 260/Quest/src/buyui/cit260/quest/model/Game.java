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
public class Game implements Serializable{
    
    // class instance variables
    private int totalTime; 
    private Player newPlayer;
    private Map matrix;
    

    public Game(int totalTime) {
        this.totalTime = totalTime;
    }

    public Player getNewPlayer() {
        return newPlayer;
    }

    public void setNewPlayer(Player newPlayer) {
        this.newPlayer = newPlayer;
    }

    public Map getMatrix() {
        return matrix;
    }

    public void setMatrix(Map matrix) {
        this.matrix = matrix;
    }

    public Game() {
        
    }
    

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.totalTime;
        hash = 37 * hash + Objects.hashCode(this.newPlayer);
        hash = 37 * hash + Objects.hashCode(this.matrix);
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
        final Game other = (Game) obj;
        if (this.totalTime != other.totalTime) {
            return false;
        }
        if (!Objects.equals(this.newPlayer, other.newPlayer)) {
            return false;
        }
        if (!Objects.equals(this.matrix, other.matrix)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", newPlayer=" + newPlayer + ", matrix=" + matrix + '}';
    }
    
}
