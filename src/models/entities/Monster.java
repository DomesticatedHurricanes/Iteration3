package models.entities;

import models.Interaction.AIObserver;

import models.AI.MonsterBrain;

import models.entities.defaultNpcStat.NPCInitialStats;
import models.stats.CharacterStats;
import models.Inventory.Inventory;
import utilities.Point3D;
import models.entities.defaultNpcStat.MonsterStats;

import java.util.Observer;

public class Monster extends AINpc implements Movement {

    private boolean isMoving;
    private boolean isAttacking;
    private NPCInitialStats initialStats;
    private MonsterBrain monsterBrain;

    public Monster() {
        this.monsterBrain = new MonsterBrain();
        this.npcStats = new CharacterStats();
        this.initialStats = new MonsterStats();
        initialStats.initStats(npcStats);
        this.inventory = new Inventory(16);
    }

    public void getNewDirection() {
        monsterBrain.changeDirection();
    }

    //called when a monster attacks
    public void attack() {
    }

    //called when a monster uses a skill
    public void useSkill() {
    }

    @Override
    public boolean canSwim() {
        return false;
    }

    @Override
    public boolean canTraverse() {
        return false;
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    @Override
    public boolean canFly() {
        return false;
    }


    /**
     * Getters and Setters
     */

    public void setMoving(boolean move) {
        isMoving = move;
    }

    public boolean getIsMoving() {
        return isMoving;
    }

    public void setAttacking(boolean attack) {
        isAttacking = attack;
    }

    public boolean getAttacking() {
        return isAttacking;
    }

    public int getAggression() {

        return monsterBrain.getAggression();
    }



    @Override//Originally this was public Stats getStats()
    public CharacterStats getStats() {
        return (CharacterStats)npcStats;
    }


    //AIObserver Notifiers


    public void notifyMove(AINpc aiNpc, Orientation orientation) {
        for(AIObserver observer: observers){
            observer.processMove(this, orientation);
        }
    }

    @Override
    public void notifyThought(AINpc aiNpc) {
        for(AIObserver observer: observers){
            observer.processThought(this);
        }
    }

    @Override
    public void onInteract(Avatar avatar) {

    }
}
