package models.stats;

/**
 * Created by ben on 4/11/16.
 */
//Description:The overall heirarchy of all stats.  This is the apex of stats
public class Stats {
    //Stats all entities have
    protected int movement;

    //Getter and modifiers for stats
    public int getMovement() {
        return movement;
    }

    public void modifyMovement(int movement) {
        this.movement += movement;
    }

}
