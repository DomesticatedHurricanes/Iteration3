
import models.effects.AngularEffect;

import models.Map.Map3D;

import models.effects.HemiConicalEffect;
import models.effects.LinearEffect;
import models.entities.Entity;
import utilities.Point3D;

import java.util.ArrayList;

/**
 * Created by ben on 4/14/16.
 */
public class ConsoleTester {
    public static void main(String args[]){

        Point3D point = new Point3D(0,0,0);
        HemiConicalEffect hemiConicalEffect= new HemiConicalEffect(point,3, Entity.Orientation.NORTH);
        ArrayList<Point3D> arrayList = hemiConicalEffect.getTilePoints();
        for(Point3D i:arrayList){
            System.out.println(i.getX()+ " "+ i.getY()+" "+i.getZ());
        }

        Map3D map3D = new Map3D(5);
        map3D.testMap();

    }
}
