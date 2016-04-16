package models.entities;


import models.Interaction.Observer;
import utilities.Point3D;

import java.util.ArrayList;

/**
 * Created by Breanna on 4/16/16.
 */
public abstract class AINpc extends NPC {

    protected ArrayList<Observer> observers = new ArrayList<>();


    public abstract void notifyMove(Point3D point3D);
    public abstract void notifyThought();
}
