package models.entities;

import models.Interaction.Observer;
import models.Map.Tile;
import models.stats.LivingStats;
import models.Inventory.Pack;

import models.AI.PetBrain;
import utilities.Point3D;


/**
 * Created by Breanna on 4/13/16.
 * This class represents the Pet in the game.
 */


public class Pet extends AINpc implements Movement, TileVisitable {
    private LivingStats stats;
    private PetBrain petBrain;
    private Pack pack;

    public Pet() {
        this.petBrain = new PetBrain();
        this.stats = new LivingStats();
        this.pack = new Pack(5); //a pet can steal up to five items
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
