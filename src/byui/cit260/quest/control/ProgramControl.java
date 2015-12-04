/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.quest.control;

import buyui.cit260.quest.model.Player;
import quest.Quest;

/**
 *
 * @author Arkadiusz
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
    
        Player player = new Player();
        player.setName(name);

        Quest.setPlayer(player); //save the player

        return player;
    
    }
}
