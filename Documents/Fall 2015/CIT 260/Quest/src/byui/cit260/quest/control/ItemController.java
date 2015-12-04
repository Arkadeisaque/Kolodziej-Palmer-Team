/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.quest.control;

import buyui.cit260.quest.model.InventoryItem;
import buyui.cit260.quest.model.Location;
import buyui.cit260.quest.model.Player;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Arkadiusz
 */
public class ItemController {

   public String lookForItems(Location l, Player p) {
       
       String rtn = "You find: ";
       
       List<InventoryItem> toRemoveFromLocation = new ArrayList<InventoryItem>();
       
       if(l.getItems().size() > 0) { //If there are items here
           for(InventoryItem i : l.getItems()) {
               
               if(i.getPrerequisite() != null) {
                   //Check to see if player has prerequisite item
                   InventoryItem prereq = i.getPrerequisite();
                   if(p.getItems().contains(prereq)) {
                       //You've got it so add it
                       rtn += i.getName() + " ";
                       p.getItems().add(i);
                       toRemoveFromLocation.add(i);
                   } else {
                       rtn += "[See " + i.getName() + " but need " + prereq.getName() + "] ";
                   }
               } else {
                   rtn += i.getName() + " ";
                   p.getItems().add(i);
                   toRemoveFromLocation.add(i);
               }
           }
           
           l.getItems().removeAll(toRemoveFromLocation);
           
           return rtn;
       }
       
       rtn += "Nothing";
       
       return rtn;
   }
    
}
