/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.quest.control;

import buyui.cit260.quest.model.Map;
import buyui.cit260.quest.model.Player;

/**
 *
 * @author Arkadiusz
 */
public class LocationController {
    
    public static Map createMap(Player p) {
        // create the map
        Map map = new Map();
        
        map.init();
        
        p.setLocation(map.getLocations() [2][8]);
        
        return map;
    }
}
