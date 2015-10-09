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
public class Food implements Serializable{
    //class instance variables
    private String type;
    private int quantity;
    private int value;

    public Food() {
    }
    
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.type);
        hash = 83 * hash + this.quantity;
        hash = 83 * hash + this.value;
        return hash;
    }

    @Override
    public String toString() {
        return "Food{" + "type=" + type + ", quantity=" + quantity + ", value=" + value + '}';
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Food other = (Food) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (this.quantity != other.quantity) {
            return false;
        }
        if (this.value != other.value) {
            return false;
        }
        return true;
    }
    
    
    
}
