package models.entities;

import models.Interaction.Observer;
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
    private NPCInitialStats initialStats;
    private PetBrain petBrain;

    public Pet() {
        this.petBrain = new PetBrain();
        this.npcStats = new LivingStats();
        this.initialStats = new PetStats();
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

    @Override
    public String getType() {
        return "Pet";
    }
}
