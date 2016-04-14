package models.stats;

/**
 * Created by ben on 4/11/16.
 */
public class VehicleStats extends Stats {
    private StatModifier movementMod;

    //Creates a stat modifiers off of the vehicles speed
    public VehicleStats(int movement){
        this.movement = movement;
        movementMod = StatModifier.makeMovementModifier(this.movement);
    }
}