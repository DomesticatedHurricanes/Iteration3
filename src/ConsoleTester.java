import models.Map.Map3D;
import models.effects.HemiConicalEffect;
import models.effects.HemiSphericalEffect;
import models.effects.PrismEffect;
import models.effects.RadialEffect;
import utilities.Point3D;

import java.util.ArrayList;

/**
 * Created by ben on 4/14/16.
 */
public class ConsoleTester {
    public static void main(String args[]){
        Map3D map3D = new Map3D(5);
        map3D.testMap();
    }
}
