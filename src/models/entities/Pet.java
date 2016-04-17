package models.entities;

import models.Interaction.AIObserver;
import models.Map.Tile;
import models.stats.LivingStats;
import models.stats.Stats;
import models.Inventory.Inventory;

import models.AI.PetBrain;
import utilities.Point3D;
import models.entities.defaultNpcStat.NPCInitialStats;
import models.entities.defaultNpcStat.PetStats;

/**
 * Created by Breanna on 4/13/16.
 * This class represents the Pet in the game.
 */


public class Pet extends AINpc implements Movement, TileVisitable {

    private PetBrain petBrain;
    private NPCInitialStats initialStats;

    public Pet() {
        this.petBrain = new PetBrain();
        this.npcStats = new LivingStats();
        initialStats = new PetStats();
        initialStats.initStats(npcStats);
        this.inventory = new Inventory(16);
    }
    @Override
    public boolean accept(Tile tile) {
        return tile.visit(this);
    }


    //Movement booleans
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

    public boolean decideToSteal(){

        return petBrain.decideToSteal();
    }

    @Override
    public LivingStats getStats() {
        return (LivingStats)npcStats;
    }


    //AI functions
    public void makeMove(){
       // notifyMove(petBrain.changeDirection());

    }


    //Add AIObserver
    public void addObserver(AIObserver aiObserver){
        observers.add(aiObserver);
    }

    //AIObserver Notifiers

    @Override
    public void notifyMove(AINpc aiNpc) {
        for(AIObserver observer: observers){
            observer.processMove(this);
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
