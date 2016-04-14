import models.effects.HemiSphericalEffect;
import models.effects.PrismEffect;
import models.effects.RadialEffect;
import utilities.Point3D;

import java.util.ArrayList;

/**
 * Created by ben on 4/14/16.
 */
//The purpose of this class is to test backend stuff to make sure it works
public class ConsoleTester {
    public static void main(String args[]){
        System.out.println("Hello World");
        Point3D point = new Point3D(0,0,3);
        new RadialEffect(point, 2);

        PrismEffect prismEffect = new PrismEffect(point,2);
        ArrayList<Point3D> tester = prismEffect.getTilePoints();
        new HemiSphericalEffect(point,1);
        for(int i = 0;i<tester.size();i++){
            System.out.println("X is " + tester.get(i).getX() + "Y is "+tester.get(i).getY()+ " " + tester.get(i).getZ());
        }
    }
}
