/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.quest.control;

import java.util.Arrays;

/**
 *
 * @author Arkadiusz
 */
public class ItemController {
        //Author of below Ryan

    public static void main(String args[]) {

        //String array
        String[] strNames = new String[]{"Corn", "Orb", "Enchanted Apple", "Bucket", "Bucket With Water", "Gauntlets", "Torch", "Meat", "Knife", "Map"};

        //sort String array using sort method
        Arrays.sort(strNames);

        System.out.println("String array sorted (case sensitive)");

        //print sorted elements
        for (int i = 0; i < strNames.length; i++) {
            System.out.println(strNames[i]);
        }

    }
}
