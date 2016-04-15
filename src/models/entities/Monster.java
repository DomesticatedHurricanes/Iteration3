package models.entities;

import models.stats.Stats;

import models.AI.MonsterBrain;

import models.stats.CharacterStats;


import utilities.Point3D;

/**
 * Created by Breanna on 4/13/16.
 * Monster is a hostile NPC in the game
 */



public class Monster extends NPC implements Movement{
    CharacterStats stats;
    private MonsterBrain monsterBrain;
    private boolean isMoving;
    private boolean isAttacking;

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

