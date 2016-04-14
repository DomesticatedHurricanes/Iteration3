package models.entities;

import models.AI.MonsterBrain;

import models.stats.CharacterStats;



/**
 * Created by Breanna on 4/13/16.
 * Monster is a hostile NPC in the game
 */

public class Monster extends NPC implements Movement {

    private boolean isMoving;
    private boolean isAttacking;
    private MonsterBrain monsterBrain;
    //private List<Skill> skillsList;

    public Monster() {
        this.monsterBrain = new MonsterBrain();
        this.npcStats = new CharacterStats();
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

}
