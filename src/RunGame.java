/**
 * Created by ben on 4/11/16.
 */

import models.effects.HemiSphericalEffect;
import models.effects.PrismEffect;

import models.View.View;

import models.effects.RadialEffect;
import utilities.Point3D;
public class RunGame {
    public static void main(String args[]){



        Game game = new Game();
        game.start();

        View view = new View();
        view.start();


    }
}
