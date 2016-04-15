package models.entities;

import models.Map.Tile;
import models.stats.LivingStats;

import models.AI.PetBrain;
import utilities.Point3D;


/**
 * Created by Breanna on 4/13/16.
 * This class represents the Pet in the game.
 */

<<<<<<< HEAD
public class Pet extends Entity implements Movement, EntityVisitable {

    private LivingStats petStats;
=======
public class Pet extends NPC implements Movement, TileVisitable {
    private LivingStats stats;
>>>>>>> ea585cf5ba3caaac7cfe11f751c1c0bc8ac30e6d
    private PetBrain petBrain;

    public Pet() {
        this.petBrain = new PetBrain();
        this.stats = new LivingStats();
    }
    @Override
    public boolean accept(Tile tile) {
        return tile.visit(this);
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

<<<<<<< HEAD
    public boolean decideToSteal(){

        return petBrain.decideToSteal();
    }
=======

    @Override
    public LivingStats getStats() {
        return stats;
    }


    //AI functions
    public void makeMove(){
        notifyMove(petBrain.generateMove());
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


>>>>>>> ea585cf5ba3caaac7cfe11f751c1c0bc8ac30e6d
}
