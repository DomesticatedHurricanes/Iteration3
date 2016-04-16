/**
 * Created by ben on 4/11/16.
 */
import State.StateManager;
import View.View;
import models.effects.RadialEffect;
import utilities.Point3D;
public class RunGame {
    public static void main(String args[]){
        System.out.println("Hello World");
        Point3D point = new Point3D(0,0,3);
        new RadialEffect(point, 2);

        StateManager manager = StateManager.getInstance();
        Game game = new Game(manager);
        game.start();

        View view = new View(manager);
        view.start();

    }
}
