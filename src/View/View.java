package View;

import State.State;
import State.StateManager;
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

    private StateManager stateManager;
    private JFrame jFrame;
    public View(StateManager manager, JFrame jFrame, Canvas canvas){
        this.stateManager = manager;
        this.title = "Testing";
        this.width = 400;
        this.height = 600;
        this.frame=jFrame;
        this.canvas=canvas;
        renderer = new utilities.Renderer(this);
        //createDisplay();
        //manager.setJframe(frame);
    }

    private void createDisplay(){
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(true);
        frame.setFocusable(true);
        //frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));

        frame.add(canvas);
        frame.pack();

        // TODO Remove this and put in
        // Temporary class, the rendering will be moved to the GameStateView
        renderer = new utilities.Renderer(this);

        // Initialize the
        GraphicAssets.init();
    }

    // Called when the thread starts
    private void init(){
        // Statemanager has all of the states
//        stateManager = StateManager.getInstance();

        // Render the current state
        long startingTime = System.currentTimeMillis();

        long finishingTime = System.currentTimeMillis();

        double delta = startingTime-finishingTime;
        if(delta<40){
            try {
                Thread.sleep(((long) (40 - delta)));
            } catch(InterruptedException exception){

            }
        }
        else{
            System.out.println("something fucked up , call the police! (view)");
        }
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

        // Clear the screen
        g.clearRect(0,0,width,height);

        // Start drawing the current state's view here
        stateManager.renderCurrentState(g);
        //System.out.println("View: Frame :" + frame);
        //stateManager.addJFrameToCurrentState(frame);

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
