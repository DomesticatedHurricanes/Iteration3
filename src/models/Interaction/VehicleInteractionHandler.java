package models.Interaction;

import models.Map.Map;
import models.entities.Entity;
import models.entities.Vehicle;

/**
 * Created by Nicole on 4/14/16.
 */
public class VehicleInteractionHandler extends InteractionHandler{

    private Vehicle vehicle;

    public VehicleInteractionHandler(Vehicle vehicle, Map map){
        this.vehicle = vehicle;
        this.map = map;
    }

    public void updateVehiclePos(){

    }

    protected void tileInteraction(Entity entity){

    }
}
