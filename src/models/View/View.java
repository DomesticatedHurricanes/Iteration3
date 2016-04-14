package models.View;

import models.Graphics.GraphicAssets;
import models.Map.Map;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 * Created by Michael on 4/6/16.
 * View is responsible for updating the views
 */
public class View implements Runnable{

    // JFrame is the window

    private JFrame frame;
    private Canvas canvas;
    private String title;
    private Graphics g;
    private BufferStrategy bufferStrategy;
    private Thread thread;
    private boolean running;
    private int width;
    private int height;


    private utilities.Renderer renderer;
    private int mapStartX;
    private int mapStartY;
    private int mapEndX;
    private int mapEndY;

    private Point mapCameraCenter;


    public View(){
        this.title = "Testing";
        this.width = 400;
        this.height = 600;

        createDisplay();
    }

    private void createDisplay(){
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));

        frame.add(canvas);
        frame.pack();

        // Temporary class, the rendering will be moved to the GameStateView
        renderer = new utilities.Renderer(this);

        // Initialize the
        GraphicAssets.init();
    }

    // Called when the thread starts
    private void init(){
        // Render the current state
    }

    public void tick(){
        // Update the current state
    }

    public void render(){
        // Get the current BufferStrategy
        bufferStrategy = canvas.getBufferStrategy();

        // If it hasn't been initialized, set it to 3
        if (bufferStrategy == null){
            canvas.createBufferStrategy(3);
            return;
        }

        g = bufferStrategy.getDrawGraphics();

        // Start drawing the current state's view here
        // Clear the screen
        g.clearRect(0,0,width,height);


        // All of this should be handled in the GameStateView
        // GameStateView.render();
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Start the map in the top left corner.
        mapStartX = 0;
        mapStartY = 0;

        // The end of what we expect to render of the map should either be limited by the size of the map or the size of the viewport (i.e. the window)
        mapEndX = Math.min(9, (int)Math.ceil(height/ GraphicAssets.TILE_PX_WIDTH));
        mapEndY = Math.min(9, (int)Math.ceil(width/ GraphicAssets.TILE_PX_HEIGHT));

        mapCameraCenter = new Point((mapStartX + mapEndX)/2, (mapStartY + mapEndY)/2);

        Map world = new Map(10,10);
        utilities.Renderer.mapRenderer.render(g,world,mapCameraCenter,mapStartX,mapEndX,mapStartY,mapEndY);
        //Renderer.mapRenderer.render2(g,world,mapCameraCenter,mapStartX,mapEndX,mapStartY,mapEndY);
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // End drawing
        bufferStrategy.show();
        g.dispose();
    }

    public int getWidth(){
        return frame.getWidth();
    }

    @Override
    public void run(){

        // Initialize the game
        init();

        // Game loop

        while(running){
            tick();
            render();
        }

        // Stop the thread
        stop();
    }

    public synchronized void start(){
        // If the game is already running, return
        if (running){
            return;
        } else {
            // Set running to true
            running = true;

            // Starts a game thread
            thread = new Thread(this);
            thread.start();
        }

    }

    public synchronized void stop(){
        // If game is already stopped, return
        if (!running){
            return;
        }

        // Set running to false
        running = false;

        // Safely stop the thread
        try{
            thread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public int getHeight(){
        return frame.getHeight();
    }
}
