import controllers.ControllerManager;
import State.StateManager;

/**
 * Created by Michael on 3/30/16.
 * Game is the thread responsible for updating the game logic
 */
public class Game implements Runnable {

    private Thread thread;
    private String title;
    private int width;
    private int height;
    private boolean running = false;


    boolean alive;
    private StateManager stateManager;

    //ControllerManager controllerManager;

//    public Game(StateManager stateManager,ControllerManager controllerManager){
//        this.stateManager=stateManager;
//        this.controllerManager=controllerManager;
//        alive=false;
//    }

    public Game(){}

    // Initializes the game
    private void init(){
        stateManager = StateManager.getInstance();
    }

    private void tick(){
        int fps = 60;
        double perTick = 1000000000 / fps;
        double delta = 0;
        long now,then;
        then = System.nanoTime();
        long time = 0;
        int tick = 0;
        now = System.nanoTime();
        delta += (now - then) / perTick;
        time += now - then;
        then = now;

        if( delta>=1 ){System.out.println("tick");
            try{

            }catch(Exception e){

            }
            tick++;
            delta--;
        }

        //currentstateTick

        //catch
        //System.out.println("tick"+tick);
        if(time>1000000000){
            tick = 0;
            time = 0;
        }
    }

    @Override
    public void run(){
        // Initialize the game
        init();

        // Game loop
        while(running){
            tick();
            // call current state tick
            stateManager.updateCurrentState();
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


}
