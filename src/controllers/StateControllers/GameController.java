package controllers.StateControllers;

import controllers.Controller;

import javax.swing.*;

/**
 * Created by ben on 4/12/16.
 */
public class GameController extends Controller {
    public GameController(JFrame jFrame){
        super(jFrame);
    }

    @Override
    public void addJFrame(JFrame jFrame){
        this.jFrame = jFrame;
    }

    @Override
    public void update() {

    }
}
