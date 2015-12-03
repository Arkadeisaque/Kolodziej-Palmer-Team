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
public class Map implements Serializable {

    //class instnce variables

    private int rowCount;
    private int columnCount;
    private Location[][] locations;


    public Map() {
    }

    public Map(int rowCount, int columnCount) {
        
        if (rowCount < 1 || columnCount < 1) {
            System.out.println("The number of columns and rows must be > zero");
            return;
        }


        this.rowCount  = rowCount;
        this.columnCount  = columnCount;

        // create 2-D array for Location objects

        this.locations  = new Location[rowCount][columnCount];

        for (int row = 0; row < rowCount; row++){
            for (int column = 0; column < columnCount; column++) {
                    //create and initialize new location object instance
                    Location location = new Location();
                    location.setColumn(column);
                    location.setRow(row);
                    location.setVisited(false);

                    locations[row][column] = location;
                }
        }
    }
    

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] location) {
        this.locations = location;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.rowCount;
        hash = 79 * hash + this.columnCount;
        hash = 79 * hash + Objects.hashCode(this.locations);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (!Objects.equals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + ", location=" + locations + '}';
    }

    /////////////////////////////////////
    //Methods
    /////////////////////////////////////

    public void init() {
        Location castle = new Location();
        //setup castle
        locations[2][8] = castle;

        Location tower = new Location();
        //setup tower
        locations[2][9] = tower;

        Location kitchen = new Location();
        //setup kitchen
        locations[1][8] = kitchen;

        Location dungeon = new Location();
        //setup dungeon
        locations[3][8] = dungeon;

        Location gallows = new Location();
        //setup gallows
        locations[1][7] = gallows;

        Location northKingdom = new Location();
        //setup northKingdom
        locations[2][7] = northKingdom;

        Location shoppe = new Location();
        //setup shoppe
        locations[3][7] = shoppe;

        Location blacksmith = new Location();
        //setup blacksmith
        locations[1][6] = blacksmith;

        Location southKingdom = new Location();
        //setup southKingdom
        locations[2][6] = southKingdom;

        Location farmer = new Location();
        //setup farmer
        locations[3][6] = farmer;

        Location westlandWoods = new Location();
        //setup westlandWoods
        locations[1][5] = westlandWoods;

        Location crossroads = new Location();
        //setup crossroads
        locations[2][5] = crossroads;

        Location bridge = new Location();
        //setup bridge
        locations[3][5] = bridge;

        Location enchantedGarden = new Location();
        //setup enchantedGarden
        locations[4][5] = enchantedGarden;

        Location deepWestlandWoods = new Location();
        //setup deepWestlandWoods
        locations[1][4] = deepWestlandWoods;

        Location mystic = new Location();
        //setup mystic
        locations[2][4] = mystic;

        Location river = new Location();
        //setup river
        locations[3][4] = river;

        Location gazebo = new Location();
        //setup gazebo
        locations[4][4] = gazebo;

        Location cave = new Location();
        //setup cave
        locations[1][3] = cave;

        Location docks = new Location();
        //setup docks
        locations[2][3] = docks;

        Location beach = new Location();
        //setup beach
        locations[3][3] = beach;

        Location deepCave = new Location();
        //setup deepCave
        locations[1][2] = deepCave;

        Location sea = new Location();
        //setup sea
        locations[2][2] = sea;

        Location westPirate = new Location();
        //setup westPirate
        locations[1][1] = westPirate;

        Location shipOfDeath = new Location();
        //setup shipOfDeath
        locations[2][1] = shipOfDeath;

        Location eastShark = new Location();
        //setup eastShark
        locations[3][1] = eastShark;
    }

}
