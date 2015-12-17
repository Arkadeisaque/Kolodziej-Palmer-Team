/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest;


import buyui.cit260.quest.model.Actor;
import buyui.cit260.quest.model.Game;
import buyui.cit260.quest.model.InventoryItem;
import buyui.cit260.quest.model.Location;
import buyui.cit260.quest.model.Map;
import buyui.cit260.quest.model.Player;
import byui.cit260.quest.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arkadiusz
 */
public class Quest {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    public static void main(String[] args) {
        try {
            // open character stream files for end user input and output
            Quest.inFile = new BufferedReader(new InputStreamReader(System.in));
            Quest.outFile = new PrintWriter(System.out, true);
            
            // open log file
            String filePath = "log.txt";
            Quest.logFile = new PrintWriter(filePath);
            
            // create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.startProgram();
            return;
        } catch (Throwable e) {
            System.out.println("Exception: " + e.toString() +
                                "\nCause: " + e.getCause() +
                                "\nMessage: " + e.getMessage());
            e.printStackTrace();;
        }
        finally {
            try {
                if (Quest.inFile != null)
                    Quest.inFile.close();
                
                if (Quest.outFile != null);
                    Quest.outFile.close();
                    
                if (Quest.logFile != null);
                    Quest.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Quest.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Quest.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Quest.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Quest.inFile = inFile;
    }
    
    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Quest.logFile = logFile;
    }

    
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        //create the start program view and start the program
//        StartProgramView startProgramView = new StartProgramView(); //this creates a new object instance of the class folloewed by a call to the default constructor function
//        startProgramView.startProgram(); //this statement calls the startProgram() function
        
        
        /*Game totalTime = new Game();
        
        totalTime.setTotalTime(12);
        
        String gameInfo = totalTime.toString();
        System.out.println(gameInfo);
        
        Player playerOne = new Player();
        
        playerOne.setName("Marcus Orelius");
        playerOne.setStrenght(70);
        playerOne.setHealth(100);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Map rowColumnCount = new Map();
        
        rowColumnCount.setRowCount(10);
        rowColumnCount.setColumnCount(4);
        
        String mapInfo = rowColumnCount.toString();
        System.out.println(mapInfo);
        
        Location mapOne = new Location();
        
        mapOne.setRow(5);
        mapOne.setColumn(2);
        mapOne.setVisited("Crossroads");
        mapOne.setAmountRemaining(2);
        
        String locationInfo = mapOne.toString();
        System.out.println(locationInfo);
        
        InventoryItem newInventory = new InventoryItem();
        newInventory.setInventoryType("knife");
        newInventory.setQuantityInStock(3);
        newInventory.setRequiredAmount(2);
        
        String inventoryInfo = newInventory.toString();
        System.out.println(inventoryInfo);
        
        Actor actorOne = new Actor();
        
        actorOne.setActorName("King");
        Location[][] location = null;
        actorOne.setLocation(location[2][8]);
        
        String actorInfo = actorOne.toString();
        System.out.println(actorOne);*/
//    }    
//
//    /*public static void setPlayer(Player player) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }*/ //probably created by accident???
}