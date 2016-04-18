/**
 * Created by ben on 4/11/16.
 */
import State.StateManager;
import View.View;
import models.AreaEffect.AreaEffect;
import models.AreaEffect.LevelUp;
import models.Graphics.GraphicAssets;
import models.effects.RadialEffect;
import models.entities.Avatar;
import models.entities.occupation.Smasher;
import utilities.Point3D;

import javax.swing.*;
import java.awt.*;

public class RunGame {
    public static void main(String args[]){
        System.out.println("Hello World");
        Point3D point = new Point3D(0,0,3);
        new RadialEffect(point, 2);

        //making a frame
        //utilities.Renderer renderer;
        String title = "testing";

        int width= GraphicAssets.VIEW_WIDTH;
        int height= GraphicAssets.VIEW_HEIGHT;


        JFrame frame;
        Canvas canvas;
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(true);
        frame.setFocusable(true);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));
        canvas.setFocusable(true);
        frame.add(canvas);
        //frame.getRootPane().add(canvas, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.pack();

        // TODO Remove this and put in
        // Temporary class, the rendering will be moved to the GameStateView
        //renderer = new utilities.Renderer(this);

        // Initialize the
        GraphicAssets.init();

        //made a frame
        StateManager manager = StateManager.getInstance(frame);
        Game game = new Game(manager);
        game.start();

        View view = new View(manager,frame,canvas);
        view.start();

    }
}
