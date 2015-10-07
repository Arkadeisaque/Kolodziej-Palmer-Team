/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest;

import buyui.cit260.quest.model.Game;

/**
 *
 * @author Arkadiusz
 */
public class Quest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game totalTime = new Game();
        
        totalTime.setTotalTime(12);
        
        String playerInfo = totalTime.toString();
        System.out.println(playerInfo);
        
    }
    
}
