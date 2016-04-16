package models.entities;

import models.Inventory.Inventory;
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
        this.inventory = new Inventory(16);
    }

    public VehicleStats getVehicleStats() { return vehicleStats; }

    @Override
    public Stats getStats() { return vehicleStats; }

    @Override
    public String getType() {
        return "Vehicle";
    }
}
