package models.Item;

import models.entities.Avatar;
import models.entities.Entity;
import models.entities.Pet;

import java.awt.image.BufferedImage;

/**
 * Created by mazumderm on 4/13/2016.
 */
public abstract class Item {

    protected BufferedImage image;
    String name;
    BufferedImage bufferedImage;

    //constructor
    public Item(String name, BufferedImage bufferedImage){
        this.name = name;
        this.bufferedImage = bufferedImage;
    }

    public String getName(){
        return this.name;
    }

    public abstract boolean onTouch();

    public abstract void apply(Entity entity);

    public BufferedImage getImage() {
        return this.bufferedImage;
    }
}
