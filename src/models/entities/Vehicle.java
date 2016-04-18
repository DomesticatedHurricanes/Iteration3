package models.entities;

import models.Graphics.GraphicAssets;
import models.Inventory.Inventory;
import models.stats.StatModifier;
import models.stats.VehicleStats;
import models.stats.Stats;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * Created by Breanna on 4/13/16.
 * This class represents a vehicle in the game
 * Subclass of entity
 */

public class Vehicle extends Entity {
    private VehicleStats vehicleStats;
    private boolean mounted;

    //create the Vehicle passing in the movement modifier
    public Vehicle(int movement) {
        this.vehicleStats = new VehicleStats(movement);
        this.inventory = new Inventory(16);
        this.mounted = false;
        this.entityImage = GraphicAssets.laprasS;
        this.entityImages = GraphicAssets.laprasAll;
    }

    public VehicleStats getVehicleStats() {
        return vehicleStats;
    }

    @Override
    public Stats getStats() {
        return vehicleStats;
    }

    public boolean getMounted() {
        return mounted;
    }

    public void unmounted(Avatar avatar) {
        mounted = false;
        entityImage = GraphicAssets.laprasS;
        StatModifier SM = StatModifier.makeMovementModifier(-(vehicleStats.getMovement()));
        SM.apply(avatar.getStats());

    }

    public void isMounted(Avatar avatar) {
        mounted = true;
        //entityImage = null;
        this.setLocation(avatar.getLocation());
        StatModifier SM = StatModifier.makeMovementModifier(vehicleStats.getMovement());
        SM.apply(avatar.getStats());
    }

}
