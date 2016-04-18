package models.stats;

/**
 * Created by ben on 4/11/16.
 */
//Description:The overall heirarchy of all stats.  This is the apex of stats
public class Stats {

    protected int maxHp;
    protected int currentHp;

    public int getMaxHp() {
        return maxHp;
    }

    public void modifyMaxHp(int hp) {
        this.maxHp += hp;
    }

    public int getCurrentHp() { return currentHp;}

    public void modifyCurrentHp(int hp) {
        this.currentHp += hp;
    }
    //Stats all entities have
    protected int movement;
    protected int jumpHeight = 9;
    //Getter and modifiers for stats
    public int getMovement() {
        return movement;
    }

    public int getJumpHeight(){return jumpHeight;}

    public void setJumpHeight(int x){
        this.jumpHeight = x;
    }

    public void modifyMovement(int movement) {
        this.movement += movement;
    }

    public void modifyJumpHeight(int jumpHeight){this.jumpHeight+=jumpHeight; }

}
