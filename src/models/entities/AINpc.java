package models.entities;


import models.Interaction.AIObserver;
import utilities.Point3D;

import java.util.ArrayList;

/**
 * Created by Breanna on 4/16/16.
 */
public abstract class AINpc extends NPC {

    protected ArrayList<AIObserver> observers = new ArrayList<>();


    //Add Observer
    public void addObserver(AIObserver observer){
        observers.add(observer);
    }
    public abstract void notifyMove(AINpc aiNpc);
    public abstract void notifyThought(AINpc aiNpc);
}
