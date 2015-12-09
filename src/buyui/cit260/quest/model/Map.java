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
        setup(10, 10);
    }

    public Map(int rowCount, int columnCount) {
        setup(rowCount, columnCount);
    }

    public void setup(int rowCount, int columnCount) {
        if (rowCount < 1 || columnCount < 1) {
            System.out.println("The number of columns and rows must be > zero");
            return;
        }

        this.rowCount = rowCount;
        this.columnCount = columnCount;

        // create 2-D array for Location objects
        this.locations = new Location[rowCount][columnCount];

        for (int row = 0; row < rowCount; row++) {
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
        castle.setDescription("a castle - large and old and awesome - a bucket is also visible");
        castle.setRow(2);
        castle.setColumn(8);
        castle.setLocationType(LocationType.Castle);
        //setup castle
        locations[2][8] = castle;

        //TODO set descriptions on all locations
        Location tower = new Location();
        tower.setDescription("The view from the top of the tower is astounding-A quill and paper is visible");
        tower.setLocationType(LocationType.Tower);
        //setup tower
        locations[2][9] = tower;
        tower.setRow(2);
        tower.setColumn(9);

        Location kitchen = new Location();
        kitchen.setDescription("In the kitchen there is a chopping block with knives, a bucket, and some meat.");

        //setup kitchen
        locations[1][8] = kitchen;
        kitchen.setRow(1);
        kitchen.setColumn(8);

        Location dungeon = new Location();
        dungeon.setDescription("The Dungeon has two cells and a guard, with one cell initially occupied. You can go down and talk to the guard and prisoner, and the guard will mention he likes riddles. If you try to steal from the shoppe, blacksmith, or farmer then you end up in the dungeon. In order to get out, you have to solve the riddle from the guard.");
        //setup dungeon
        //TODO create a riddle to get out of dungeon
        locations[3][8] = dungeon;
        dungeon.setRow(3);
        dungeon.setColumn(8);

        Location gallows = new Location();
        gallows.setDescription("As you enter the gallows you feel like are being watched. There is a circle of torches around the edge. If you approach a torch you are ask if you would like to pick it up and carry it with you. However, the torch is tied down, so only if you took the knives from the kitchen. ");
        //setup gallows
        locations[1][7] = gallows;
        gallows.setRow(1);
        gallows.setColumn(7);

        Location northKingdom = new Location();
        northKingdom.setDescription("The player is presented with 4 obvious exits. North to the castle, east to the shoppe, west to the gallows, or south to the south kingdom. ");
        //setup northKingdom
        locations[2][7] = northKingdom;

        Location shoppe = new Location();
        shoppe.setDescription("At the shoppe you can buy/exchange different items, such as different quest items (like the bucket or torch).");
        //setup shoppe
        locations[3][7] = shoppe;

        Location blacksmith = new Location();
        blacksmith.setDescription("The blacksmith is hungry because of the famine and wants food. You see a pair of iron gauntlets that he has made. Obvious exits are east to the kingdom.");
        //setup blacksmith
        locations[1][6] = blacksmith;

        Location southKingdom = new Location();
        southKingdom.setDescription("The player is presented with a screen that describes the kingdom visually. Obvious exits will be North to the castle, South to the Crossroads, west to the blacksmith, and east to the farmer. No items or people are seen.");
        //setup southKingdom
        locations[2][6] = southKingdom;

        Location farmer = new Location();
        farmer.setDescription("The farmer looks stressed out. You see a fox, some corn, and a chicken. Obvious exits are west to the kingdom.");
        //setup farmer
        locations[3][6] = farmer;

        Location westlandWoods = new Location();
        westlandWoods.setDescription("The player will try to enter but will be forced out because of a mystical force. The woods must be enchanted. ");
        //setup westlandWoods
        locations[1][5] = westlandWoods;

        Location crossroads = new Location();
        crossroads.setDescription("The player will see a mysterious figure disappear into the Westland woods. There are no items here. Obvious exits are west to the Westland woods, south to the sea east to the bridge, or north to the kingdom.");
        //setup crossroads
        locations[2][5] = crossroads;

        Location bridge = new Location();
        bridge.setDescription("A player sees a bridge covered with thorn bushes. If the player tries to cross the bridge he or she will get a cut on the hand and not proceed. The only exit is west to the crossroads.");
        //setup bridge
        locations[3][5] = bridge;

        Location enchantedGarden = new Location();
        enchantedGarden.setDescription("The player sees a garden that was once beautiful. The fruit of the garden is enchanted and will give eaters powers. Because of the curse the garden is dying. The player sees a dying apple tree that looks like it needs a little water. The player also sees apples that don’t look good enough to eat.");
        //setup enchantedGarden
        locations[4][5] = enchantedGarden;

        Location deepWestlandWoods = new Location();
        deepWestlandWoods.setDescription("The deep woods look terrifying and dark. It is very quiet. The player thought he or she saw a mysterious looking man but at a closer glance decides he or she is mistaken. The player sees the Mystic Orb of Rejuvenation.");
        //setup deepWestlandWoods
        locations[1][4] = deepWestlandWoods;

        Location mystic = new Location();
        mystic.setDescription("The player sees a mysterious man who warns him or her about the dangers of sailing at sea.");
        //setup mystic
        locations[2][4] = mystic;

        Location river = new Location();
        river.setDescription("In the river you die. That is pretty much all you get for jumping off a bridge into rapids. The game restarts.");
        //setup river
        locations[3][4] = river;

        Location gazebo = new Location();
        gazebo.setDescription("The player sees a beautiful gazebo with a soft seat. It looks like a nice place for a rest. If the player rests the famine will overthrow the kingdom before he or she wakes up. Game over.");
        //setup gazebo
        locations[4][4] = gazebo;

        Location cave = new Location();
        cave.setDescription("As you are walking through the woods you see a cave. You have the choice if you would like to enter it. As you walk into it feels dark and damp, the farther in you go the darker and damper it becomes. Eventually it becomes too dark to see. ");
        //setup cave
        locations[1][3] = cave;

        Location docks = new Location();
        docks.setDescription("The player sees a ship that is ready for sailing.");
        //setup docks
        locations[2][3] = docks;

        Location beach = new Location();
        beach.setDescription("You can get here from the docks. The player can take a stroll and build a sand castle. It gets washed away.");
        //setup beach
        locations[3][3] = beach;

        Location deepCave = new Location();
        deepCave.setDescription("You have wandered deep into the cave. If you have a torch from the gallows you are able to see a tunnel that leads you out to the beach.");
        //setup deepCave
        locations[1][2] = deepCave;

        Location sea = new Location();
        sea.setDescription("The water is crystal clear a player sees the water and no people. The only exit is north to the crossroads");
        //setup sea
        locations[2][2] = sea;

        Location westPirate = new Location();
        westPirate.setDescription("One of the ship destination – you die killed by the pirate. Game restarts.");
        //setup westPirate
        locations[1][1] = westPirate;

        Location shipOfDeath = new Location();
        shipOfDeath.setDescription("The ship gives you the option to go east or west. Either way is not a good way to go.");
        //setup shipOfDeath
        locations[2][1] = shipOfDeath;

        Location eastShark = new Location();
        eastShark.setDescription("One of the ship destination – you die killed by the shark. Game restarts.");
        //setup eastShark
        locations[3][1] = eastShark;
    }

    public Location[][] getlocations() {
        return locations;
    }

    public void setlocations(Location[][] locations) {
        this.locations = locations;
    }

    public Location getLocation(int row, int column) {
        if (row < 0 || row > locations.length) {
            return null;
        }
        if (column < 0 || column > locations[0].length) {
            return null;
        }
        return locations[row][column];
    }

    public String getMapDisplay() {
        String rtn = "";

        for (int row = 0; row < locations.length; row++) {
            for (int column = 0; column < locations[0].length; column++) {
                rtn += "[" + locations[row][column].getLocationType() + "]";
            }
            rtn += "\n";
        }
        return rtn;
    }

    public Location getCastleLocation() {
        for (int row = 0; row < locations.length; row++) {
            for (int column = 0; column < locations[0].length; column++) {
                if (locations[row][column].getLocationType() == LocationType.Castle) {
                    return locations[row][column];
                }

            }

        }
        return null;
    }
}
