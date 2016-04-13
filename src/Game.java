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

    public Game(){
        this.title = title;
        this.width = width;
        this.height = height;
        //viewport = new Viewport("Testing");
    }

    // Initializes the game
    private void init(){
    }

    private void tick(){

    }

    private void render(){
        // Set to the current state and call the current state view's render
        // currentState = GameState
        // GameState.addKeyListener()
        // GameState.render()
//        display.render();
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


}
