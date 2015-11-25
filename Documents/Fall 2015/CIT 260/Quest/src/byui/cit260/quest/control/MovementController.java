/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.quest.control;

import buyui.cit260.quest.model.Map;

/**
 *
 * @author Arkadiusz
 */
public class MovementController {

    public static Map createMap() { //another method createMap() is in LocationController class?????
        //create the map
        Map map = new Map();
        map.init();

        //create a list of the different scenes in the game ??????????????????
        //assign the different scenes to locations in the map ????????????????
        return map;
    }

    static void moveActorsToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
