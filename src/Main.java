import Model.View;

/**
 * Created by Michael on 3/30/16.
 * Main is responsible for creating the Game and View thread.
 */
public class Main {

    public static void main(String[] args){
        Game game = new Game();
        game.start();

        View view = new View();
        view.start();
    }
}
