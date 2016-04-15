package models.entities;

import models.stats.VehicleStats;
import models.stats.Stats;

/**
 * Created by Breanna on 4/13/16.
 * This class represents a vehicle in the game
 * Subclass of entity
 */
<<<<<<< HEAD
public class Vehicle extends Entity {

=======



public class Vehicle extends Entity{
>>>>>>> ea585cf5ba3caaac7cfe11f751c1c0bc8ac30e6d
    private VehicleStats vehicleStats;

    //create the Vehicle passing in the movement modifier
    public Vehicle(int movement) {
        this.vehicleStats = new VehicleStats(movement);
    }

    public VehicleStats getVehicleStats() { return vehicleStats; }

    @Override
    public Stats getStats() { return vehicleStats; }
}
