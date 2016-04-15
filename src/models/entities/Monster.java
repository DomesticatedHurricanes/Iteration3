package models.entities;

import models.Interaction.Observer;

import models.AI.MonsterBrain;

import models.stats.CharacterStats;



import models.stats.Stats;
import utilities.Point3D;

public class Monster extends NPC implements Movement {

    private boolean isMoving;
    private boolean isAttacking;
    CharacterStats stats;
    private MonsterBrain monsterBrain;

    public Monster() {
        this.monsterBrain = new MonsterBrain();
        this.stats = new CharacterStats();
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

    @Override
    public Stats getStats() {
        return stats;
    }

    //Add Observer
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    //Observer Notifiers

    @Override
    public void notifyMove(Point3D point3D) {
        for(Observer observer: observers){
            observer.processMove(this, point3D);
        }
    }

    @Override
    public void notifyThought() {
        for(Observer observer: observers){
            observer.processThought(this);
        }
    }
}

