package models.entities;


import models.Interaction.AIObserver;
import utilities.Point3D;

import java.util.ArrayList;

/**
 * Created by Breanna on 4/16/16.
 */
public abstract class AINpc extends NPC {

    protected ArrayList<AIObserver> observers = new ArrayList<>();


    public abstract void notifyMove();
    public abstract void notifyThought();
}
