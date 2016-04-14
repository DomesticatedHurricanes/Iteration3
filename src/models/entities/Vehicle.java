package models.entities;

import models.Map.Tile;
import models.stats.VehicleStats;
import models.stats.Stats;

/**
 * Created by Breanna on 4/13/16.
 * This class represents a vehicle in the game
 * Subclass of entity
 */



public class Vehicle extends Entity{
    private VehicleStats vehicleStats;

    //create the Vehicle passing in the movement modifier
    public Vehicle(int movement) {
        this.vehicleStats = new VehicleStats(movement);
    }

    public VehicleStats getVehicleStats() { return vehicleStats; }

    @Override
    public Stats getStats() { return vehicleStats; }
}
