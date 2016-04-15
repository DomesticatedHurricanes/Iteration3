package View.StateViews;

import View.View;
import models.Graphics.GraphicAssets;
import models.Map.Map;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 * Created by Michael on 4/14/16.
 */
public class GameStateView  {
    private Graphics g;

    private int mapStartX;
    private int mapStartY;
    private int mapEndX;
    private int mapEndY;
    private Point mapCameraCenter;

    private Map map;

    public GameStateView(){
        this.map = new Map(9,9);
        this.g = g;
        init();
    }

    private void init(){
        this.map.initializeMap(10,10);
        System.out.println("In game view");
    }

    public void render(Graphics g){
        // Get the current BufferStrategy

        System.out.println("Printing gameview");


        // All of this should be handled in the GameStateView
        // GameStateView.render();
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Start the map in the top left corner.
        mapStartX = 0;
        mapStartY = 0;

        // The end of what we expect to render of the map should either be limited by the size of the map or the size of the viewport (i.e. the window)
        mapEndX = Math.min(9, (int)Math.ceil(400/ GraphicAssets.TILE_PX_WIDTH));
        mapEndY = Math.min(9, (int)Math.ceil(600/ GraphicAssets.TILE_PX_HEIGHT));

        mapCameraCenter = new Point((mapStartX + mapEndX)/2, (mapStartY + mapEndY)/2);

        Map world = new Map(10,10);
        utilities.Renderer.mapRenderer.render(g,world,mapCameraCenter,mapStartX,mapEndX,mapStartY,mapEndY);
        //Renderer.mapRenderer.render2(g,world,mapCameraCenter,mapStartX,mapEndX,mapStartY,mapEndY);
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // End drawing
//        g.dispose();

    }

}
