import models.effects.RadialEffect;
import utilities.Point3D;

/**
 * Created by ben on 4/14/16.
 */
public class ConsoleTester {
    public static void main(String args[]){
        System.out.println("Hello World");
        Point3D point = new Point3D(0,0,3);
        new RadialEffect(point, 2);
    }
}
