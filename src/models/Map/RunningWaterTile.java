package models.Map;

import models.Graphics.GraphicAssets;
import models.entities.Avatar;
import models.entities.Entity;
import models.entities.Monster;
import models.entities.Pet;
import utilities.Point3D;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Michael on 4/7/16.
 * RunningWaterTile has a direction and speed to carry an Entity that goes in it
 */
public class RunningWaterTile extends Tile {

    private Entity.Orientation orientation;
    private int speed;
    private Date date = new Date();

    public RunningWaterTile(Point3D point3D, int speed, Entity.Orientation orientation){
        super(point3D);
        this.image = GraphicAssets.RunningWaterTile;
        this.speed = speed;
        this.orientation = orientation;
    }

    public int getSpeed(){
        return speed;
    }


    @Override
    public boolean visit(Avatar avatar) {

        if(this.checkItem() && avatar.canSwim() && checkEntities() && checkHeightDifferential(avatar) && (avatar.isTrapped()==false)){
            System.out.println("inside if conditional");
            this.insertEntity(avatar);
            /*if(avatar.getOrientation() == orientation) {
                avatar.getStats().modifyMovement(speed);
            }*/

            if(timer == null) {
                System.out.println("Creating a new timer");
                timer = new Timer();

                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        moveEntity(avatar);
                    }
                }, 0, 2000);
            }


            applyItems(avatar);
            applyAreaEffect(avatar);
            return true;
        }

        return avatar.canSwim();
    }

    @Override
    public boolean visit(Monster monster) {
        if(this.checkItem() && monster.canSwim() && checkEntities() && checkHeightDifferential(monster) && (monster.isTrapped()==false)){
            this.insertEntity(monster);
            return true;
        }

        return monster.canSwim();
    }

    @Override
    public boolean visit(Pet pet) {
        if(this.checkItem() && pet.canSwim() && checkEntities() && checkHeightDifferential(pet) && (pet.isTrapped()==false)){
            this.insertEntity(pet);
            return true;
        }

        return pet.canSwim();
    }

    @Override
    public String getType() {
        return "Running";
    }

    public boolean canSwim(Entity entity){
        return entity.getStats().getMovement() > speed;
    }

    public void moveEntity(Entity entity) {
        entity.setLocation(orientation.translate(entity.getLocation()));
    }


}
