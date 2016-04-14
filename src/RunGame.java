/**
 * Created by ben on 4/11/16.
 */
<<<<<<< HEAD
import models.effects.HemiSphericalEffect;
import models.effects.PrismEffect;
=======
import models.View.View;
>>>>>>> ca48129a18eac6364e9c63ada7846336954dde57
import models.effects.RadialEffect;
import utilities.Point3D;
public class RunGame {
    public static void main(String args[]){
        System.out.println("Hello World");
        Point3D point = new Point3D(0,0,3);
        new RadialEffect(point, 2);
<<<<<<< HEAD
        new PrismEffect(point,2);
        new HemiSphericalEffect(point,1);
=======

        Game game = new Game();
        game.start();

        View view = new View();
        view.start();

>>>>>>> ca48129a18eac6364e9c63ada7846336954dde57
    }
}
