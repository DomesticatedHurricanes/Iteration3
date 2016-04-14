package models.Interaction;

import models.Map.Map;
import models.entities.Entity;
import models.entities.Vehicle;

/**
 * Created by Nicole on 4/14/16.
 */
public class VehicleInteractionHandler extends InteractionHandler{

    public VehicleInteractionHandler(Vehicle vehicle, Map map){
        this.entity = vehicle;
        this.map = map;
    }

    protected void tileInteraction(Entity entity){

    }
}
