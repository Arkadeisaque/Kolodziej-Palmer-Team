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
public class InventoryItem implements Serializable{
    
    //class instance variables
    private final String inventoryType;
    private final int quantityInStock;
    private final Location[][] location; 

    InventoryItem(String inventoryType) {
        this.inventoryType = inventoryType;
        location = new Location(1,1);
    }
    
    
    public String getInventoryType() {
        return inventoryType;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public Location[][] getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "name=" + name + ", inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + '}';
    }
    
    //////////////////////////////////
    // MY METHODS
    //////////////////////////////////
    
    public void init() {
        
        InventoryItem name = new InventoryItem(); //setup orb
        name.setName("orb");
        
        InventoryItem enchantedApple = new InventoryItem(); //setup enchanted apple
        
        InventoryItem bucket = new InventoryItem(); //setup bucket
        
        InventoryItem bucketWithWater = new InventoryItem(); //setup bucket with water
        
        InventoryItem gauntlets = new InventoryItem(); //setup gauntlets
        
        InventoryItem torch = new InventoryItem(); //setup torch
        
        InventoryItem meat = new InventoryItem(); //setup meat
        
        InventoryItem knife = new InventoryItem(); //setup knife
        
        InventoryItem map = new InventoryItem(); //setup map
        
        InventoryItem corn = new InventoryItem(); //setup corn
    }
}
