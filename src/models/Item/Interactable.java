package models.Item;

/**
 * Created by mazumderm on 4/13/2016.
 */
public class Interactable extends Item {

    private boolean isActivated;

    public Interactable(){

    }

    public boolean getActivated(){
        return this.isActivated;
    }

    public void onTouch(){

    }
}
