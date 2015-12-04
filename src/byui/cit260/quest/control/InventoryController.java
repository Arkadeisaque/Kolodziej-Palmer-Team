/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.quest.control;

import buyui.cit260.quest.model.InventoryItem;
import buyui.cit260.quest.model.Player;
import buyui.cit260.quest.model.Location;

/**
 *
 * @author Arkadiusz
 */
public class InventoryController {
    
    public boolean collectItemsAtLocation(Player p) {
        
        Location currentLocation = p.getLocation();
        
        if(currentLocation.getItems().size() > 0) {
            p.getItems().addAll(currentLocation.getItems());
            currentLocation.getItems().clear();
//            for(InventoryItem i : currentLocation.getItems()) {
//                p.getItems().add(i);
//            }
            return true;
        }
        
        return false;
    }
    
}
