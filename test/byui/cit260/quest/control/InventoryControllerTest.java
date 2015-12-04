/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.quest.control;

import buyui.cit260.quest.model.InventoryItem;
import buyui.cit260.quest.model.Location;
import buyui.cit260.quest.model.Player;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class InventoryControllerTest {
    
    public InventoryControllerTest() {
    }

    /**
     * Test of collectItemsAtLocation method, of class InventoryController.
     */
    @Test
    public void testCollectItemsAtLocation() {
        System.out.println("collectItemsAtLocation");
        Player p = new Player();
        InventoryItem torch = new InventoryItem();
        Location castle = new Location();
        
        p.setLocation(castle);
        castle.getItems().add(torch);
        
        InventoryController instance = new InventoryController();
        boolean expResult = true;
        boolean result = instance.collectItemsAtLocation(p);
        assertEquals(expResult, result);
        assertEquals(p.getItems().size(), 1);
        assertEquals(castle.getItems().size(), 0);
        
        expResult = false;
        result = instance.collectItemsAtLocation(p);
        assertEquals(expResult, result);
        
    }
    
}
