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
public class InventoryItem implements Serializable, Comparable {
    
    //class instance variables
    private String inventoryType;
    private int quantityInStock;
    private Location[][] location; 
    private String name;
    private InventoryItem prerequisite;

    public InventoryItem(String inventoryType) {
        this.inventoryType = inventoryType;
 //       location = new Location(1,1);
    }

    public InventoryItem() {
        
    }

    public InventoryItem getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(InventoryItem prerequisite) {
        this.prerequisite = prerequisite;
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
        return "InventoryItem{" + "name=" + name + ", inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + '}';
    }
    
    //////////////////////////////////
    // MY METHODS
    //////////////////////////////////
    
    public void init() {
        
        InventoryItem name = new InventoryItem(); //setup orb
        name.setName("Orb");
        
        InventoryItem enchantedApple = new InventoryItem(); //setup enchanted apple
        name.setName("Enchanted Apple");
        
        InventoryItem bucket = new InventoryItem(); //setup bucket
        name.setName("Bucket");
        
        InventoryItem water = new InventoryItem(); //setup water
        name.setName("Water");
        
        InventoryItem gauntlets = new InventoryItem(); //setup gauntlets
        name.setName("Gauntlets");
        
        InventoryItem torch = new InventoryItem(); //setup torch
        name.setName("Torch");
        
        InventoryItem meat = new InventoryItem(); //setup meat
        name.setName("Meat");
        
        InventoryItem knife = new InventoryItem(); //setup knife
        name.setName("Knife");
        
        InventoryItem mapItem = new InventoryItem(); //setup map
        name.setName("Map Item");
        
        InventoryItem corn = new InventoryItem(); //setup corn
        name.setName("Corn");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        if (o == null){
            return -1;
        }
        InventoryItem a = (InventoryItem) o;
        if (this.getName() == null){
            return 1;
        }
        return this.getName().compareTo(a.getName());
    }


}
