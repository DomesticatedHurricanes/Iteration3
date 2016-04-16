package models.entities;

import models.Interaction.AIObserver;
import models.Map.Tile;
import models.stats.LivingStats;
import models.Inventory.Inventory;

import models.AI.PetBrain;
import utilities.Point3D;


/**
 * Created by Breanna on 4/13/16.
 * This class represents the Pet in the game.
 */


public class Pet extends AINpc implements Movement, TileVisitable {
    private LivingStats stats;
    private PetBrain petBrain;

    public Pet() {
        this.petBrain = new PetBrain();
        this.stats = new LivingStats();
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
        return stats;
    }


    //AI functions
    public void makeMove(){

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
