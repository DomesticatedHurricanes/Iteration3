package models.entities;

import models.Interaction.AIObserver;

import models.AI.MonsterBrain;

import models.stats.CharacterStats;
import models.Inventory.Inventory;
import utilities.Point3D;

public class Monster extends AINpc implements Movement {

    private boolean isMoving;
    private boolean isAttacking;
    private MonsterBrain monsterBrain;

    public Monster() {
        this.monsterBrain = new MonsterBrain();
        this.npcStats = new CharacterStats();
        this.inventory = new Inventory(16);
    }

    public void getNewDirection(){
        monsterBrain.changeDirection();
    }

    //called when a monster attacks
    public void attack() {}

    //called when a monster uses a skill
    public void useSkill() {}

    @Override
    public boolean canSwim() {return false;}

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
    *       Getters and Setters
     */

    public void setMoving(boolean move){
        isMoving = move;
    }

    public boolean getIsMoving(){
        return isMoving;
    }

    public void setAttacking(boolean attack){
        isAttacking = attack;
    }

    public boolean getAttacking(){
        return isAttacking;
    }

    public int getAggression(){

        return monsterBrain.getAggression();
    }

    //Add AIObserver
    public void addObserver(AIObserver observer){
        observers.add(observer);
    }

    //AIObserver Notifiers

    @Override
    public void notifyMove(Point3D point3D) {
        for(AIObserver observer: observers){
            observer.processMove(this, point3D);
        }
    }

    @Override
    public void notifyThought() {
        for(AIObserver observer: observers){
            observer.processThought(this);
        }
    }
}

